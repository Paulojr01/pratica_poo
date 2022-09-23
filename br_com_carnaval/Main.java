package br_com_carnaval;
import javax.swing.JOptionPane;

public class Main{
    static double valor;
    public static void main(String[] args) {

       int opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> ingresso Normal \n,<2>ingresso Vip\n <3> ingresso Camarote\n <4>sair"));
       // integer.parseIntt convert int para String o joption vai dentro do paramentro do mesmo.

       switch (opcao) {
        case 1 :
            valor = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso:" ));
            Normal ingressoAdicional = new Normal(valor);
            JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso , title, messageType);

            break;
        }

        case 2 :{
                valor = Double.parseDouble(JOptionPane.showInputDialog("valor do ingresso:" ));
                Normal ingressoAdicional = new Normal(valor);
                JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngresso , title, messageType);

            }

        case 3 : {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso Camarote: ", ));

            break;

        }

        case 4 :{



        }
   
   
   
    }

}

// imput retorna valores de string temos que converte de string para double int etc..