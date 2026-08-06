
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
        if(productoRepositorio.existeCodigo(producto.getCodigo()))
            throw new IllegalArgumentException("Este codigo esta repetido");
        
        else productoRepositorio.guardar(producto);
    }
    
    public ArrayList<Producto> listarProductos(){
        return productoRepositorio.listarTodos();
    }
    
    public Producto buscarProducto(String codigo){
        if(!productoRepositorio.existeCodigo(codigo))
            throw new IllegalArgumentException("El codigo no existe en el sistema");
        return productoRepositorio.buscarPorCodigo(codigo);
    }
           
    
    public void actualizarProducto(Producto producto){
        if(!productoRepositorio.existeCodigo(producto.getCodigo()))
            throw new IllegalArgumentException("El codigo ingresaso: "+producto.getCodigo()+" no existe.");
        productoRepositorio.actualizar(producto);
    }
    
    public void eliminarProducto(String codigo){
        if(!productoRepositorio.existeCodigo(codigo))
            throw new IllegalArgumentException("No se encontro tal codigo como "+codigo);
        productoRepositorio.eliminarPorCodigo(codigo);
    }
    
    public int obtenerCantidadProductos(){
        return listarProductos().size();
    }
    
    public double calcularValorTotalInventario(){
        double total=0;
        ArrayList<Producto> productos =listarProductos();
        
        for(Producto producto:productos){
            total += producto.calcularValorEnInventario();
        }
        return total;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
