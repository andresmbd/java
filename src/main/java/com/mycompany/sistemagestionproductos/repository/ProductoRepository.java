
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
        Producto producto =buscarPorCodigo(codigo);
        if(producto != null){
            productos.remove(producto);
            return true;
        }
        return false;
    }
    
    public boolean existeCodigo(String codigo)
    {
        for(Producto producto: productos)
        {
            if (producto.getCodigo().equals(codigo))
                return true;
        }
        return false;
    }
    
    public void actualizar(Producto producto){
        for(int i=0;i<productos.size();i++)
        {
            if (productos.get(i).getCodigo().equals(producto.getCodigo())) 
            {
                productos.set(i, producto);
                return;
            } 
        }
    }
    
    

}           
            
            
            
