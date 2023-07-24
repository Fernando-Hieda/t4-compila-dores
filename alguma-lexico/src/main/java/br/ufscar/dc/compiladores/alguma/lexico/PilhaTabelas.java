package br.ufscar.dc.compiladores.alguma.lexico;
import java.util.LinkedList;
import java.util.List;

public class PilhaTabelas {
    private LinkedList<TabelaDeSimbolos> pilha;
    public PilhaTabelas(TabelaDeSimbolos.TipoAlguma returnType){
        pilha = new LinkedList<>();
        create(returnType);
    }

    public void create(TabelaDeSimbolos.TipoAlguma returnType){
        pilha.push(new TabelaDeSimbolos(returnType));
    }

    public TabelaDeSimbolos getPilhaTabelas(){
        return pilha.peek();
    }

    public List<TabelaDeSimbolos> getPilha(){
        return pilha;
    }

    public void dropPilhaTabelas(){
        pilha.pop();
    }

    public boolean identExists(String name){
        for (TabelaDeSimbolos pilhaTabelas : pilha) {
            if (!pilhaTabelas.existe(name)) {
                return true;
            }
        }
        return false;
    }
}
