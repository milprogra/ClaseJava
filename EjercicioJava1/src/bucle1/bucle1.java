/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle1;

/**
 *
 * @author mjara
 */
public class bucle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] matriz = new String[13][10];
        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j <= 12; j++) {
                matriz[j][(i-1)]= (i+"x"+j+"="+(i*j));
            }
        }
        for(int i = 0; i < matriz.length; i++) {
            String linea="";
            for(int j = 0; j < matriz[i].length; j++) {
                linea += matriz[i][j]+"\t";
            }
            System.out.println(linea);
        }
    }
    
}
