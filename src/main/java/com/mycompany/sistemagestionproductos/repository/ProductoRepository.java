
package com.mycompany.sistemagestionproductos.repository;
import com.mycompany.sistemagestionproductos.models.Producto;
import java.util.ArrayList;

public class ProductoRepository {
    private ArrayList<Producto> productos;
    
    public ProductoRepository(){
        productos = new ArrayList<>(); 
    }
    
    public void guardar(Producto producto){
        productos.add(producto);
    }
    
    public ArrayList<Producto> listarTodos(){
        return productos;
    }
    
    
    public Producto buscarPorCodigo(String codigo)
    {
        for(Producto producto: productos){
            if(producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
        
    }
    
    public boolean eliminarPorCodigo(String codigo)
            
    {
        throw new ExceptionInInitializerError("no supported yet");

    }
    
    public boolean exiteCodigo(String codigo)
    {
        for(Producto producto: productos)
        {
            if (producto.getCodigo().equals(codigo))
                return true;
        }
        return false;
    }
    
    

}            
            
            
            
