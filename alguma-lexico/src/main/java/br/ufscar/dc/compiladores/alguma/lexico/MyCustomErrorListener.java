package br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.PrintWriter;
import java.util.*;

public class MyCustomErrorListener implements ANTLRErrorListener {
    PrintWriter pw;
    Integer contador_erro;
    public MyCustomErrorListener(PrintWriter pw, Integer contador_erro) {
        this.pw = pw;
        this.contador_erro = contador_erro;
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
            BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
            BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
            ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e) {
        Token t = (Token) offendingSymbol;

        // Condicao de parada para interromper o programa
        while(contador_erro < 1) {
            if (AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")) {
                pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                pw.println("Fim da compilacao");
                // Ao detectar algum erro o contador eh iterado e o programa terminado
                contador_erro++;
            } else if (AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_NAO_FECHADO")) {
                pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                pw.println("Fim da compilacao");
                contador_erro++;
            } else if (AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("SIMBOLO_NAO_IDENTIFICADO")) {
                pw.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                pw.println("Fim da compilacao");
                contador_erro++;
            } else if (t.getText() == "<EOF>") {
                pw.println("Linha " + t.getLine() + ": erro sintatico proximo a EOF");
                pw.println("Fim da compilacao");
                contador_erro++;
            } else {
                pw.println("Linha " + t.getLine() + ": erro sintatico proximo a " + t.getText());
                pw.println("Fim da compilacao");
                contador_erro++;
            }
        }
    }
}
