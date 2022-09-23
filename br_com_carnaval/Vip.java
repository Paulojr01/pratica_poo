package br_com_carnaval;

public class Vip extends Ingresso {
    private double getValorAdicional;

    public Vip (double valor_Ingresso) {
        super(valor_Ingresso);
      
    }
    
    public double getGetValorAdicional() {
        return getValorAdicional;
    }
    public void setGetValorAdicional(double getValorAdicional) {
        this.getValorAdicional = getValorAdicional;
    }
   
    public String ingressoVip() {
        return "valor do ingresso Vip: " + getValor_Ingresso() + getValorAdicional;

    }
}
