/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivoNegativo;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class positivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1= entrada.nextInt();
        
        if(num1==0){
            System.out.println("Es cero");
        }else if(num1>0){
            System.out.println("es positivo");
        }else{
            System.out.println("es negativo");
        }
    }
    
}
