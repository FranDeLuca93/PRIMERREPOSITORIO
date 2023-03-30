/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).

 */
package GUIA5;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int min,max;
        
        min = -9;
        max = 9;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
          //      matriz[i][j] = (int)(Math.random()*(max-min+1)+min);//esto da valores aleatorios positivos y negativos en el random
          matriz[i][j] = leer.nextInt(); 
                System.out.print("[" +matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
      for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) { 
                matriz2[i][j] = matriz[j][i];
               System.out.print("[" +matriz2[i][j]+"]");
            }   
            System.out.println("");
      }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              if (matriz[i][j] - matriz2[j][i] == 0){
                   System.out.println("ES ATISIMETRICA");
              }else{
                  System.out.println("no");
            }
            System.out.println(" ");
        }
    
}
    }
}