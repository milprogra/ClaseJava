/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos2;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import models.Estudiante;
import models.Profesor;
/**
 *
 * @author mjara
 */
public class objetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Estudiante alumno;
        Profesor profe;
        int seleccion= 0;
        do{
            System.out.println(":: Menu ::\n1) Ingresar profesor\n2) Ingresar alumno\n3) Menu Notas\n4) Menu Promedio\n0) Salir\ningrese seleccion:");
            seleccion = entrada.nextInt();
            switch(seleccion){
                case 1:
                    profe= new Profesor();
                    menuProfesor(profe);
                break;
                case 2:
                    alumno= new Estudiante();
                    menuAlumno(alumno);
                break;
                case 3:
                    menuNotas();
                break;
                case 4:
                    menuPromedio();
                break;
                case 0:
                    System.out.println("Adios! :)");
                break;
                default:
                    System.out.println("ingrese un valor correcto!");
                break;
            }
        TimeUnit.SECONDS.sleep(2);
        }while(seleccion!=0);
        
    }
    public static void menuProfesor(Profesor profe){
        Scanner sc= new Scanner(System.in);
        System.out.println(":: Menu Profesor ::\ningrese nombre:");
        profe.setNombre(sc.nextLine());
        System.out.println("ingrese apellido:");
        profe.setApellido(sc.nextLine());
        System.out.println("ingrese sexo (masculino/femenino):");
        profe.setSexo(sc.nextLine());
        System.out.println("ingrese direccion:");
        profe.setDireccion(sc.nextLine());
        System.out.println("ingrese telefono:");
        profe.setTelefono(sc.nextLine());
        System.out.println("ingrese asignatura:");
        profe.setAsignatura(sc.nextLine());
        System.out.println("ingrese sueldo:");
        profe.setSueldo(Integer.parseInt(sc.nextLine()));
        System.out.println("ingresado con exito!");
        profe.mostrarDatos();
    }
    public static void menuAlumno(Estudiante alumno){
        Scanner sc= new Scanner(System.in);
        System.out.println(":: Menu Alumno ::\ningrese nombre:");
        alumno.setNombre(sc.nextLine());
        System.out.println("ingrese apellido:");
        alumno.setApellido(sc.nextLine());
        System.out.println("ingrese sexo (masculino/femenino):");
        alumno.setSexo(sc.nextLine());
        System.out.println("ingrese direccion:");
        alumno.setDireccion(sc.nextLine());
        System.out.println("ingrese telefono:");
        alumno.setTelefono(sc.nextLine()); 
    }
    public static void menuNotas(){
        System.out.println(":: Menu Notas ::");
        
    }
    public static void menuPromedio(){
        Scanner sc= new Scanner(System.in);
        System.out.println(":: Menu Promedio ::");
        
    }
}
