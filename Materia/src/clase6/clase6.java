/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6;
import models.Bicicleta;
import models.MountainBike;
import models.Pistera;
/**
 *
 * @author mjara
 */
public class clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar un objeto e instanciarlo
        Pistera pistera = new Pistera("liso","fijo","cuernos de toro","mango","modelo",2.0,"naranja",1);
        System.out.println(pistera.getMarca());
        
    }
    
}
