/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays3;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class arrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < 8; i++) {
            System.out.println("ingrese numero "+(i+1));
            int ingreso = entrada.nextInt();
            num[i]= ingreso;
        }
        
        System.out.println("ingrese una posicion:");
        int posicion = entrada.nextInt();
        System.out.println("ingrese un numero:");
        int numero = entrada.nextInt();
        
        for (int i = 9; i > posicion; i--) {
            num[i] = num[i-1];
            if(i==(posicion+1)){
                num[posicion]= numero;
            }
        }
        for(int num1: num){
            System.out.println(num1);
        }
    }
    
}
