package br_com_folha_de_pagamento;

public class FProdutividade extends Funcionario {
    public FProdutividade(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        //TODO Auto-generated constructor stub
    }
    private double valor;
    private int produção;

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