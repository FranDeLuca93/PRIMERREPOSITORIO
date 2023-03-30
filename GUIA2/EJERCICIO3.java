/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("INGRESE UNA FRASE");
        frase = leer.nextLine();
        System.out.println(" ");
        System.out.println(frase.toUpperCase());
        System.out.println(" ");
        System.out.println(frase.toLowerCase());
       
        
    }
    
}
