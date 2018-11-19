/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import clase4.metodos;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author mjara
 */
public class menu {
    //procedimiento para menu
    public void menu() throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        int seleccion=0;
        do{
        System.out.println(":: Menu ::\n1)suma\n2)resta\n3)multiplicacion\n4)division\n0)salir\ningrese seleccion:");
        seleccion = entrada.nextInt();
        switch(seleccion){
            case 1:
                System.out.println(":: SUMA ::\nIngresa un numero:");
                int num1 = entrada.nextInt();
                System.out.println("Ingresa otro numero:");
                int num2 = entrada.nextInt();
                System.out.println("el resultado es "+metodos.suma(num1, num2));
                break;
            case 2:
                System.out.println(":: RESTA ::\nIngresa un numero:");
                int num3 = entrada.nextInt();
                System.out.println("Ingresa otro numero:");
                int num4 = entrada.nextInt();
                System.out.println("el resultado es "+metodos.resta(num3, num4));
                break;
            case 3:
                System.out.println(":: MULTIPLICACION ::\nIngresa un numero:");
                int num5 = entrada.nextInt();
                System.out.println("Ingresa otro numero:");
                int num6 = entrada.nextInt();
                System.out.println("el resultado es "+metodos.multiplicacion(num5, num6));
                break;
            case 4:
                System.out.println(":: DIVISION ::\nIngresa un numero:");
                int num7 = entrada.nextInt();
                System.out.println("Ingresa otro numero:");
                int num8 = entrada.nextInt();
                System.out.println("el resultado es "+metodos.division(num7, num8));
                break;
            case 0:
                System.out.println("chaito! :)");
                break;
            default:
                System.out.println("comando mal ingresado");
                break;
            }
        TimeUnit.SECONDS.sleep(3);
        }while(seleccion!=0);
        
    }
}
