
package com.mycompany.sistemagestionproductos.models;

public abstract  class Producto {
    private String codigo;
    private String nombre;
    private double precioBase;
    private int cantidadDisponible;
    private boolean activo;
    
    public Producto(
            String codigo,
            String nombre,
            double precioBase,
            int cantidadDisponible
        ){
        
        if(codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El campo de el codigo no puede estar vacio");
        this.codigo=codigo.trim();
        
        if(nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("Campo no valido, ingrese el campo de nombre");
        this.nombre=nombre.trim();
        
        if(precioBase<=0)
            throw new IllegalArgumentException("Solo se permite valores mayores que cero para el precio");
        this.precioBase=precioBase;
        
        if(cantidadDisponible < 0)
            throw new IllegalArgumentException("No se permite valores de cantidad negativa");
        this.cantidadDisponible=cantidadDisponible;
        
        this.activo=true;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecioBase(){
        return precioBase;
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
