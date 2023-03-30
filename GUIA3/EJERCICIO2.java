/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
.
 */
package GUIA3;

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
        String texto;
        
        System.out.println("INGRESE LA FRASE SECRETA");
        texto = leer.nextLine();
        
        
      if (texto.equals("eureka")) {;
          System.out.println("ES CORRECTA");
      }else {
          System.out.println("LA FRASE ES INCORRECTA!");
      }
        
        
        
        {
     
    }
    }  
}
