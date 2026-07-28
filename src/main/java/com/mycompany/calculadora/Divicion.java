
package com.mycompany.calculadora;
import javax.swing.JOptionPane;


public class Divicion {
    private int num1;
    private int num2;
    
    public Divicion(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void dividirNumeros()
    {
        if(num2 == 0)
        {
            JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
        }else
        {
            int resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "Resultado "+ resultado);

        }
    }
    
    
    
    
    
}
