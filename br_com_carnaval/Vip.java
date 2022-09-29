package br_com_carnaval;

public class Vip extends Ingresso {
private double valorAdicional;
static int count = 0;

public Vip(double valorIngresso, double valorAdicional) {
	super(valorIngresso);
	this.valorAdicional = valorAdicional;
    count ++;
}

public double getValorAdicional() {
	return valorAdicional;
}

public void setValorAdicional(double valorAdicional) {
	this.valorAdicional = valorAdicional;
}

public String imprimeIngresso()
{
	return "Ingresso VIP: " + (getValorIngresso()+getValorAdicional());
	
}

public int numeroVip(){

    return count++;
}


}