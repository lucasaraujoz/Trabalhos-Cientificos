package Entidades;

import java.util.ArrayList;

public class Tcc extends ArtigoCongresso{
    private String curso;
    public Tcc(String titulo, String autores, String ano, String local, String isbn, String curso) {
        super(titulo, autores, ano, local, isbn);
        this.curso=curso;
    }
}
