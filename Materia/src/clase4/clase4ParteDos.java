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
public class clase4ParteDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1=3, num2=6;
       int res = metodos.resta(num1, num2);
       System.out.println(res);
       System.out.println(metodos.suma(num1, num2));
       System.out.println(metodos.division(num2, num1));
       System.out.println(metodos.multiplicacion(num1, num2));
       
       //instanciar metodos desde clase metodos
       metodos metodo = new metodos();
       System.out.println(metodo.residual(num1, num2));
       
    }
    
}
