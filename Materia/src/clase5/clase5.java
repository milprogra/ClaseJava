/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;
import models.Computador;
/**
 *
 * @author mjara
 */
public class clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar el objeto e instanciarlo
        Computador miCompu = new Computador();
        miCompu.id = 1;
        miCompu.marca= "apple";
        miCompu.modelo= "macbook";
        miCompu.procesador= "i5";
        miCompu.cantMemoria= 8;
        miCompu.disco= 500;
        miCompu.pantalla = 13.3;
        
        //declaracion segundo objeto
        Computador tuCompu = new Computador();
        tuCompu.id = 3;
        
        System.out.println(miCompu.id);
        System.out.println(tuCompu.id);
        System.out.println(miCompu.equals(tuCompu));
        
        //declarar un objeto e instanciarlo con argumentos
        Computador elCompu = new Computador(5,"lenovo","thinkpad");
        System.out.println(elCompu.modelo);
        
        Computador suCompu = new Computador("dell","inspiron",13.3);
        System.out.println(suCompu.pantalla);
        System.out.println(suCompu.cantMemoria);
        
        Computador compu1 = new Computador(7,"hp","pavilion","i7",12,1024,15.1);
    }
    
}
