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
public class Computador {
    //definir atributos de computador (publico)
    public int id;
    public String marca;
    public String modelo;
    public String procesador;
    public int cantMemoria;
    public int disco;
    public double pantalla;
    private String tarjetaVideo;
    
    public Computador(){
        
    }
    public Computador(int id){
        this.id = id;
    }
    public Computador(int id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Computador(String marca, String modelo, double pantalla){
        this.modelo = modelo;
        this.marca = marca;
        this.pantalla = pantalla;
    }

    public Computador(int id, String marca, String modelo, String procesador, int cantMemoria, int disco, double pantalla) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.cantMemoria = cantMemoria;
        this.disco = disco;
        this.pantalla = pantalla;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String tarjetaVideo) {
        this.tarjetaVideo = tarjetaVideo;
    }
    
}
