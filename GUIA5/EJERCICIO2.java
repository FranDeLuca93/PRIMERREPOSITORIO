/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará
dónde se encuentra el numero y si se encuentra repetido
.
 */
package GUIA5;

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
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 9+1);
            System.out.println (vector[i]);
        
        
        }
        System.out.println("INGRESE UN NUMERO PARA BUSCAR");
        int buscar = 0;
        int aux = 0;
        
        buscar = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                aux++;
                System.out.println("EL NUMERO SE ECONTRO EN LA POCICION: " + (i+1));

            }

        }

        System.out.println("ENCONTRO EL NUMERO = " + buscar + " SE ENCONTRO :"+ aux + " VECES :");
    }

}
