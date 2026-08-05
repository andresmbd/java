
package com.mycompany.sistemagestionproductos.models;


public class ProductoFisico extends Producto {
    
    private double peso;
    private double costoEnvio;

     
    
    public ProductoFisico(String codigo, String nombre, double precioBase, int cantidadDisponible, boolean activo, double peso, double costoEnvio) {
        super(codigo, nombre, precioBase, cantidadDisponible, activo);
        
        if(peso <= 0)
            throw new IllegalArgumentException("Peso invalido, debes ingresar un valor mayor a 0");
        this.peso=peso;
        
        if(costoEnvio < 0)
            throw new IllegalArgumentException("El costo no puede ser negativo");
        this.costoEnvio=costoEnvio;
    }

    
    
    
    
    
    
    
    
    
    @Override
    public double calcularPrecioFinal() 
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    
    
    
    
    
    
}
