package br_com_folha_de_pagamento;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      
                FPadrao fp1 = new FPadrao(100, "Maria", 2000);
                System.out.println("total proventos" + fp1.calcularProventos());
                
                FComissionado FC1 = new FComissionado(100, "Joao", 2100, 2, 5);
                System.out.println("total comissionado" + FC1.calcularProventos());

                FProdutividade fp2 = new FProdutividade(106, "JOSE", 2000, 5, 5);
                System.out.println("total produtividade" + fp2.calcularProventos());


        }

    }
 
        
   


    // o JOption já retorna string e armazena 
    // imput seria para retorna assim como um println junto com a leitura do que foi digitado
    // e dialogmenssage retorna um printf ou prinf sem leitura do que o usuario digita
    // #(na uml é protected ) protegido consigo chamar ela dentro de qualquer subclasse 
    // atributo static pertence a classe e não o objeto
    // statico fica default e pode definir como private public etc..
    // objeto abstract não é possível instancia 
    // faz mocado caso ela não peça pra entrar com os dados
    // classe abstratas não possui objetos 
    // consigo mudar valor dos atributos public


    // Posso cria uma variavel do tipo da mae abstrata mas ela herda as caracteristicas da filha igual linha Funcionario fp1 = new FPadrao(100, "Maria", 2000);