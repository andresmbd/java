
package com.mycompany.javaejercicio2;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String numeroCuenta= JOptionPane.showInputDialog("Numero de cuenta");
        String nombreTitular= JOptionPane.showInputDialog("Nombre del titular");
        int saldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Saldo inicial"));

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, nombreTitular, saldoInicial);
        
        int opcion;
        
        do {            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
          + "======== BANCO RIWI ========"
                  + "\n1. Consultar cuenta"
                  + "\n2. Consignar dinero "
                  + "\n3. Retirar dinero"
                  + "\n4. Consultar saldo"
                  + "\n5. Desactivar cuenta"
                  + "\n6. Salir")); 
            
            switch (opcion){
                case 1 -> {
                    String informacion = cuenta.obtenerInformacion();
                    JOptionPane.showMessageDialog(null, informacion);
                }
                case 2 -> {
                    int consignar = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a consignar"));
                    boolean respuesta = cuenta.consignarDinero(consignar);
                    
                    if(respuesta == true)
                        JOptionPane.showMessageDialog(null, "Consignación realizada correctamente.");
                    else JOptionPane.showMessageDialog(null, "No fue posible realizar la consignación.");
                }
                case 3 -> {
                    int retirar = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a retirar"));
                    boolean respuesta = cuenta.retirarDinero(retirar);
                    
                    if (respuesta == true)
                        JOptionPane.showMessageDialog(null, "Retiro realizado correctamente.");
                    else JOptionPane.showMessageDialog(null, "No fue posible realizar el retiro.");
                }
                case 4 -> {
                    double saldo = cuenta.getSaldo();
                    String tipoSaldo = cuenta.obtenerTipoSaldo();
                    JOptionPane.showMessageDialog(null, "Saldo disponible: $" + saldo + 
                                                        "\nEstado del saldo: "+tipoSaldo);
                }
                case 5 -> {
                    int respuesta = JOptionPane.showConfirmDialog(null,"¿Está seguro de desactivar la cuenta?","Confirmar",JOptionPane.YES_NO_OPTION);
                    if(respuesta == JOptionPane.YES_OPTION)
                        cuenta.desactivarCuenta(); 
                }
                case 6 -> JOptionPane.showMessageDialog(null, "Gracias por utilizar Banco Riwi.");
            }
        } while (opcion != 6);
    }
}
