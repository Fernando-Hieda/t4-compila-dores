package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) {
        // Pega o primeiro argumento da linha de comando
        String arquivoSaida = "saida.txt";

        // Cria um objeto para escrever no arquivo
        try(PrintWriter pw = new PrintWriter(arquivoSaida)) {
            System.out.println("aqui 1");
            // pw.println("Escreveu123123");
            try {
                // args[0] é o primeiro argumento da linha de comando
                CharStream cs = CharStreams.fromFileName(args[0]);
                AlgumaLexer lex = new AlgumaLexer(cs);
                Token t = null;
                System.out.println("levou");
                
                // pw.println("Escreveu");
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) == "PALAVRA_CHAVE") {
                        pw.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");   
                        // System.out.println("Escreveu no arquivo");
                        System.out.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");
                    } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("ERRO")) {
                        pw.println("Erro na linha "+t.getLine()+": "+t.getText());
                        System.out.println("Erro na linha "+t.getLine()+": "+t.getText());
                        break;
                    } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA_NAO_FECHADA")) {
                        pw.println("Cadeia nao fechada na linha "+t.getLine());
                        System.out.println("Cadeia nao fechada na linha "+t.getLine());
                        break;
                    } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("COMENTARIO_NAO_FECHADO")) {
                        pw.println("Comentario nao fechado na linha "+t.getLine());
                        System.out.println("Comentario nao fechado na linha "+t.getLine());
                        break;
                    } else if(AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("SIMBOLO_NAO_IDENTIFICADO")) {
                        pw.println("Linha " + t.getLine() + ": " + t.getText() + " - Simbolo nao identificado ");
                        System.out.println("Linha " + t.getLine() + ": " + t.getText() + " - Simbolo nao identificado ");
                        break;
                    }else {
                        pw.println("<" + '\'' + t.getText() + '\''+ "," + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ">");   
                        System.out.println("<" + '\'' + t.getText() + '\''+ "," + '\'' + t.getText() + '\'' + ">");
                    }
                }
            } catch (IOException error) {
                error.printStackTrace();
            }
        } catch(FileNotFoundException fnfe) {
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }

    }
}
