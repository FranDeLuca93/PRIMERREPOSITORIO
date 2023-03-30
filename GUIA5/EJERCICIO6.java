/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
r.
 */
package GUIA5;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       // int matriz [][] = new int[3][3];
        int [][] matriz = {{2,7,6},{9,5,1},{4,3,8}};
        int diagonal1,diagonal2,cont;
        int sumaH[] = new int[3];
        int sumaV[] = new int[3];
        int sumaD[] = new int[3];
        diagonal1 = 0;
        diagonal2 = 0;
        cont = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              //  System.out.println("INGRESE UN NUMERO EN EL VALOR:");
              //  matriz [i][j] = leer.nextInt();
                if (matriz[i][j] >= 1 && matriz[i][j] <= 9){
                                     
                }else{
                    System.out.println("SOLO PUEDE INGRESAR VALORES DEL 1 AL 9");
                    j--;
                }
                
                
            }
           
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+ matriz[i][j] +"]");
                
            }
            System.out.println(" ");
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaH[i]= sumaH[i]+matriz[i][j];
                sumaV[i]=sumaV[i]+matriz[i][j];
             
                
            }
              System.out.println("LA SUMA DE LAS COLUMNAS ES :"+sumaH[i]);
            System.out.println("LA SUMA DE LAS FILAS ES: "+sumaV[i]);
           
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                   if (i==j) {
                    diagonal1 = diagonal1+matriz[i][j];
                    
               //}else if (i+j==2) {
               //    diagonal2 = diagonal2+matriz[i][j];
                }
                
            }
                       
        }
               
        System.out.println(+diagonal1);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                   if (i+j==2) {
                    diagonal2 = diagonal2+matriz[i][j];
                    
               //}else if (i+j==2) {
               //    diagonal2 = diagonal2+matriz[i][j];
                }
                
            }
                       
        }
        System.out.println("LA SUMA DE LA SEGUNDA DIAGONAL ES: "+diagonal2);
        if (diagonal1==diagonal2) {
            for (int i = 0; i < matriz.length ; i++) {
                if (sumaH[i]==sumaV[i] && sumaH[i]==diagonal1){
                    
                }
                
            }
            System.out.println("***LA CAJA ES MAGICA***");
        }
    }

    
}
