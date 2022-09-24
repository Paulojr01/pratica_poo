package br_com_folha_de_pagamento;
import javax.swing.JOptionPane;

public class Main {
    static Double salario = null; 
    static String nome = null;
    static int option;
    
    public static void main(String[] args) {
      

        nome = JOptionPane.showInputDialog("digite seu nome: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite seu salario: "));



        }

    }




    // o JOption já retorna string e armazena 
    // imput seria para retorna assim como um println junto com a leitura do que foi digitado
    // e dialogmenssage retorna um printf ou prinf sem leitura do que o usuario digita