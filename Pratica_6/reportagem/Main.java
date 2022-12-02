package Pratica_6.reportagem;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opcao = "";
        RevistaCientifica revista = new RevistaCientifica();

        revista.setTitulo("");
        revista.setIssn(2);
        revista.setPeridiocidade("");

        do { // criar edicao

            revista.getEdicoes().add(new Edicao(
                    0,
                    0,
                    opcao, 
                    0,
                    null));

        } while (opcao.equals("0"));

        revista.getEdicoes().get(0).edicao.setArtigos(null);
        edicao.setArtigos(null);
        edicao.setArtigos(null);

    }
}