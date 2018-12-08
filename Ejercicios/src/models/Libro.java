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
public class Libro {
    //Declarar atributos
    public int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;
    private String localizacion;
    private String asignatura;
    
    //metodo constructor
    public Libro(int codigo, String titulo, String autor, boolean disponible,String localizacion, String asignatura){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
        this.localizacion = localizacion;
        this.asignatura = asignatura;
    }
    
    //metodos getters y setters
    public int getCodigo(){
        return this.codigo;
    } 
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
   
    
}
