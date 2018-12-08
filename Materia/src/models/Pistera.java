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
public class Pistera extends Bicicleta implements IMetodos{
    //declarar atributos
    private String tipoNeumatico;
    private String tipoPiñon;
    private String tipoManubrio;
    private int mantenciones;

    public Pistera(String tipoNeumatico, String tipoPiñon, String tipoManubrio, String marca, String modelo, double talla, String color, int peso) {
        super(marca, modelo, talla, color, peso);
        this.tipoNeumatico = tipoNeumatico;
        this.tipoPiñon = tipoPiñon;
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoNeumatico() {
        return tipoNeumatico;
    }

    public void setTipoNeumatico(String tipoNeumatico) {
        this.tipoNeumatico = tipoNeumatico;
    }

    public String getTipoPiñon() {
        return tipoPiñon;
    }

    public void setTipoPiñon(String tipoPiñon) {
        this.tipoPiñon = tipoPiñon;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void andarRapido() {
        System.out.println("voy pedaleando rapido!");
    }

    @Override
    public int kilometrosRecorridos(int metros) {
        return metros/1000;
    }

    @Override
    public int cantidadMantenciones() {
        return this.mantenciones;
    }

    @Override
    public void otroMetodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
