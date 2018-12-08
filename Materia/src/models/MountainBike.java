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
public class MountainBike extends Bicicleta{
    //declarar atributos
    private int cantidadSuspension;
    private int cantidadCambios;
    private String tipoFreno;
    private String tipoNeumatico;
    

    public MountainBike(int cantidadSuspension, int cantidadCambios, String tipoFreno, String tipoNeumatico, String marca, String modelo, double talla, String color, int peso) {
        super(marca, modelo, talla, color, peso);
        this.cantidadSuspension = cantidadSuspension;
        this.cantidadCambios = cantidadCambios;
        this.tipoFreno = tipoFreno;
        this.tipoNeumatico = tipoNeumatico;
    }

    public int getCantidadSuspension() {
        return cantidadSuspension;
    }

    public void setCantidadSuspension(int cantidadSuspension) {
        this.cantidadSuspension = cantidadSuspension;
    }

    public int getCantidadCambios() {
        return cantidadCambios;
    }

    public void setCantidadCambios(int cantidadCambios) {
        this.cantidadCambios = cantidadCambios;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }
    
    @Override
    public void setPeso(int peso) {
        this.peso = peso*2;
    }
    
    @Override
    public void andarRapido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
