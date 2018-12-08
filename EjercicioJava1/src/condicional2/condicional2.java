/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional2;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int N = (int) (Math.random()*100)+1;
        int acertado= 0;
        do {
            System.out.println("ingrese un nunero:");
            int num= entrada.nextInt();
            if(num==N){
                System.out.println("acertaste al numero!");
                acertado=1;
            }else if(num>N){
                System.out.println("tu numero es mayor!");
            }else{
                System.out.println("tu numero es menor");
            }
        } while (acertado==0);
    }
    
}
