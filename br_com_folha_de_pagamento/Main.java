package br_com_folha_de_pagamento;
import javax.swing.JOptionPane;

public class Main {
    static Double salario = null; 
    static String nome = null;
    static int option;
    static String matricula = null;
    public static void main(String[] args) {
      
        matricula = JOptionPane.showInputDialog("digite sua matrícula : ");
        nome = JOptionPane.showInputDialog("digite seu nome: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite seu salario: "));
       

        }

    }
 
        
   


    // o JOption já retorna string e armazena 
    // imput seria para retorna assim como um println junto com a leitura do que foi digitado
    // e dialogmenssage retorna um printf ou prinf sem leitura do que o usuario digita
    // #(na uml é protected ) protegido consigo chamar ela dentro de qualquer subclasse 
    // atributo static pertence a classe e não o objeto
    // statico fica default e pode definir como private public etc..
    // objeto abstract não é possível instancia 