package br_com_folha_de_pagamento;

public class FComissionado  extends Funcionario{
    
    public FComissionado(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        //TODO Auto-generated constructor stub
    }

    private double percentual;
    private  double vendas;

    @Override
    public double calcularProventos() {
        double proventos = super.getSalario() + (this.vendas * this.percentual);
        return proventos;
        
    }
}
