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
public class Helado {
    
    private int id;
    private String marca;
    private String sabor;
    private String color;
    private int precio;
    private boolean agua;

    public Helado(String marca, String sabor, String color, int precio, boolean agua) {
        this.id = (int) (Math.random()*1000)+1;
        this.marca = marca;
        this.sabor = sabor;
        this.color = color;
        this.precio = precio;
        this.agua = agua;
    }

    public int getId() {
        return id;
    }
  
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }
    
    @Override
    public String toString(){
        return this.id+", "+this.marca+", "+this.sabor+", "+this.color+", "
                +this.precio+", "+this.agua;
    }
    
}
