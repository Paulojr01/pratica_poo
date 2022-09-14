package br_com_pratica2_Rendimento;

public class Rendimento {
    public Double investimentoInicial; 
    public Double taxaMes;
    public int numeroMeses;

    public Rendimento (Double investimentoInicial, Double taxaMes, int numeroMeses)
    {
        this.investimentoInicial = investimentoInicial;
        this.taxaMes = taxaMes;
        this.numeroMeses = numeroMeses;
    }

    public Rendimento()
    {}

    public Double getInvestimentoInicial() 
    {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(Double investimentoInicial) 
    {
        this.investimentoInicial = investimentoInicial;
    }

    public Double getTaxaMes() 
    {
        return taxaMes;
    }

    public void setTaxaMes(Double taxaMes) 
    {
        this.taxaMes = taxaMes;
    }

    public int getNumeroMeses() 
    {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) 
    {
        this.numeroMeses = numeroMeses;
    }

    public Double calcularRemdimento(){
        // calcular juros compostos M =C (1+i) ^ t

        Double rendimentoTotal = ( investimentoInicial * Math.pow((1+taxaMes/100), numeroMeses) );

        return rendimentoTotal;
    }
}