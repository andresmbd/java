
package com.mycompany.sistemagestionproductos.services;
import com.mycompany.sistemagestionproductos.repository.ProductoRepository;
import com.mycompany.sistemagestionproductos.models.Producto;
import java.util.ArrayList;

public class ProductoService {
    
    private ProductoRepository productoRepositorio = new ProductoRepository();
    
    
    private void validarCodigo(String codigo){
        if(codigo == null || codigo.isBlank())
            throw new IllegalArgumentException("El campo de el codigo no puede estar vacio");
    }
    
    private void validarNombre(String nombre){
        if(nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("Campo no valido, llene el campo de nombre");
    }
    
    private void validarPrecio(double precio){
        if(precio<=0)
            throw new IllegalArgumentException("Solo se permite valores mayores que cero para el precio");
    }
    
    
    private void validarCantidad(int cantidad){
        if (cantidad<0){
            throw new IllegalArgumentException("No se permite valores de cantidad negativa");
        }
    }
    
    private void validarProducto(Producto producto){
        validarCodigo(producto.getCodigo());
        validarNombre(producto.getNombre());
        validarPrecio(producto.getPrecioBase());
        validarCantidad(producto.getCantidadDisponible());
    }
    
    public void registrarProducto(Producto producto){
        validarProducto(producto);
        if(productoRepositorio.exiteCodigo(producto.getCodigo()))
            throw new IllegalArgumentException("Este codigo esta repetido");
        
        else productoRepositorio.guardar(producto);
    }
    
    public ArrayList<Producto> listarProductos(){
        return productoRepositorio.listarTodos();
    }
    
    public Producto buscarProducto(String codigo){
        if(!productoRepositorio.exiteCodigo(codigo))
            throw new IllegalArgumentException("El codigo no existe en el sistema");
        return productoRepositorio.buscarPorCodigo(codigo);
    }
           
    
    public void actualizarProducto(Producto producto){
        validarProducto(producto);
        buscarProducto(producto.getCodigo());
        
    }
    
    public void eliminarProducto(String codigo){
        productoRepositorio.eliminarPorCodigo(codigo);
    }
    
    public int obtenerCantidadProductos(){
        throw new ExceptionInInitializerError("");
    }
    
    public double calcularValorTotalInventario(){
        throw new ExceptionInInitializerError("");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
