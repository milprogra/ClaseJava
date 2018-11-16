/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion arrays mas instanciacion
        int[] arreglo1 = new int[5]; 
        System.out.println(arreglo1[3]);
        
        //forma tonta de hacerlo o larga
        arreglo1[0]= 5;
        arreglo1[1]= 3;
        arreglo1[2]= 51;
        arreglo1[3]= 566;
        arreglo1[4]= 52;
        System.out.println(arreglo1[1]);
        
        //declaracion array y posterior instanciacion
        String[] arreglo2, arreglo3, arreglo4;
        arreglo3 = new String[4];
        System.out.println(arreglo3[1]);
        
        //instanciar y asignar datos a array
        arreglo4 = new String[]{"git","cd","mkdir"};
        System.out.println(arreglo4[2]);
        
        //declarar array, instanciar y asignar de forma corta
        double[] arreglo5 = {0.3, 3, 12.6, 23.34567};
        System.out.println(arreglo5[1]);
        
        //Recorrer un array
        String[] perritos = {"firulais", "cachupin", "rex", "wafle", "mufasa"};
        
        for(int i=0;i<perritos.length;i++){
            System.out.println(perritos[i]);
        }
        
        //recorrer un array para asignar
        Scanner entrada = new Scanner(System.in);
        String[] gatitos = new String[6];
        
        for(int i=0;i<gatitos.length;i++){
            //System.out.println("ingrese el nombre del gatito "+(i+1));
            //gatitos[i] = entrada.nextLine();
        }
        
        for(String gato: gatitos){
            //System.out.print(gato+" ");
        }
        
        //declaracion de matriz e instanciarla
        char[][] matriz1 = new char[3][3];
        
        //asignarla de forma tonta
        matriz1[0][0]= 'b';
        matriz1[0][1]= 'c';
        matriz1[0][2]= 'd';
        matriz1[1][0]= 'y';
        matriz1[1][1]= 'e';
        matriz1[1][2]= 'f';
        matriz1[2][0]= 'x';
        matriz1[2][1]= 'z';
        matriz1[2][2]= 'h';
        
        //Consultamos valor de un puesto en una matriz
        System.out.println(matriz1[1][2]);
        System.out.println(matriz1[0][2]);
        
        //declarar una matriz, instanciarla y asignarle valores
        int[][] matriz2 = {{2,4,6},{2,5,7}};
        String[][] matriz3= new String[][]{
            {"jose","pedro","juan"},
            {"judas","mateo","lucas"},
            {"felipe","santiago","matias"}
        };
        
        //recorrer una matriz
        for(int i=0;i<matriz3.length;i++){
            for(int x=0;x<matriz3[i].length;x++){
                System.out.println(matriz3[i][x]);
            }
        }
        
        for(int i=0;i<matriz1.length;i++){
            String linea= "";
            for(int x=0;x<matriz1[i].length;x++){
                linea +="["+matriz1[i][x]+"]";
            }
            System.out.println(linea);
        }
    }
    
}
