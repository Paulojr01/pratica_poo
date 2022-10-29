package Pratica_Mostra_Dados;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Funcionario extends Pessoa {
        public Funcionario(String nome, String email, String telefone) {
            super(nome, email, telefone);

        }

        private String departamento;
        private Double salario;
        private String entrada_Banco;
        private boolean esta_Na_Empresa;

        public String getDepartamento() {
            return departamento;
        }

        public void setDepartamento(String departamento) {
            this.departamento = departamento;
        }

        public DoublegetSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

        public String getEntrada_Banco() {
            return entrada_Banco;
        }

        public void setEntrada_Banco(String entrada_Banco) {
            this.entrada_Banco = entrada_Banco;
        }

        public boolean isEsta_Na_Empresa() {
            return esta_Na_Empresa;
        }

        public void setEsta_Na_Empresa(boolean esta_Na_Empresa) {
            this.esta_Na_Empresa = esta_Na_Empresa;
        }


            public double bonificar(double salario ){
               this.salario = salario + 100;
                return this.salario;
            }

            public boolean demitir (){
               this.esta_Na_Empresa = false;

                return esta_Na_Empresa;
            }

            public String mostrarDados(){
                
            }

}





