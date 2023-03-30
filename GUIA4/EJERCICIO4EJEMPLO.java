/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO4EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        boolean esPrimo = Primo(numero);
        if(esPrimo){
            System.out.println("es primo");
        }else{
            System.out.println("no es primo");
        }
    }
    public static boolean Primo(int numero){
        if(1>=numero){
            return false;
        }
       for(int i=2;i<= Math.sqrt(numero);i++){
           if(numero%i==0){
               return false;
           }
       }
       return true;
    }
    
}
    
    

