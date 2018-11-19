/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Dragon;
/**
 *
 * @author mjara
 */
public class clase5ParteDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // declarar un objeto e instanciarlo con argumentos
        Dragon elDragon = new Dragon("smaug"," dragoncito",500.5,200,"rojo","macho");
        System.out.println(elDragon.getNombre());
        System.out.println(elDragon.getColor());
        elDragon.setNombre("spyro");
        elDragon.setColor("purpura");
        System.out.println(elDragon.getNombre());
        System.out.println(elDragon.getColor());
        
        Date fecha= new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-12");
        System.out.println(fecha);
    }
    
}
