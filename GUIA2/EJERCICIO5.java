/*
 * Escribir un programa que lea un número entero por teclado y muestre por
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package GUIA2;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("INGRESE UN NUMERO PARA VER SU DOBLE, TRIPLE Y RAIZ CUADRADA");
        num = leer.nextInt();
        System.out.println("EL DOBLE ES :" + num*2);
        System.out.println("EL TRIPLE ES :"+ num*3);
        System.out.println("LA RAIZ ES :" + Math.sqrt(num));
    }
    
}
