/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menore
s de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”.

 */
package GUIA4;

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
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombres,opcion;
        
        int edad;
        
        do{        
            
        System.out.println("INGRESE EL NOMBRE");
        nombres = leer.next();
        
        System.out.println("INGRESE LA EDAD");
        edad = leer.nextInt();
        
        if (mayor_edad(edad)){
           System.out.println("La persona es mayor de edad; " );
       }
       else {
           System.out.println("La persona no es mayor de edad");
       }
       System.out.println("Desea ingresar otro nombre S/N");
       opcion = leer.next();
       } while (opcion.equalsIgnoreCase("s"));
    
    
        
            
        } 
        
        
    
    
public static boolean mayor_edad(int edad) {

    if (edad >= 18){
        return true;
    } 

    else {
        return false;
    }
}
}
