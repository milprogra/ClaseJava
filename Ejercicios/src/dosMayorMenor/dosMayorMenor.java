/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosMayorMenor;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class dosMayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        int num1 = entrada.nextInt();
        System.out.println("ingrese otro numero:");
        int num2 = entrada.nextInt();
        
        if(num1>num2){
            System.out.println(num1+" , "+num2);
        }else{
            System.out.println(num2+" , "+num1);
        }
    }
    
}
