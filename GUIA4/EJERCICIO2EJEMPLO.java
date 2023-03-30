/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO2EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       String nombre, opcion ;
       int edad ;  
       
       do{
           
       System.out.println("Ingrese el nombre de una persona");
       nombre = leer.next();
       
       System.out.println("Ingrese su edad");
       edad = leer.nextInt();
       
       if (mayor_edad(edad)){
           System.out.println("La persona es mayor de edad; " );
       }
       else {
           System.out.println("La persona no es mayor de edad");
       }
       System.out.println("Desea ingresar otro nombre S/N");
       opcion = leer.next();
       } while (opcion.equalsIgnoreCase("s"));
    
    }
 
public static boolean mayor_edad(int edad) {

    if (edad >= 18){
        return true;
    } 

    else {
        return false;
    }
}
}
    
    

