/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)..
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grados,f;
        System.out.println("INGRESE LA TEMPERATURA EN GRADOS CENTIGRADOS");
        grados = leer.nextInt();
        f = 32 + (9*grados/5);
        System.out.println("LA TEMPERATURA EN FAHRENHEIT ES: " + f + "°");
        
    }
    
}
