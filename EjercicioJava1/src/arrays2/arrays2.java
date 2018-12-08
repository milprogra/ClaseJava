package arrays2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mjara
 */
public class arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar arreglo entero
        int[] num = new int[10];
        //recorrer arreglo asignandole entero
        for (int i = 0; i < num.length; i++) {
            num[i]= i+1;
        }
        
        for (int i = 0; i <=4; i++) {
            System.out.println(num[i]);
            System.out.println(num[9-i]);
        }
    }
    
}
