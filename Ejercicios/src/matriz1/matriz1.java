/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz1;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese longitud matriz:");
        int longitud = entrada.nextInt();
        int[][] matriz = new int[longitud][longitud];
        int num1= matriz.length-1 ;
        int cont= 1;
        for(int i=0;i<matriz.length;i++){
            for(int x=0;x<matriz[i].length;x++){
                if(x==num1){
                    matriz[i][x]= cont;
                    cont++;
                    num1--;
                }
            }
        }
        for(int i=0;i<matriz.length;i++){
            String linea= "";
            for(int x=0;x<matriz[i].length;x++){
                linea+= "["+matriz[i][x]+"]";
            }
            System.out.println(linea);
        }
    }
    
}
