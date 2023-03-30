/*
 *Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’
. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package GUIA3;

import java.util.Scanner;

public class EJERCICIO4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto;
        System.out.println("INGRESE UNA FRASE O PALABRA");
        texto = leer.nextLine();

        String letra = texto.substring(0, 1);

        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Es correcto");
  
        }else {
            System.out.println("Es incorrecto");
        }
       
         

       }

    }

