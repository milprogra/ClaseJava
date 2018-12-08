/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7;
import java.util.ArrayList;
import java.util.Scanner;
import models.Helado;
/**
 *
 * @author mjara
 */
public class clase7ParteTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Helado> helado = new ArrayList<Helado>();
        int seleccion = 0;
        do {
            System.out.println(":: Menu ::");
            System.out.println("1) ingresar helado\n2) mostrar helados\n0) salir");
            System.out.println("Ingrese seleccion:");
            seleccion = entrada.nextInt();
            entrada.skip("\n");
            switch (seleccion) {
                case 1:
                    System.out.println("ingrese marca:");
                    String marca= entrada.nextLine();
                    System.out.println("ingrese sabor:");
                    String sabor= entrada.nextLine();
                    System.out.println("ingrese color:");
                    String color= entrada.nextLine();
                    System.out.println("ingrese precio:");
                    int precio = entrada.nextInt();
                    entrada.skip("\n");
                    System.out.println("es de agua?(true/false)");
                    boolean agua = entrada.nextBoolean();
                    Helado iceCream = new Helado(marca,sabor,color,precio,agua);
                    helado.add(iceCream);
                break;
                case 2:
                    for(int i = 0; i < helado.size(); i++) {
                        System.out.println(helado.get(i).toString());
                    }
                break;
                case 0:
                    System.out.println("adios!");
                    break;
                default:
                    System.out.println("ingrese otro numero!");;
            }
            
        } while (seleccion!=0);
        
    }
    
}
