/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;
import models.Computador;
import models.Dragon;
import java.util.ArrayList;

/**
 *
 * @author mjara
 */
public class clase7ParteDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comparar ArrayList de enteros con arreglo entero
        int[] arr = new int[5];//declaracion de arreglo
        ArrayList<Integer> num = new ArrayList<Integer>();
        //asignar valor 
        arr[0] = 1;//arreglo simple
        num.add(3);//lista
        
        for (int i = 0; i < 1000; i++) {
            num.add((int) (Math.random()*30));
        }
        System.out.println(num.size());
        System.out.println(num.get(56));
        
        //Arraylist de Strings
        ArrayList<String> palabra = new ArrayList<String>();
        
        for (int i = 0; i < 1000; i++) {
            String[] arreglo= new String[]{"jose","manuel","miguel","nicolas","camila","fernanda","nayareth","jennifer","yamile"};
            palabra.add(arreglo[(int) (Math.random()*8)]);
        }
        System.out.println(palabra.size());
        System.out.println(palabra.get(0));
        System.out.println(palabra.get(23));
        System.out.println(palabra.get(12));
        System.out.println(palabra.get(29));
        
        //ArrayList de objetos
        ArrayList<Computador> listaCompu = new ArrayList<Computador>();
        Computador compu1 = new Computador(1,"dell","inspiron");
        Computador compu2 = new Computador(2,"acer","aspire");
        Computador compu3 = new Computador(3,"hp","pavilion");
        Computador compu4 = new Computador(4,"lenovo","thinkpad");
        Computador compu5 = new Computador(5,"asus","x556");
        listaCompu.add(compu1);
        listaCompu.add(compu2);
        listaCompu.add(compu3);
        listaCompu.add(compu4);
        listaCompu.add(compu5);
        System.out.println(listaCompu.size());
        System.out.println(listaCompu.get(4).marca);
        //listaCompu.remove(2);
        System.out.println(listaCompu.get(2).marca);
        listaCompu.add(2, compu5);
        System.out.println(listaCompu.get(2).marca);
        System.out.println(listaCompu.get(4).marca);
        System.out.println(listaCompu.indexOf(compu5));
        System.out.println(listaCompu.lastIndexOf(compu5));
        System.out.println(listaCompu.size());
        //listaCompu.clear();
        //System.out.println(listaCompu.size());
        listaCompu.get(4).modelo = "x557";
        System.out.println(listaCompu.get(4).modelo);
        listaCompu.get(4).setTarjetaVideo("gtx 1080");
        System.out.println(listaCompu.get(4).getTarjetaVideo());
        
    }
    
}
