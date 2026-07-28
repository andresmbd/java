
package com.mycompany.calculadora;
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo numero"));
        
//        Suma operacion = new Suma(num1, num2);
//        operacion.sumarNumeros();
        
        
        Divicion operacionDividir = new Divicion(num1, num2);
        operacionDividir.dividirNumeros();
    }
}
