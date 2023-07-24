package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.ArrayList;
import java.util.HashMap;

public class TabelaDeSimbolos {
    public TabelaDeSimbolos.TipoAlguma returnType;
    
    public enum TipoAlguma {
        literal, //
        inteiro,
        real,
        logico,
        invalido,
        cadeia,
        reg,
        Void
    }

    public enum Estrutura {
        var, constante, proc, func, tipo
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;
        Estrutura estrutura;

        public EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo, Estrutura estrutura) {
            this.nome = nome;
            this.tipo = tipo;
            this.estrutura = estrutura;
        }
    }

    private final HashMap<String, EntradaTabelaDeSimbolos> tabela;
    private final HashMap<String, ArrayList<EntradaTabelaDeSimbolos>> tipoTabela;

    public TabelaDeSimbolos(TabelaDeSimbolos.TipoAlguma returnType) {
        this.tabela = new HashMap<>();
        tipoTabela = new HashMap<>();
        this.returnType = returnType;
    }

    public void adicionar(String nome, TipoAlguma tipo, Estrutura estrutura) {
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos(nome, tipo, estrutura);
        tabela.put(nome, entrada);
    }

    public void adicionar(EntradaTabelaDeSimbolos entrada) {
        tabela.put(entrada.nome, entrada);
    }

    public void adicionar(String tipoNome, EntradaTabelaDeSimbolos entrada){
        
        if (tipoTabela.containsKey(tipoNome)) {
            tipoTabela.get(tipoNome).add(entrada);
        } else {
            ArrayList<EntradaTabelaDeSimbolos> list = new ArrayList<>();
            list.add(entrada);
            tipoTabela.put(tipoNome, list);
        }
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public TipoAlguma verificar(String nome) {
        return tabela.get(nome).tipo;
    }

    public ArrayList<EntradaTabelaDeSimbolos> getTypeProperties(String name){
        return tipoTabela.get(name);
    }
}