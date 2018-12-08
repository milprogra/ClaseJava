/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays1;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] arr= new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ingrese numero "+(i+1));
            arr[i]= entrada.nextInt();
        }
        System.out.println("al revez");
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i-1]);
        }
    }
    
}
