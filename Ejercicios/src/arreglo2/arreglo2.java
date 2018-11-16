/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamaño de arreglo:");
        int largo = entrada.nextInt();
        int[] array = new int[largo];
        int acum= 0;
        
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*9);
            acum += array[i];
        }
        for(int i=0;i<array.length;i++){
            System.out.println("la posicion "+i+", su valor es "+array[i]);
        }
        System.out.println("la suma fue "+acum);
    }
}
