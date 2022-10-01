package br_com_folha_de_pagamento;

public class FProdutividade extends Funcionario {

    private double valor;
    private int produção;

    public FProdutividade(int matricula, String nome, double salario, double produção, int valor) {
        super(matricula, nome, salario);

        this.produção = (int) produção;
        this.valor = valor;
    
    }



    @Override
    public double calcularProventos(){
        double proventos = getSalario() + (this.produção * this.valor);
        return proventos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProdução() {
        return produção;
    }

    public void setProdução(int produção) {
        this.produção = produção;
    }

}

// quando usamos override não precisamos criar outro metodo exemplo calcularProventos2