package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.CmdRetorneContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_tipoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Parcela_unarioContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.VariavelContext;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.ParametroContext;

public class AlgumaSemantico extends AlgumaBaseVisitor {
    PilhaTabelas pilhadeTabelas = new PilhaTabelas(TabelaDeSimbolos.TipoAlguma.Void);
    
    @Override
    public Object visitPrograma(AlgumaParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    //tratamento para declaracao de tipo
    @Override
    public Object visitDeclaracao_tipo(Declaracao_tipoContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        
        //verifica se ja esta no escopo
        if (escopoAtual.existe(ctx.IDENT().getText())) {
             AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " declarado duas vezes num mesmo escopo");
        } else {
            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());
            
            if (tipo != null) {
                escopoAtual.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.Estrutura.tipo);
            } else if (ctx.tipo().registro() != null) {
                ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> varReg = new ArrayList<>();
                for (VariavelContext va : ctx.tipo().registro().variavel()) {
                    TabelaDeSimbolos.TipoAlguma tipoRegistroAlguma =  AlgumaSemanticoUtils.getTipo(va.tipo().getText());
                    
                    for (IdentificadorContext id2 : va.identificador()) {
                        varReg.add(escopoAtual.new EntradaTabelaDeSimbolos(id2.getText(), tipoRegistroAlguma, TabelaDeSimbolos.Estrutura.tipo));
                    }
                }
                
                String nameVar = ctx.IDENT().getText();
                
                //verifica se ja foi declarado
                if (escopoAtual.existe (nameVar)) {
                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nameVar + " ja declarado anteriormente");
                }
                else  {
                    escopoAtual.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.TipoAlguma.reg, TabelaDeSimbolos.Estrutura.tipo);
                }


                for (TabelaDeSimbolos.EntradaTabelaDeSimbolos re : varReg) {
                    String nomeIdentificador = ctx.IDENT().getText() + '.' + re.nome;
                    
                    if (escopoAtual.existe(nomeIdentificador)) {
                        AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nameVar + " ja declarado anteriormente");
                    } else {
                        escopoAtual.adicionar(re);
                        escopoAtual.adicionar(ctx.IDENT().getText(), re);
                    }
                }
            }
            TabelaDeSimbolos.TipoAlguma t =  AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());
            escopoAtual.adicionar(ctx.IDENT().getText(), t, TabelaDeSimbolos.Estrutura.tipo);
        }
        return super.visitDeclaracao_tipo(ctx);
    }

    //tratamento para declaracao de variavel
    @Override
    public Object visitDeclaracao_variavel(Declaracao_variavelContext ctx) {
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
                    escopoAtual.adicionar(nomeId, tipo, TabelaDeSimbolos.Estrutura.var);
                } else {
                    TerminalNode identTipo =    ctx.variavel().tipo() != null
                                                && ctx.variavel().tipo().tipo_estendido() != null 
                                                && ctx.variavel().tipo().tipo_estendido().tipo_basico_ident() != null  
                                                && ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().IDENT() != null 
                                                ? ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().IDENT() : null;
                    
                    if(identTipo != null){
                        ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> regVars = null;
                        boolean found = false;
                        
                        for(TabelaDeSimbolos t: pilhadeTabelas.getPilha()){
                            if(!found){
                                if(t.existe(identTipo.getText())){
                                    regVars = t.getTypeProperties(identTipo.getText());
                                    found = true;
                                }
                            }
                        }

                        if (escopoAtual.existe(nomeId)) {
                            
                            AlgumaSemanticoUtils.adicionarErroSemantico(id.start, "identificador " + nomeId + " ja declarado anteriormente");
                        
                        } else {
                            escopoAtual.adicionar(nomeId, TabelaDeSimbolos.TipoAlguma.reg, TabelaDeSimbolos.Estrutura.var);
                            
                            for(TabelaDeSimbolos.EntradaTabelaDeSimbolos s: regVars){
                                escopoAtual.adicionar(nomeId + "." + s.nome, s.tipo, TabelaDeSimbolos.Estrutura.var);
                            }   
                        }
                        
                    } else if (ctx.variavel().tipo().registro() != null) {
                        ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> varReg = new ArrayList<>();
                        
                        for (VariavelContext va : ctx.variavel().tipo().registro().variavel()){
                            TabelaDeSimbolos.TipoAlguma tipoReg =  AlgumaSemanticoUtils.getTipo(va.tipo().getText());
                            
                            for (IdentificadorContext id2 : va.identificador()) {
                                varReg.add(escopoAtual.new EntradaTabelaDeSimbolos(id2.getText(), tipoReg, TabelaDeSimbolos.Estrutura.var));
                            }
                        }  
                        escopoAtual.adicionar(nomeId, TabelaDeSimbolos.TipoAlguma.reg, TabelaDeSimbolos.Estrutura.var);

                        for (TabelaDeSimbolos.EntradaTabelaDeSimbolos re : varReg) {
                            String nameVar = nomeId + '.' + re.nome;
                            
                            if (escopoAtual.existe(nameVar)) {
                                AlgumaSemanticoUtils.adicionarErroSemantico(id.start, "identificador " + nameVar + " ja declarado anteriormente");
                            } else {
                                escopoAtual.adicionar(re);
                                escopoAtual.adicionar(nameVar, re.tipo, TabelaDeSimbolos.Estrutura.var);
                            }
                        }
                    } else {//tratamento para tipo registro estendido e tipo desconhecido
                        // TabelaDeSimbolos.TipoAlguma tipo_estendido =  AlgumaSemanticoUtils.getTipo(ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().getText());
                        
                        // if (tipo_estendido != null) {
                        //     escopoAtual.adicionar(nomeId, tipo_estendido, TabelaDeSimbolos.Estrutura.var);
                        // } else {
                        //     escopoAtual.adicionar(nomeId, TipoAlguma.invalido, TabelaDeSimbolos.Estrutura.var);
                        // }
                        escopoAtual.adicionar(id.getText(), TabelaDeSimbolos.TipoAlguma.inteiro, TabelaDeSimbolos.Estrutura.var);
                    }
                }
            }
        }
        return super.visitDeclaracao_variavel(ctx);
    }

    @Override
    public Object visitDeclaracao_global(Declaracao_globalContext ctx) {
        TabelaDeSimbolos escopoAtual = pilhadeTabelas.getPilhaTabelas();
        Object retorno;
        if (escopoAtual.existe(ctx.IDENT().getText())) {
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, ctx.IDENT().getText() + " ja declarado anteriormente");
            retorno = super.visitDeclaracao_global(ctx);
        } else {
            TabelaDeSimbolos.TipoAlguma returnTypeFuncAlguma = TabelaDeSimbolos.TipoAlguma.Void;

            if (ctx.getText().startsWith("funcao")) {
                returnTypeFuncAlguma = AlgumaSemanticoUtils.getTipo(ctx.tipo_estendido().getText());
                escopoAtual.adicionar(ctx.IDENT().getText(), returnTypeFuncAlguma,TabelaDeSimbolos.Estrutura.func);
            } else {
                returnTypeFuncAlguma = TabelaDeSimbolos.TipoAlguma.Void;
                escopoAtual.adicionar(ctx.IDENT().getText(), returnTypeFuncAlguma,TabelaDeSimbolos.Estrutura.proc);
            }

            pilhadeTabelas.create(returnTypeFuncAlguma);
            TabelaDeSimbolos escopoGlobal = escopoAtual;
            
            escopoAtual = pilhadeTabelas.getPilhaTabelas();
            if (ctx.parametros() != null) {
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
                            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador1 " + nomeIdentificador + " ja declarado anteriormente");
                        } else {
                            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(parametro.tipo_estendido().getText());

                            if (tipo != null) {
                                EntradaTabelaDeSimbolos entrada = escopoAtual.new EntradaTabelaDeSimbolos(nomeIdentificador, tipo, TabelaDeSimbolos.Estrutura.var);
                                escopoAtual.adicionar(entrada);
                                escopoGlobal.adicionar(ctx.IDENT().getText(), entrada);

                            } else {
                                TerminalNode identTipo =    parametro.tipo_estendido().tipo_basico_ident() != null  
                                                            && parametro.tipo_estendido().tipo_basico_ident().IDENT() != null 
                                                            ? parametro.tipo_estendido().tipo_basico_ident().IDENT() : null;
                                if (identTipo != null) {
                                    ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> regVars = null;
                                    boolean found = false;
                                    
                                    for(TabelaDeSimbolos t: pilhadeTabelas.getPilha()){
                                        if(!found){
                                            if(t.existe(identTipo.getText())){
                                                regVars = t.getTypeProperties(identTipo.getText());
                                                found = true;
                                            }
                                        }
                                    }

                                    if(escopoAtual.existe(nomeIdentificador)){
                                        AlgumaSemanticoUtils.adicionarErroSemantico(identificador.start, "identificador2 " + nomeIdentificador + " ja declarado anteriormente");
                                    } else {
                                        EntradaTabelaDeSimbolos entrada = escopoAtual.new EntradaTabelaDeSimbolos(nomeIdentificador, TabelaDeSimbolos.TipoAlguma.reg, TabelaDeSimbolos.Estrutura.var);
                                        escopoAtual.adicionar(entrada);
                                        escopoGlobal.adicionar(ctx.IDENT().getText(), entrada);

                                        for(TabelaDeSimbolos.EntradaTabelaDeSimbolos s: regVars){
                                            escopoAtual.adicionar(nomeIdentificador + "." + s.nome, s.tipo, TabelaDeSimbolos.Estrutura.var);
                                        }   
                                    }
                                }
                            }
                        }
                    }
                }
            }
            retorno = super.visitDeclaracao_global(ctx);
            pilhadeTabelas.dropPilhaTabelas();
        }
        return retorno;
    }

    //tratamento para declaracao de constante
    @Override
    public Object visitDeclaracao_constante(Declaracao_constanteContext ctx) {
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
            
            escopoAtual.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.Estrutura.constante);
        }

        return super.visitDeclaracao_constante(ctx);
    }

    //tratamento para tipo-basico
    @Override
    public Object visitTipo_basico_ident(AlgumaParser.Tipo_basico_identContext ctx) {

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
    @Override
    public Object visitIdentificador(IdentificadorContext ctx) {
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
    public Object visitCmdAtribuicao(CmdAtribuicaoContext ctx) {
        TabelaDeSimbolos.TipoAlguma tipoExpressao = AlgumaSemanticoUtils.verificarTipo(pilhadeTabelas, ctx.expressao());
        boolean error = false;
        String pointerChar = ctx.getText().charAt(0) == '^' ? "^" : "";
        String nomeIdentificador = "";
        int i = 0;

        for (TerminalNode id : ctx.identificador().IDENT()){
            //tipo registro
            if (i++ > 0)
                nomeIdentificador += ".";
            nomeIdentificador += id.getText();
        }
        //se o tipo nao for invalido
        if (tipoExpressao != TabelaDeSimbolos.TipoAlguma.invalido) {
            
            boolean found = false;
            
            //verifica se a atribuicao e o tipo sao compativeis
            //variavel real recebe valor real e variavel inteiro recebe valor inteiro
            for (TabelaDeSimbolos escopo : pilhadeTabelas.getPilha()){
                if (escopo.existe(nomeIdentificador) && !found)  {
                    found = true;
                    TabelaDeSimbolos.TipoAlguma tipoVariavel = AlgumaSemanticoUtils.verificarTipo(pilhadeTabelas, nomeIdentificador);
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
            nomeIdentificador = ctx.identificador().getText();
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start, "atribuicao nao compativel para " + pointerChar + nomeIdentificador );
        }

        return super.visitCmdAtribuicao(ctx);
    }

    //tratamento para comando de retorno
    @Override
    public Object visitCmdRetorne(CmdRetorneContext ctx) {
        
        //verifica se o comando de retorno esta no escopo correto
        if (pilhadeTabelas.getPilhaTabelas().returnType == TabelaDeSimbolos.TipoAlguma.Void){
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "comando retorne nao permitido nesse escopo");
        } 
        
        return super.visitCmdRetorne(ctx);
    }

    //tratamento para parcela unario
    @Override
    public Object visitParcela_unario(Parcela_unarioContext ctx) {
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
}