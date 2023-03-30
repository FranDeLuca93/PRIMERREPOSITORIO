/*
 *Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package GUIA3;

import java.util.Scanner;


public class EJERCICIO5 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int limite,numSuma ;
         int suma = 0;
         System.out.println("INGRESE UN NUMERO LIMITE");
         limite = leer.nextInt();
        do {
            System.out.println("INGRESE UN VALOR A SUMAR");
            numSuma = leer.nextInt();
//            suma = numSuma + suma;
            suma +=numSuma;
        } while (suma <= limite);
        System.out.println("EL RESULTADO ES: " + suma );
         
    }
    
}
