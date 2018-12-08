/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle2;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class bucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una longitud:");
        int longitud = entrada.nextInt();
        for (int i = 0; i < longitud; i++) {
            String linea="";
            for (int j = 0; j < longitud; j++) {
                linea += "*  ";
            }
            System.out.println(linea);
        }
    }
    
}
