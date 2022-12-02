package Pratica_6.reportagem;

public class Artigo {
    
    private String titulo;
    private String resumo;
    private String autores;

    public Artigo(String titulo, String resumo, String autores) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }
    
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
    

}
