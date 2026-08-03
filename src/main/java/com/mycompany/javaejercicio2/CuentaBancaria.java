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
    
    public void setNumeroCuenta(String numeroCuenta)
    {
        if(numeroCuenta != null && !numeroCuenta.isBlank())
            this.numeroCuenta=numeroCuenta;
    }
    
    public boolean validarNumeroCuenta(String numeroCuenta){

        numeroCuenta =numeroCuenta.trim();
        // && Integer.parseInt(numeroCuenta) < 0
        if (numeroCuenta.length() < 8)
            return false;
        
        for(int i =0;i<numeroCuenta.length();i++)
        {
            if(!Character.isDigit(numeroCuenta.charAt(i))) 
                return false;
        }
        this.numeroCuenta=numeroCuenta;  
        return true;
    }
    
    public String getNombreTitular(){
        return this.nombreTitular;
    }
    
    public void setNombreTitular(String nombreTitular){
        if(nombreTitular != null && !nombreTitular.isBlank())
            this.nombreTitular=nombreTitular;
    }
     
    public boolean validarNombreTitular(String nombreTitular){
        nombreTitular.trim();
        for(int i=0;i<nombreTitular.length();i++)
        {
            if(Character.isDigit(nombreTitular.charAt(i)))
                return false;
        }
        this.nombreTitular=nombreTitular;
        return true;
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
