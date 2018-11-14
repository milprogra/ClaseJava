/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1= entrada.nextInt();
        System.out.println("Ingrese otro numero");
        int num2= entrada.nextInt();
        
        if(num1%num2 == 0){
           System.out.println(num1+" es multiplo de "+num2); 
        }else{
           System.out.println(num1+" no es multiplo de "+num2);
        }
    }
    
}
