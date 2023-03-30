/*
 * TRealizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
.
 */
package GUIA5;

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
       
       int[] vector = new int[101];
       
       for (int i = 0 ; i < 101; i++) {
        vector[i] = i;
    }
    
       for (int i = 0; i < 101; i++) {
           System.out.println("[" + vector[i] + "]");
       }
}
}