
package com.mycompany.javaejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;
    private boolean activa=true;
    
    public CuentaBancaria(
            String numeroCuenta,
            String nombreTitular,
            double saldoInicial
        )
    {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        //this.saldo = saldoInicial;
        this.saldo = (saldoInicial > 0)? saldoInicial: 0;
    }
    
    public String getNumeroCuenta()
    {return this.numeroCuenta;}
    
    public String getNombreTitular(){
        return this.nombreTitular;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public boolean getEstadoCuenta()
    {
        return this.activa;
    }
    
    
    public boolean consignarDinero(double cantidad)
    {
        if(activa){
            if (cantidad > 0)
            {
                saldo += cantidad;
                return true;
            }else
            {       
                return false;
            }
        }else{
            return false;
        }
    } 
    
    public boolean retirarDinero(double cantidad){
        if(activa){
            if(cantidad > 0){
                if (cantidad <= saldo)
                {
                    saldo -= cantidad;
                    return true;
                }else
                {
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    
    public String obtenerTipoSaldo(){
        if (saldo < 100000){
            return "Saldo bajo";
        }else if (100000 >= saldo&&saldo <= 1000000)
            return "Saldo estable";
        else return "Saldo alto";
    }
    
    
    public String obtenerInformacion()
    {
        String estado;
        if(activa){
            estado = "Activa";
        }else{
            estado= "Inactiva";
        }   
        return "--Cuenta Bancaria--"
                + "\nNumero de cuenta: "+numeroCuenta
                +"\nTitular: " +nombreTitular
                +"\nSaldo disponible: $"+saldo
                +"\nEstado: " +estado
                +"\nClasificacion: "+obtenerTipoSaldo();
    }
    
    
    public void desactivarCuenta()
    {
        activa = false;
    }

}
