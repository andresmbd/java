
package com.mycompany.sistemagestionproductos.controllers;
import com.mycompany.sistemagestionproductos.services.ProductoService;
import com.mycompany.sistemagestionproductos.models.Producto;
import java.util.ArrayList;

public class ProductoController {
    private ProductoService productoService = new ProductoService();
    
    public void registrarProducto(Producto producto){
        productoService.registrarProducto(producto);
    }
    
    public ArrayList<Producto> consultarProductos()
    {
        return productoService.listarProductos();
    }
    
    public Producto buscarProductos(String codigo)
    {
        return productoService.buscarProducto(codigo);
    }
    
    public void actualizarProducto(Producto producto)
    {
        productoService.actualizarProducto(producto);
    }
    
    public void eliminarProducto(String codigo)
    {
        productoService.eliminarProducto(codigo);
    }
    
    public double calcularValorTotalInventario()
    {
        return productoService.calcularValorTotalInventario();
    }
    
    public int obtenerCantidadProductos()
    {
        return productoService.obtenerCantidadProductos();
    }
    
    
    
}
