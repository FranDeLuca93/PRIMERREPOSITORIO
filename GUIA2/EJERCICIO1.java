/*
 * Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma

 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 , num2;
        System.out.println("INGRESE UN NUMERO A SUMAR");
        num1 = leer.nextInt();
        System.out.println("INGRESE SEGUNDO NUMERO A SUMAR");
        num2 = leer.nextInt();
        System.out.println("EL TOTAL ES: " + (num1 + num2) );
    }
    
}
