
package com.mycompany.arquitecturacapas.models;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private int idEstudiantes;
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public String getCurso()
    {
        return curso;
    }
    
    public int getIdEstudiante()
    {
        return idEstudiantes;
    }
    
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    public void setCurso(String curso)
    {
        this.curso=curso;
    }
    
    public void setIdEstudiante(int idEstudiante)
    {
        this.idEstudiantes=idEstudiante;
    }
    
}
