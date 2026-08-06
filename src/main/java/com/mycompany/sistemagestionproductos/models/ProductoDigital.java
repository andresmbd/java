
package com.mycompany.sistemagestionproductos.models;


public class ProductoDigital extends Producto {
    
    private double tamanioArchivo;
    private String formato;                                                                                                                                                                            

    public ProductoDigital(String codigo, String nombre, double precioBase, int cantidadDisponible, boolean activo, double tamanioArchivo, String formato) {
        super(codigo, nombre, precioBase, cantidadDisponible);
        
        if(tamanioArchivo<=0)
            throw new IllegalArgumentException("Tamaño de archivo incorrecto, debe ser mayor que cero");
        this.tamanioArchivo=tamanioArchivo;
        
        if(formato==null||formato.isBlank())
            throw new IllegalArgumentException("El formato no puede estar vacio, llenelo con el formato correcto");
        this.formato=formato.trim();  
    }
//    
//    private final double DESCUENTO_GENERAL = getPrecioBase()*0.10;
//    private final double DESCUENTO_POR_TAMANIO_ARCHIVO=getPrecioBase()*0.05;
            
    @Override
    public double calcularPrecioFinal() {
        double descuentoGeneral=getPrecioBase()*0.10;
        double descuentoPorTamanioArchivo= getPrecioBase()*0.05;
        
        if(tamanioArchivo >5)
            return getPrecioBase()-descuentoPorTamanioArchivo;
      
        return getPrecioBase()-descuentoGeneral;
    }
    
}
