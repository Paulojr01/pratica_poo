package Pratica_Mostra_Dados;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;


    private List <Funcionario> listaFuncionarios = new ArrayList <Funcionario>();
    private int qtd_De_Funcionario = listaFuncionarios.size();
    
    public Empresa(String nome, String cnpj, List<Funcionario> listaFuncionarios, int qtd_De_Funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.listaFuncionarios = listaFuncionarios;
        this.qtd_De_Funcionario = qtd_De_Funcionario;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}    
