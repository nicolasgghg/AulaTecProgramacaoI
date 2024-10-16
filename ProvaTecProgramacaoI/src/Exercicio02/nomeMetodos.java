package Exercicio02;

import java.util.ArrayList;

class NomeMetodos {
    private ArrayList<String> lista;

    public NomeMetodos() {
        lista = new ArrayList<>();
    }

    public void cadastrarNome(String nome) {
        lista.add(nome);
    }

    public void apagarNome(String nome) {
        lista.remove(nome);
    }

    public int consultarTamanho() {
        return lista.size();
    }

    public boolean pesquisarNome(String nome) {
        return lista.contains(nome);
    }

    public void imprimirLista() {
        System.out.println("Lista: " + lista);
    }

    public void resetarLista() {
        lista.clear();
    }
}