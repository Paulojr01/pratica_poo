package br_com_carnaval;

public class Ingresso {
    private double valor_Ingresso;
    private double getValorAdicional;

    public double getGetValorAdicional() {
        return getValorAdicional;
    }

    public void setGetValorAdicional(double getValorAdicional) {
        this.getValorAdicional = getValorAdicional;
    }

    public Ingresso(double valor_Ingresso) {
        this.valor_Ingresso = valor_Ingresso;
    }

    public double getValor_Ingresso() {
        return valor_Ingresso;
    }

    public void setValor_Ingresso(double valor_Ingresso) {
        this.valor_Ingresso = valor_Ingresso;
    }


    public  String Ingresso () {
        return "Valor ingresso normal: " + getValor_Ingresso();
    }

}
