public Class EmpregadoDaFaculdade{
private String nome;
private double salario;
private int horasAula;

    public EmpregadoFaculdade(String nome, double salario, int horasAula) {
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

double getGastos(){
    bonus = 40;
return this.salario + (bonus * horasAula);

}
String getInfo(){
return "nome:” + this.nome + " com salário “ + this.salario;
}

// toda classe java tem um construtor e tem que ter o new para chamar o construtor
// construtor tem que ter mesmo nome da classe. 