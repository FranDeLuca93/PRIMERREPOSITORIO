/*
 *
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. 

 */
package GUIA4;

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
        int num1,num2,opciones;
        
        
        System.out.println("INGRESE EL PRIMER VALOR");
        num1 = leer.nextInt();
        System.out.println("INGRESE EL SEGUNDO VALOR");
        num2 = leer.nextInt();
        System.out.println(" que operacion desea realizar: \n 1: sumar.\n 2: restar.\n 3: multi.\n 4: dividir");
        opciones = leer.nextInt();
        
        switch (opciones) {
            case 1:
                System.out.println("LA SUMA DE LOS NUMEROS ES :"+ sumar (num1,num2));
                break;
            case 2:
                System.out.println("LA RESTA DE LOS DOS VALORES ES :"+ restar(num1,num2));
                break;
            case 3:
                System.out.println("LA MULTIPLICACION DE LOS VALORES ES :"+ multiplicar(num1,num2));
                break;
            case 4:
                 System.out.println("LA DIVICION DE LOS VALORES ES :"+ dividir(num1,num2));
                 break;
                
              
        }
        
        
        // TODO code application logic here
    }
    public static int sumar(int num1,int num2){
    int sumar;
    sumar = num1 + num2 ;
    return sumar;
    }
   public static int restar(int num1,int num2){
    int restar;
    restar = num1 - num2 ;
    return restar;
    }
   public static int multiplicar(int num1,int num2){
    int multiplicar;
    multiplicar = num1 * num2 ;
    return multiplicar;
    }
   public static float dividir(float num1,float num2){
    float dividir;
     dividir = num1 / num2 ;
    return dividir;
    }
}

