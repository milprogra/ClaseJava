/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mjara
 */
public class Prestamo {
    
    public int CodigoLibro;
    public int numeroSocio;
    private Date fecha;
    private int cantidad;

    public Prestamo(int CodigoLibro, int numeroSocio, String fecha, int cantidad) throws ParseException {
        this.CodigoLibro = CodigoLibro;
        this.numeroSocio = numeroSocio;
        this.fecha = formatoDia(fecha);
        this.cantidad = cantidad;
    }

    public int getCodigoLibro() {
        return CodigoLibro;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int cantidadPrestamos(){
        return this.cantidad;
    }
    public Date formatoDia(String dia) throws ParseException{
        Date fecha= new SimpleDateFormat("yyyy-MM-dd").parse(dia);
        return fecha;
    }
    
}
