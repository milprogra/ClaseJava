/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author mjara
 */
public class clase4 {

    public static void main(String[] args) {
        //definimos variables enteras
        int num1=3, num2=6, num3=10, num4=23;
        //creamos una variable resultado y llamamos al metodo suma
        double res= suma(13,9.3);
        //mostro el valor de res
        System.out.println(res);
        //llamamos al metodo multiplicacion y lo mostramos
        System.out.println(multiplicacion(num1,num4));
        //llamamos al procedimiento saludar
        saludar();
        //llamamos procedimiento menu
        menu(6);
        
    }
    //metodo para suma
    public static int suma(int num1, int num2){
        int suma = num1+num2;
        return suma;
    } 
    //mismo metodo para suma pero de decimales
    public static double suma(double num1, double num2){
        return num1+num2;
    }
    //mismo metodo suma para 1 entero y 1 decimal
    public static double suma(int num1,double num2){
        return num1+num2;
    }
    //metodo para multiplicacion
    public static int multiplicacion(int a,int b){
        return a*b;
    }
    //procedimiento
    public static void saludar(){
        System.out.println("Hola mundo!");
    }
    //procedimiento con argumento requerido
    public static void menu(int num1){
        switch(num1){
            case 1:
                System.out.println("menu 1");
                break;
            case 2:
                System.out.println("menu 2");
                break;
            default:
                System.out.println("ningun menu");
                break;
        }
    }
}
