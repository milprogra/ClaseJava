/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author mjara
 */
public class clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipo de datos numeros
        byte num1;
        short num2;
        int num3;
        long num4;
        
        // tipo de dato decimal
        double decimal1;
        float decimal2;
        
        //tipo de dato caracter
        char caracter1;
        
        //Tipo de dato booleano
        boolean decision;
        
        //multiple variables
        int numeral1, numeral2, numeral3;
        double decimal3, decimal4, esDecimal; 
        
        //inicializacion de variable
        int n1 = 5;
        int n2=10, n3=15;
        
        double d1= 13.56;
        double d2=245.6, d3=345.1243566;
        
        char char1= 'a';
        char char2='b', char3='g';
        
        boolean verdad= true;
        boolean si=true, no=false;
        
        //inicializacion variable a la old school
        Integer nume1 = new Integer(152);
        
        //trabajar con String
        String hola;
        hola = "wena po";
        System.out.println(hola);
        
        String nombre= "Matias Jara Figueroa";
        System.out.println(nombre);
        
        //concatenar palabras
        String palabra1="hey";
        String palabra2="wey";
        System.out.println(palabra1+palabra2);
        System.out.println(palabra1+" "+palabra2);
        System.out.println(palabra1+" pinche "+palabra2);
        System.out.println(palabra1+5);
        System.out.println(5+palabra1);
        System.out.println(7+5+palabra1);
        System.out.println(palabra1+7+5);
        System.out.println(palabra1+(7+5));
        
        //Re asignar una variable String
        String perro= "firulais";
        System.out.println(perro);
        
        perro= "spike";
        System.out.println(perro);
        
        // concatenar y guardar en la misma variable
        String oracion= "Erase una vez";
        oracion = oracion+" en mexico";
        System.out.println(oracion);
        
        String oracion2= "habia una vez";
        oracion2 += " un pequeño manati";
        System.out.println(oracion2);
        
        //comparar String
        String comp1="lo que sea", comp2="lo que sea!";
        if(comp1.equals(comp2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        System.out.println(comp1.equals(comp2));
        
        // metodo length
        String cuento= "Habia una linda ardilla en su casa";
        System.out.println(cuento.length());
        
        int cantidadCaracter= cuento.length();
        System.out.println(cantidadCaracter);
        
        // metodo indexOf
        String cuento2= "Una ardilla malvada";
        System.out.println(cuento2.indexOf('a'));
        System.out.println(cuento2.indexOf("illa"));
        
        //metodo lastIndexOf
        String cuento3= "Una ardilla justiciera";
        System.out.println(cuento3.lastIndexOf('t'));
        System.out.println(cuento3.lastIndexOf("iciera"));
        
        //metodo upper and lower case
        String cuento4= "Era una legion de ardillas nijas";
        cuento4 = cuento4.toUpperCase();
        System.out.println(cuento4);
        System.out.println(cuento4.toLowerCase());
        
        //metodo charAt
        String juego= "World of warcraft";
        System.out.println(juego.charAt(7));
        System.out.println(juego.charAt(0));
        
        //operadores aritmeticos
        int nu1=5, nu2=8, nu3=12;
        double do1=35.8, do2= 267.235667;
        int res;
        
            //sumas
            System.out.println(nu1+nu2);
            System.out.println(nu1+nu3);
            System.out.println(do1+do2);
            System.out.println(nu1+do2);
            
        res = nu1+nu3;
        double resu = nu1+nu3;
        System.out.println(resu);
        
            //restas
            System.out.println(nu1-nu2);
            System.out.println(nu1-nu3);
            System.out.println(do1-do2);
            System.out.println(nu1-do2);
            
            //multiplicacion
            System.out.println(nu1*nu2);
            System.out.println(nu1*nu3);
            System.out.println(do1*do2);
            System.out.println(nu1*do2);
            
            //division
            System.out.println(nu2/nu1);
            System.out.println(nu1/nu3);
            System.out.println(do1/do2);
            System.out.println(nu1/do2);
            
            // MOD
            System.out.println(nu2%nu1);
            System.out.println(nu1%nu3);
            System.out.println(do1%do2);
            System.out.println(nu1%do2);
            
            //potencias
            System.out.println(Math.pow(nu1, nu2));
    }
    
}
