package br_com_folha_de_pagamento;

public class FComissionado {
    private double percentual;
    private double vendas;
    
    public FComissionado(double percentual, double vendas) {
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    public  double calcularProventos (double percentual){

        return percentual;
        
    }
    
}


