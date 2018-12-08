/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;
import models.Computador;
/**
 *
 * @author mjara
 */
public class clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar arrays de objetos
        Computador[] arr = new Computador[5];
        Computador comp = new Computador(1,"dell","inspiron");
        arr[0]= comp;
        Computador comp2 = new Computador(2,"acer","aspire");
        arr[1]= comp2;
        Computador comp3 = new Computador(3,"hp","pavilion");
        arr[2]= comp3;
        Computador comp4 = new Computador(4,"lenovo","thinkpad");
        arr[3]= comp4;
        Computador comp5 = new Computador(5,"asus","x556");
        arr[4]= comp5;
        System.out.println(arr[3].marca);
        System.out.println(arr.length);
        
        //recorrer arreglo de objetos
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].marca);            
        }
        
        System.out.println(comp5.modelo);
        System.out.println(arr[4].modelo);
        
        //comparar arreglo de objeto con objeto
        if (comp5.modelo.equals(arr[4].modelo)) {
            System.out.println("son iguales");
        }else{
            System.out.println("Anda a laar");
        }
    }
    
}
