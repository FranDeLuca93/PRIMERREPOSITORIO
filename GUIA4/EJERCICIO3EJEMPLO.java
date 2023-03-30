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
public class EJERCICIO3EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double euro= 0;
      String convertir="";
      conversor(euro,convertir);
      
        
        
    }
    
    
    public static void conversor(double euro, String convertir) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros a convertir");
        euro = leer.nextInt();
        System.out.println("Elija ua opcion\n a)Euro a Libra\n b) Euro a Dolar\n c) Euro a Yen ");
        convertir = leer.next();
        
        switch (convertir) {
            case "a":

                    euro = euro * 0.86;
                  
                    System.out.println("La cantidad de euros ingresados convertidos a libras es: "+euro);

                    break;

                case "b":
                    euro = euro * 1.28611;
                  
                    System.out.println("La cantidad de euros ingresados convertidos a Dolares es: "+euro);

                    break;

                case "c":
                    euro = euro * 129.852;
                  
                    System.out.println("La cantidad de euros ingresados convertidos a Yenes es: "+euro);

                    break;
                default:
                        System.out.println("");
                        break;
        
        }
        
    
         System.out.println("");
    
    
    }
}