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
public class Profesor extends Humano{
    //declar atributos
    private String asignatura;
    private int sueldo;
    
    //metodo constructor
    public Profesor(){
        super();
    }
    public Profesor(String asignatura, int sueldo, String nombre, String apellido, String sexo, String direccion, String telefono) {
        super(nombre, apellido, sexo, direccion, telefono);
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }
    
    //metodos getters y setters

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public void mostrarDatos(){
        System.out.println(this.nombre+" "+this.apellido+
                ", "+this.sexo+", "+this.direccion+", "+
                this.telefono+", "+this.asignatura+", "+
                this.sueldo);
    }
}
