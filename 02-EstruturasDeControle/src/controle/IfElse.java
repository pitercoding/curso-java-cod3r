package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe o número:");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("PAR!");
        } else {
            System.out.println("ÍMPAR!");
        }
    }
}
