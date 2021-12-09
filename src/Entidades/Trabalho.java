package Entidades;

import java.util.ArrayList;

public abstract class Trabalho {
    String titulo;
    String autores;
    ArrayList<String> anotacoes = new ArrayList<>();
    String ano;
    String local;

    public Trabalho(String titulo, String autores, String ano, String local) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.local = local;
    }

    public void addAnotacoes(String anot) {
        anotacoes.add(anot);
    }

    public int getSizeAnotacoes(){
        return anotacoes.size();
    }
    public ArrayList<String> getAnotacoes() {
        return anotacoes;
    }

    public String getTitulo() {
        return titulo;
    }
}

