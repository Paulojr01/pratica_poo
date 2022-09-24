package br_com_folha_de_pagamento;
import javax.swing.JOptionPane;

public class Main {
    static double salario = (Double) null; 
    static String nome = null;
    static int option;
    
    public static void main(String[] args) {
      
      


        option = Integer.parseInt(JOptionPane.showInputDialog("\t(1) digite seu nome:  \n\t(2) digite sua matricula  \n\t(3) digite seu sálario \n\t(0) Sair"));

        switch (option){

            case 1 :{

                nome = JOptionPane.showInputDialog("digite seu nome : ");

              break;  
            }




        }

    }
}
