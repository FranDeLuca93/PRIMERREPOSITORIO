/*
 *Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se 
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java..
 */
package GUIA3;

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
        String texto;
        System.out.println("INGRESE UNA FRASE O PALABRA DE 8 DIGITOS COMO MAXIMO");
        texto = leer.nextLine();
        if (texto.length()<8){;
        System.out.println("ES CORRECTO");
        }else
            System.out.println("ES INCORRECTO");
        {
    }
        
                
        
        
        
        
        
    }
    
}
