/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable
y lo muestre por pantalla.

 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("INGRESE SU NOMBRE");
        nombre = leer.nextLine();
        System.out.println("BUENAS TARDES " + nombre + " YA ESTA FUNCIONANDO");        
        
    }
    
}
