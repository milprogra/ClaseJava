/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mjara
 */
public class Humano {
    //declarar atributos
    protected String nombre;
    protected String apellido;
    protected String sexo;
    protected String direccion;
    protected String telefono;
    
    //metodo constructor
    public Humano(){
        
    }
    public Humano(String nombre){
        this.nombre = nombre;
    }
    public Humano(String nombre, String apellido, String sexo, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //metodos getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
