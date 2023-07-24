package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Termo_logicoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Exp_aritmeticaContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.ExpressaoContext;
import br.ufscar.dc.compiladores.alguma.lexico.AlgumaParser.Fator_logicoContext;

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhaTabelas, AlgumaParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        
        for (Termo_logicoContext tc : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhaTabelas, tc);
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.invalido) {
                ret = TabelaDeSimbolos.TipoAlguma.invalido;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        
        for (Fator_logicoContext tc : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, tc);
            
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.invalido) {
                ret = TabelaDeSimbolos.TipoAlguma.invalido;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Fator_logicoContext ctx) {

        return verificarTipo(pilhadeTabelas, ctx.parcela_logica());
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Parcela_logicaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        if (ctx.exp_relacional() != null) {
            ret = verificarTipo(pilhadeTabelas, ctx.exp_relacional());
        } else {
            ret = TabelaDeSimbolos.TipoAlguma.logico;
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        if (ctx.op_relacional() != null) {
            
            for (Exp_aritmeticaContext ta : ctx.exp_aritmetica()) {
                TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, ta);
                Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.real || aux == TabelaDeSimbolos.TipoAlguma.inteiro; //casos numericos inteiros e reais se correlacionam
                Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.real || ret == TabelaDeSimbolos.TipoAlguma.inteiro;
                if (ret == null) {
                    ret = aux;
                } else  if (!(auxNumeric && retNumeric) && aux != ret) {
                    ret = TabelaDeSimbolos.TipoAlguma.invalido;
                }
            }
            
            if (ret != TabelaDeSimbolos.TipoAlguma.invalido) {
                ret = TabelaDeSimbolos.TipoAlguma.logico;
            }
        } else {
            ret = verificarTipo(pilhadeTabelas, ctx.exp_aritmetica(0));
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (var fa : ctx.termo()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.invalido) {
                ret = TabelaDeSimbolos.TipoAlguma.invalido;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, fa);
            Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.real || aux == TabelaDeSimbolos.TipoAlguma.inteiro; //casos numericos inteiros e reais se correlacionam
            Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.real || ret == TabelaDeSimbolos.TipoAlguma.inteiro;
            if (ret == null) {
                ret = aux;
            } else if (!(auxNumeric && retNumeric) && aux != ret) {
                ret = TabelaDeSimbolos.TipoAlguma.invalido;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (var fa : ctx.parcela()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.invalido) {
                ret = TabelaDeSimbolos.TipoAlguma.invalido;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.ParcelaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = TabelaDeSimbolos.TipoAlguma.invalido;

        if (ctx.parcela_nao_unario() != null) {
            ret = verificarTipo(pilhadeTabelas, ctx.parcela_nao_unario());
        }
        else {
            ret = verificarTipo(pilhadeTabelas, ctx.parcela_unario());
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Parcela_nao_unarioContext ctx) {
        if (ctx.identificador() != null) {
            return verificarTipo(pilhadeTabelas, ctx.identificador());
        }
        return TabelaDeSimbolos.TipoAlguma.cadeia;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.Parcela_unarioContext ctx) {
        if (ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoAlguma.inteiro;
        }
        
        if (ctx.NUM_REAL() != null) {
            return TabelaDeSimbolos.TipoAlguma.real;
        }
        
        if (ctx.identificador() != null){
            return verificarTipo(pilhadeTabelas, ctx.identificador());
        }
        
        if (ctx.IDENT() != null) {
            return verificarTipo(pilhadeTabelas, ctx.IDENT().getText());
        } else {
            TabelaDeSimbolos.TipoAlguma ret = null;
            
            for (ExpressaoContext fa : ctx.expressao()) {
                TabelaDeSimbolos.TipoAlguma aux = verificarTipo(pilhadeTabelas, fa);
                if (ret == null) {
                    ret = aux;
                } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.invalido) {
                    ret = TabelaDeSimbolos.TipoAlguma.invalido;
                }
            }
            return ret;
        }
    }
    

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, AlgumaParser.IdentificadorContext ctx) {
        String nomeVar = "";
        TabelaDeSimbolos.TipoAlguma ret = TabelaDeSimbolos.TipoAlguma.invalido;

        for (int i = 0; i < ctx.IDENT().size(); i++) {
            nomeVar += ctx.IDENT(i).getText();
            
            if (i != ctx.IDENT().size() - 1) {
                nomeVar += ".";
            }
        }

        for (TabelaDeSimbolos tabela : pilhadeTabelas.getPilha()) {
            if (tabela.existe(nomeVar)) {
                ret = verificarTipo(pilhadeTabelas, nomeVar);
            }
        }

        return ret;
    }
    
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(PilhaTabelas pilhadeTabelas, String nomeVar) {
        TabelaDeSimbolos.TipoAlguma type = TabelaDeSimbolos.TipoAlguma.invalido;

        for (TabelaDeSimbolos tabela : pilhadeTabelas.getPilha()) {
            if (tabela.existe(nomeVar)) {
                return tabela.verificar(nomeVar);
            }
        }
        return type;
    }

    public static TabelaDeSimbolos.TipoAlguma getTipo(String val){
        TabelaDeSimbolos.TipoAlguma tipo = null;
                switch(val) {
                    case "literal": 
                        tipo = TabelaDeSimbolos.TipoAlguma.cadeia;
                        break;
                    case "inteiro": 
                        tipo = TabelaDeSimbolos.TipoAlguma.inteiro;
                        break;
                    case "real": 
                        tipo = TabelaDeSimbolos.TipoAlguma.real;
                        break;
                    case "logico": 
                        tipo = TabelaDeSimbolos.TipoAlguma.logico;
                        break;
                    default:
                        break;
                }
        return tipo;
    }
}