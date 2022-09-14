package br_com_pratica2_Rendimento;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final String DADO_INVALIDO = "Dado inválido!";
    static Scanner ler = new Scanner(System.in);
    static Rendimento rendimento1 = new Rendimento();
    static Double investimentoInicial; 
    static Double taxaMes;
    static int numeroMeses;
    
    public static void main(String[] args) {


        adicionarInvestimentoInicial();

        adicionarTaxaMes();

        adicionarNumeroMeses();

        mostrarRendimento();

        // Fim main
    }
    private static void mostrarRendimento() {
        System.out.printf("O rendimento do investimento de R$ %.2f, com uma taxa de %1.0f%% a/m mês(es), durante %d será de R$ %.2f", rendimento1.getInvestimentoInicial(), rendimento1.getTaxaMes(), rendimento1.numeroMeses, rendimento1.calcularRemdimento() );
        
    }

    private static void adicionarNumeroMeses() 
    {
        System.out.print("Número de meses: ");
        try{
            numeroMeses = ler.nextInt();
            rendimento1.setNumeroMeses(numeroMeses);
            limparScanner();
        }
        catch(InputMismatchException  exception){
            limparScanner();
            System.out.println(DADO_INVALIDO);
            adicionarNumeroMeses();
        }
    }

    private static void adicionarInvestimentoInicial() 
    {   
        System.out.print("Investimento: R$ ");
        try { 
            investimentoInicial = ler.nextDouble(); 
            rendimento1.setInvestimentoInicial(investimentoInicial);
            limparScanner();
        } 
        catch (InputMismatchException exception) {
            limparScanner();
            System.out.println(DADO_INVALIDO);
            adicionarInvestimentoInicial();
        }
    }

    private static void adicionarTaxaMes()
    {
        System.out.print("Taxa do Rendimento ( % a/m ): ");
        try{
            taxaMes = ler.nextDouble();
            rendimento1.setTaxaMes(taxaMes);
            limparScanner();
        }
        catch(InputMismatchException  exception){
            limparScanner();
            System.out.println(DADO_INVALIDO);
            adicionarTaxaMes();
        }
    }

    private static void limparScanner() 
    { 
        ler = new Scanner(System.in);
    }
}