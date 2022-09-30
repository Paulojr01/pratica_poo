package br_com_folha_de_pagamento;

public class FPadrao extends Funcionario {

    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
        //TODO Auto-generated constructor stub
    }

    @Override 

    public double calcularProventos (){   
        return getSalario();
    }
    
}
