package br_com_carnaval;

import java.text.NumberFormat;

public class Vip extends Ingresso {
    Double valorAdicional;
    
    NumberFormat f = NumberFormat.getCurrencyInstance();


    public Vip (Double valor, Double valorAdicional) {

        super(valor);

        this.valorAdicional = valorAdicional;
    }

    public String imprimeValorIngresso(){
        f.setMaximumFractionDigits(2);
        return ("O valor do ingresso é " + f.format(this.valor + this.valorAdicional) + " Ingresso VIP");
    }
    public Double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}