package Pratica_Mostra_Dados;

public class Funcionario extends Pessoa {
        public Funcionario(String nome, String email, String telefone) {
            super(nome, email, telefone);

        }

        private String departamento;
        private Double salario;
        private String entrada_Banco;
        private boolean esta_Na_Empresa;
        private String rg;
        

        public Funcionario(String nome, String email, String telefone, String departamento, Double salario,
                String entrada_Banco, boolean esta_Na_Empresa, String rg) {
            super(nome, email, telefone);
            this.departamento = departamento;
            this.salario = salario;
            this.entrada_Banco = entrada_Banco;
            this.esta_Na_Empresa = esta_Na_Empresa;
            this.rg = rg;
        }

        public String getRg() {
            return rg;
        }

        public void setRg(String rg) {
            this.rg = rg;
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

            public void demitir (){
                this.esta_Na_Empresa = false;
                }



            @Override
            public String toString () {
                return "Funcionario [departamento=" + departamento + ", salario=" + salario + ", entrada_Banco="
                        + entrada_Banco + ", esta_Na_Empresa=" + esta_Na_Empresa + "nome"+ getNome()  + "email" + getEmail() + "telefone" + getTelefone() + "]";
            }

}





