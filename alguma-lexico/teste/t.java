package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.CmdRetorneContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_tipoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Parcela_unarioContext;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoAlguma;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.ParametroContext;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    TabelaDeSimbolos tabela;

    PilhaTabelas pilhadeTabelas = new PilhaTabelas(TabelaDeSimbolos.TipoAlguma.Void);
    
    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    //tratamento para declaracao de tipo
    @Override
    public Void visitDeclaracao_tipo(Declaracao_tipoContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        
        //verifica se ja esta no escopo
        if (escopoAtual.existe(ctx.IDENT().getText())) {
             AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " declarado duas vezes num mesmo escopo");
        } else {
            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());
            
            if (tipo != null) {
                escopoAtual.adicionar(ctx.IDENT().getText(), tipo);
            } else {
                String nameVar = ctx.IDENT().getText();
                
                //verifica se ja foi declarado
                if (escopoAtual.existe (nameVar)) {
                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nameVar + " ja declarado anteriormente");
                }
                else {
                    escopoAtual.adicionar(ctx.IDENT().getText(), TipoAlguma.invalido);
                }
            }
            TabelaDeSimbolos.TipoAlguma t =  AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());
            escopoAtual.adicionar(ctx.IDENT().getText(), t);
        }
        return super.visitDeclaracao_tipo(ctx);
    }

    //tratamento para declaracao de variavel
    @Override
    public Void visitDeclaracao_variavel(Declaracao_variavelContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        
        for (IdentificadorContext id : ctx.variavel().identificador()) {
            String nomeId = "";
            int i = 0;
            
            for (TerminalNode ident : id.IDENT()) {
                if (i++ > 0){
                    nomeId += ".";
                }
                nomeId += ident.getText();
            }
            
            //verifica se ja foi declarado
            if (escopoAtual.existe(nomeId)) {
                AlgumaSemanticoUtils.adicionarErroSemantico(id.start, "identificador " + nomeId + " ja declarado anteriormente");
            } else {
                TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.variavel().tipo().getText());
                
                if (tipo != null) {
                    escopoAtual.adicionar(nomeId, tipo);
                } else {
                    
                    TabelaDeSimbolos.TipoAlguma tipo_estendido =  AlgumaSemanticoUtils.getTipo(ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().getText());
                    
                    if (tipo_estendido != null) {

                        escopoAtual.adicionar(nomeId, tipo_estendido);
                    } else {
                        escopoAtual.adicionar(nomeId, TipoAlguma.invalido);
                    }
                    
                }
            }
        }
        return super.visitDeclaracao_variavel(ctx);
    }

    //tratamento para declaracao de constante
    @Override
    public Void visitDeclaracao_constante(Declaracao_constanteContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        
        //verifica se ja foi declarado
        if (escopoAtual.existe(ctx.IDENT().getText())) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "constante" + ctx.IDENT().getText() + " ja declarado anteriormente");
        } else {
            TabelaDeSimbolos.TipoAlguma tipo = TabelaDeSimbolos.TipoAlguma.inteiro;
            TabelaDeSimbolos.TipoAlguma aux = AlgumaSemanticoUtils.getTipo(ctx.tipo_basico().getText()) ;
            
            if (aux != null){
                tipo = aux;
            }
            
            escopoAtual.adicionar(ctx.IDENT().getText(), tipo);
        }

        return super.visitDeclaracao_constante(ctx);
    }

    //tratamento para tipo-basico
    @Override
    public Void visitTipo_basico_ident(AlgumaParser.Tipo_basico_identContext ctx) {

        if (ctx.IDENT() != null) {
           
            boolean existe = false;
            
            //verifica se o tipo ja foi declarado pela tabela de simbolos
            for (TabelaDeSimbolos tabela : pilhadeTabelas.getPilha()) {
                if (tabela.existe(ctx.IDENT().getText())) {
                    existe = true;
                }
            }

            if (!existe) {
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " nao declarado");
            }
        }

        return super.visitTipo_basico_ident(ctx);
    }

    //tratamento para identificador
    public Void visitIdentificador(IdentificadorContext ctx) {
        String nomeVar = "";
        int i = 0;
        
        for (TerminalNode id : ctx.IDENT()){
            if (i++ > 0)
                nomeVar += ".";
            nomeVar += id.getText();
        }
        
        boolean erro = true;
        
        //verifica se o identificador ja foi declarado pela tabela de simbolos
        for (TabelaDeSimbolos escopo : pilhadeTabelas.getPilha()) {

            if (escopo.existe(nomeVar)) {
                erro = false;
            }
        }
        if (erro)
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeVar + " nao declarado");
        return super.visitIdentificador(ctx);
    }

    //tratamento para comando de atribuição
    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        TabelaDeSimbolos.TipoAlguma tipoExpressao = AlgumaSemanticoUtils.verificarTipo(pilhadeTabelas, ctx.expressao());
        boolean error = false;
        String pointerChar = ctx.getText().charAt(0) == '^' ? "^" : "";
        String nomeVar = "";
        int i = 0;

        for (TerminalNode id : ctx.identificador().IDENT()){
                        //tipo registro
            nomeVar += id.getText();
        }
        //se o tipo nao for invalido
        if (tipoExpressao != TabelaDeSimbolos.TipoAlguma.invalido) {
            
            boolean found = false;
            
            //verifica se a atribuicao e o tipo sao compativeis
            //variavel real recebe valor real e variavel inteiro recebe valor inteiro
            for (TabelaDeSimbolos escopo : pilhadeTabelas.getPilha()){
                if (escopo.existe(nomeVar) && !found)  {
                    found = true;
                    TabelaDeSimbolos.TipoAlguma tipoVariavel = AlgumaSemanticoUtils.verificarTipo(pilhadeTabelas, nomeVar);
                    Boolean varNumeric = tipoVariavel == TabelaDeSimbolos.TipoAlguma.real || tipoVariavel == TabelaDeSimbolos.TipoAlguma.inteiro;
                    Boolean expNumeric = tipoExpressao == TabelaDeSimbolos.TipoAlguma.real || tipoExpressao == TabelaDeSimbolos.TipoAlguma.inteiro;
                    
                    if (!(varNumeric && expNumeric) && tipoVariavel != tipoExpressao && tipoExpressao != TabelaDeSimbolos.TipoAlguma.invalido) {
                        error = true;
                    }
                } 
            }
        } else {
            error = true;
        }

        if (error) {
            nomeVar = ctx.identificador().getText();
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "atribuicao nao compativel para " + pointerChar + nomeVar );
        }

        return super.visitCmdAtribuicao(ctx);
    }

    //tratamento para comando de retorno
    @Override
    public Void visitCmdRetorne(CmdRetorneContext ctx) {
        
        //verifica se o comando de retorno esta no escopo correto
        if (pilhadeTabelas.getPilhaTabelas().returnType == TabelaDeSimbolos.TipoAlguma.Void){
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "comando retorne nao permitido nesse escopo");
        } 
        
        return super.visitCmdRetorne(ctx);
    }

    //tratamento para parcela unario
    @Override
    public Void visitParcela_unario(Parcela_unarioContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        
        if (ctx.IDENT() != null) {
            String name = ctx.IDENT().getText();
            
            if (escopoAtual.existe(ctx.IDENT().getText())) {
                List<EntradaTabelaDeSimbolos> params = escopoAtual.getTypeProperties(name);
                boolean error = false;
                
                if (params.size() != ctx.expressao().size()) {
                    error = true;
                } else {
                    for(int i = 0; i < params.size(); i++){
                        if(params.get(i).tipo != AlgumaSemanticoUtils.verificarTipo(pilhadeTabelas, ctx.expressao().get(i))){
                            error = true;
                        }
                    }
                }
                
                if (error) {
                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "incompatibilidade de parametros na chamada de " + name);
                }
            }
        }

        return super.visitParcela_unario(ctx);
    }

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();

        if (escopoAtual.existe(ctx.IDENT().getText())) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, ctx.IDENT().getText() + " ja declarado anteriormente");
        } else {
            
            if (ctx.getText().startsWith("funcao")) {
                escopoAtual.adicionar(ctx.IDENT().getText(), escopoAtual.TipoAlguma.func);
            } else {
                escopoAtual.adicionar(ctx.IDENT().getText(), escopoAtual.TipoAlguma.proc);
            }

            TabelaDeSimbolos escopoGlobal = escopoAtual;

            escopoAtual = pilhadeTabelas.getPilhaTabelas();

            if (ctx.parametros != null) {
                for (ParametroContext parametro : ctx.parametros().parametro()) {
                    for (IdentificadorContext identificador : parametro.identificador()) {
                        String nomeIdentificador = "";
                        int i = 0;
                        
                        for (TerminalNode ident : identificador.IDENT()) {
                            if (i++ >= 1) {
                                nomeIdentificador += ".";
                            }
                            nomeIdentificador += ident.getText();
                        }

                        if (escopoAtual.existe(nomeIdentificador)) {
                            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeIdentificador + " ja declarado anteriormente");
                        } else {
                            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(parametro.tipo_estendido.getText());

                            if(tipo != null) {
                                escopoAtual.adicionar(nomeIdentificador, tipo);
                                escopoGlobal.adicionar(ctx.IDENT().getText(), tipo);

                            } else {
                                //tipo estendido e invalido
                                //  TabelaDeSimbolos.TipoAlguma tipo_estendido =  AlgumaSemanticoUtils.getTipo(ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().getText());

                                // if (tipo_estendido != null) {

                                //     escopoAtual.adicionar(nomeId, tipo_estendido);
                                // } else {
                                //     //tipo registro
                                // }
                            }
                        }
                    }
                }
            }
        }

        return super.visitDeclaracao_global(ctx);
    }
}