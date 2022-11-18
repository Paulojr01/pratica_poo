package Pratica_6;

package br.com.exemploExcecao.empresa;
public class Funcionario extends Pessoa {

    private String departamento;
    private Double salario;
    private String dataEntradaBanco;
    private String rg;
    private boolean estaEmpresa;

    public void bonificar(double porcentagem) {
        setSalario(getSalario() * (1 + porcentagem));
    }

    public void demitir() {
        setEstaEmpresa(false);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataEntradaBanco() {
        return dataEntradaBanco;
    }

    public void setDataEntradaBanco(String dataEntradaBanco) {
        this.dataEntradaBanco = dataEntradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isEstaEmpresa() {
        return estaEmpresa;
    }

    public void setEstaEmpresa(boolean estaEmpresa) {
        this.estaEmpresa = estaEmpresa;
    }

}