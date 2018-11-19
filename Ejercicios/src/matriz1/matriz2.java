/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz1;

/**
 *
 * @author mjara
 */
public class matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int cont=1;
        int fin= matriz.length-1;
        String linea="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j==fin) {
                    matriz[i][j]= cont;
                    cont++;
                    fin--;
                 }
                linea +="["+matriz[i][j]+"]";
            }
            linea+= "\n";
        }
        System.out.println(linea);
    }
    
}
