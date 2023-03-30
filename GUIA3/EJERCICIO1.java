/*
 *
Crear un programa que dado un número determine si es par o impar.

 */
package GUIA3;

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
        int num;
        System.out.println("INGRESE UN NUMERO PARA SABER SI ES PAR O IMPAR");
        num = leer.nextInt();
        if (num % 2 == 0) {;
            System.out.println("EL NUMERO ES PAR");
        } else {
            System.out.println("EL NUMERO ES IMPAR");
        }

    }
}
