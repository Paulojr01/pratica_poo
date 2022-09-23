package br_com_carnaval;

public class Camarote extends Ingresso {
    private String localizacao;
    private double getValorAdicional;

    public Camarote(double valor_Ingresso) {
        super(valor_Ingresso);
    
        this.localizacao = localizacao;
        this.getValorAdicional = getValorAdicional;
    }
    
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public double getGetValorAdicional() {
        return getValorAdicional;
    }

    public void setGetValorAdicional(double getValorAdicional) {
        this.getValorAdicional = getValorAdicional;
    }

    public void setValor_Ingresso (double getValorAdicional){
        this.getValorAdicional = getValorAdicional;

    }

    public String imprimeValor () {

        return "Camarote: " + 

    }
}
