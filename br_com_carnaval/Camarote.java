package br_com_carnaval;

public class Camarote extends Ingresso {
private String localizacao;
private double valorAdicional;
static int count = 0;

public Camarote(double valorIngresso, String localizacao, double valorAdicional) {
	super(valorIngresso);
	this.localizacao = localizacao;
	this.valorAdicional = valorAdicional;
    count ++;
}

public String getLocalizacao() {
	return localizacao;
}

public void setLocalizacao(String localizacao) {
	this.localizacao = localizacao;
}

public double getValorAdicional() {
	return valorAdicional;
}

public void setValorAdicional(double valorAdicional) {
	this.valorAdicional = valorAdicional;
}

public String imprimeIngresso()
{
	return "Ingresso Camarote: " + (getValorIngresso() + getValorAdicional()) + "\n" + getLocalizacao();
}

public int numeroCamarote(){

    return count++;
}

}