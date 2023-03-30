/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

/**
 *
 * @author Francisco
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("La traspuesta es: \n");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }

}
    

