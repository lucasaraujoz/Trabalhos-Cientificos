import Entidades.*;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trabalho> trabalhosCientificos = new ArrayList<>();
        String titulo, autor, local, isbn, issn, curso, anot, ano;
        int cont;

        trabalhosCientificos.add(new ArtigoRevista("Desmatamento", "Belmiro",
                "2021", "adsd", "aodasod"));
        trabalhosCientificos.add(new ArtigoRevista("Guerra Fria", "Anderson",
                "2021", "adsd", "aodasod"));
        trabalhosCientificos.add(new ArtigoRevista("Crise do Carbono", "Telesforo",
                "2021", "adsd", "aodasod"));
        trabalhosCientificos.add(new ArtigoRevista("Guerra Siria", "Ozilandia",
                "2021", "adsd", "aodasod"));
        while (true) {
            String opcx = JOptionPane.showInputDialog(null, "" +
                    """
                            1 - Cadastrar novo trabalho cientifico
                            2 - Mostrar todos os cadastrados
                            3 - Adicionar anotacao
                            """);
            //            opc = input.nextInt();

            switch (opcx) {
                case "1" -> {
                    String opcx2 = JOptionPane.showInputDialog(null, "" +
                            """
                                    Selecione um trabalho para add:
                                    1 - Artigo Congresso
                                    2 - Artigo Revista
                                    3 - Tese
                                    4 - Dissertacao
                                    5 - Tcc
                                    """);
                    switch (opcx2) {
                        case "1" -> { //artigo congresso
                            titulo = JOptionPane.showInputDialog(null, "Titulo");
                            autor = JOptionPane.showInputDialog(null, "Autor");
                            local = JOptionPane.showInputDialog(null, "Local");
                            isbn = JOptionPane.showInputDialog(null, "Isbn");
                            ano = JOptionPane.showInputDialog(null, "ano");
                            trabalhosCientificos.add(new ArtigoCongresso(titulo, autor, ano, local, isbn));
                        }
                        case "2" -> { //artigo revista
                            titulo = JOptionPane.showInputDialog(null, "Titulo");
                            autor = JOptionPane.showInputDialog(null, "Autor");
                            local = JOptionPane.showInputDialog(null, "Local");
                            ano = JOptionPane.showInputDialog(null, "Ano");
                            issn = JOptionPane.showInputDialog(null, "Issn");
                            trabalhosCientificos.add(new ArtigoRevista(titulo, autor, ano, local, issn));
                        }
                        case "3" -> { // tese
                            titulo = JOptionPane.showInputDialog(null, "Titulo");
                            autor = JOptionPane.showInputDialog(null, "Autor");
                            local = JOptionPane.showInputDialog(null, "Local");
                            ano = JOptionPane.showInputDialog(null, "Ano");
                            isbn = JOptionPane.showInputDialog(null, "Isbn");
                            curso = JOptionPane.showInputDialog(null, "Curso");
                            trabalhosCientificos.add(new Tese(titulo, autor, ano, local, isbn, curso));
                        }
                        case "4" -> { // dissertacao
                            titulo = JOptionPane.showInputDialog(null, "Titulo");
                            autor = JOptionPane.showInputDialog(null, "Autor");
                            local = JOptionPane.showInputDialog(null, "Local");
                            ano = JOptionPane.showInputDialog(null, "Ano");
                            isbn = JOptionPane.showInputDialog(null, "Isbn");
                            curso = JOptionPane.showInputDialog(null, "Curso");
                            trabalhosCientificos.add(new Dissertacao(titulo, autor, ano, local, isbn, curso));
                        }
                        case "5" -> { // TCC
                            titulo = JOptionPane.showInputDialog(null, "Titulo");
                            autor = JOptionPane.showInputDialog(null, "Autor");
                            local = JOptionPane.showInputDialog(null, "Local");
                            ano = JOptionPane.showInputDialog(null, "Ano");
                            isbn = JOptionPane.showInputDialog(null, "Isbn");
                            curso = JOptionPane.showInputDialog(null, "Curso");
                            trabalhosCientificos.add(new Tcc(titulo, autor, ano, local, isbn, curso));
                        }
                    }
                }
                case "2" -> { // mostrar trabalhos
                    cont = 0;
                    String txt = "";
                    for (var t : trabalhosCientificos) {
                        txt += cont + " - " + t.getTitulo() + " [" + t.getSizeAnotacoes() + "]" + "\n";
                        cont++;
                    }
                    String opc_atv = JOptionPane.showInputDialog(null, txt); //select trabalho
                    int number = Integer.parseInt(opc_atv);
                    Trabalho a = trabalhosCientificos.get(number);
                    StringBuilder txt2 = new StringBuilder();
                    for (String an : a.getAnotacoes()) {
                        txt2.append("- ").append(an).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, txt2.toString());
                }
                case "3" -> { // add anotação""
                    cont = 0;
                    StringBuilder txt = new StringBuilder();
                    for (var t : trabalhosCientificos) {
                        txt.append(cont).append(" - ").append(t.getTitulo()).append("\n");
                        cont++;
                    }
                    String opc_atv = JOptionPane.showInputDialog(null, txt.toString()); //select trabalho
                    int number = Integer.parseInt(opc_atv);
                    Trabalho a = trabalhosCientificos.get(number);
                    anot = JOptionPane.showInputDialog(null, "Insira a anotacao");
                    a.addAnotacoes(anot);
                    JOptionPane.showMessageDialog(null, "Anotacao inserida!");
                }
            }
        }
    }
}