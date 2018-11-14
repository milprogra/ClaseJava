/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresMayorMenor;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class tresMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese numero 1:");
        int num1 = entrada.nextInt();
        System.out.println("ingrese numero 2:");
        int num2 = entrada.nextInt();
        System.out.println("ingrese numero 3:");
        int num3 = entrada.nextInt();
        
        if(num1>num2 && num1>num3){
            if(num2>num3){
                System.out.println(num1+","+num2+","+num3);
            }else{
                System.out.println(num1+","+num3+","+num2);
            }
        }else if(num2>num1 && num2>num3){
            if(num1>num3){
                System.out.println(num2+","+num1+","+num3);
            }else{
                System.out.println(num2+","+num3+","+num1);
            }
        }else{
            if(num1>num2){
                System.out.println(num3+","+num1+","+num2);
            }else{
                System.out.println(num3+","+num2+","+num1);
            }
        }
    }
    
}
