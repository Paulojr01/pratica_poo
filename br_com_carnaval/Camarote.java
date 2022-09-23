package br_com_carnaval;

import java.text.NumberFormat;

public class Camarote  extends Ingresso{

    public Camarote(Double valor, Double valorAdicional, String localizacao) {
        super(valor);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }


    Double valorAdicional;
    String localizacao;



    NumberFormat f = NumberFormat.getCurrencyInstance();


    public String imprimeValorIngresso() {
        
        f.setMaximumFractionDigits(2);
        return ("O valor do ingresso é : " + f.format(this.valor + this.valorAdicional) + " Localizacao : "
                + this.localizacao + " Ingresso Camarote");
    }


    public Double getValorAdicional() {
        return valorAdicional;
    }


    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


    public String getLocalizacao() {
        return localizacao;
    }


    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}