/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author mjara
 */
public class clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sentencia if
        String palabra1="curso", palabra2="curso";
        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }
        
        //sentencia if-else
        palabra2= "osorno";
        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("no son iguales");
        }
        
        //sentencia if-else anidado
        int num1=5,num2=16,num3=8;
        if(num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }else{
            if(num2>num3){
                System.out.println(num2+" es mayor que "+num3);
            }else{
                System.out.println(num3+" es mayor que "+num2);
            }
        }
        
        //sentencia if-else-if
        if(num1>num2){
            System.out.println(num1+" es mayor que "+num2);
        }else if(num2>num3){
            System.out.println(num2+" es mayor que "+num3);
        }else{
            System.out.println(num3+" es mayor que "+num2);
        }
        
        //Uso de Switch
        int seleccion=5;
        
        switch(seleccion){
            case 1:
                System.out.println("la seleccion es 1");
            break;
            case 2:
                System.out.println("la seleccion es 2");
            break;
            case 3:
                System.out.println("la seleccion es 3");
            break;
            default:
                System.out.println("la seleccion es "+seleccion);
            break;
        }
        
        //Ciclo For
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        
        //Sentencia While
        int seleccion2=0;
        int cont=1;
        while(seleccion2<5){
           System.out.println("es la vuelta numero "+cont);
           cont++;
           seleccion2++;
        }
        
        //Sentencia do-while
        int seleccion3=6;
        cont=0;
        do{
            System.out.println("es la ejecucion "+cont);
            seleccion3++;
            cont++;
        }while(seleccion3<5);
        
        //metodo scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
        String nombre = entrada.nextLine();
        System.out.println(nombre);

    }
    
}
