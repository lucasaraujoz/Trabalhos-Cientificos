package Entidades;

import java.util.ArrayList;

public class ArtigoRevista extends Trabalho{
    private String  issn;
    public ArtigoRevista(String titulo, String autores, String ano, String local, String issn) {
        super(titulo, autores, ano, local);
        this.issn=issn;
    }
}
