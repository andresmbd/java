
package com.mycompany.sistemagestionproductos.models;
import java.util.ArrayList;

public abstract  class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;
    private int cantidadDisponible;
    private boolean activo;
    // private ArrayList<Producto> productos = new ArrayList<>();
    
    public Producto(
            String codigo,
            String nombre,
            double precioBase,
            int cantidadDisponible,
            boolean activo)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        if(precioBase<=0)
            throw new IllegalArgumentException("Solo se permite valores mayores que cero para el precio");
        this.precioBase=precioBase;
        
        if(cantidadDisponible <=0)
            throw new IllegalArgumentException("No se permite valores de cantidad negativa");
        this.cantidadDisponible=cantidadDisponible;
        
        this.activo=activo;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecioBase(){
        return cantidadDisponible;
    }
    
    public int getCantidadDisponible(){
        return cantidadDisponible;
    }    
    
    public boolean getActivo(){
        return activo;
    }
    
    
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setPrecioBase(double precioBase){
        this.precioBase=precioBase;
    }
    
    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible=cantidadDisponible;
    }
    
    public void setActivo(boolean activo){
        this.activo=activo;
    }
    
    
    public abstract double calcularPrecioFinal();
    
    public void mostrarInformacion()
    {
        
    }
    
    public double calcularValorEnInventario()
    {
        return calcularPrecioFinal() * this.cantidadDisponible;
    }
            
    
    
    
    
    
    
}
