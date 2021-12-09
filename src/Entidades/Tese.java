package Entidades;

import java.util.ArrayList;

public class Tese extends ArtigoCongresso{
    private String curso;
    public Tese(String titulo, String autores, String ano, String local, String isbn, String curso) {
        super(titulo, autores, ano, local, isbn);
        this.curso=curso;
    }
}
