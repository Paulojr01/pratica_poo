package br_com_carnaval;

import java.text.NumberFormat;


public class Normal extends Ingresso {
    NumberFormat f = NumberFormat.getCurrencyInstance();

    public Normal(Double valor) {
        super(valor);
    }

    public String imprimeValorIngresso() {
        f.setMaximumFractionDigits(2);
        return ("O valor do ingresso é : " + f.format(this.valor ) + " Ingresso Normal");
    }
}