package Entidades;

import java.util.ArrayList;

public class ArtigoCongresso extends Trabalho{
    private String isbn;
    public ArtigoCongresso(String titulo, String autores, String ano, String local, String isbn) {
        super(titulo, autores, ano, local);
        this.isbn=isbn;
    }
}
