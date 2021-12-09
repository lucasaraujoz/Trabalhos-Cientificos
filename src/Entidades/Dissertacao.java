package Entidades;

import java.util.ArrayList;

public class Dissertacao extends ArtigoCongresso{
    private String curso;
    public Dissertacao(String titulo, String autores, String ano, String local, String isbn, String curso) {
        super(titulo, autores, ano, local, isbn);
        this.curso=curso;
    }
}
