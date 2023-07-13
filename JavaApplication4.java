/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Random;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

       
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(1000) + 1;
            }
        }

       
        int minimo = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
        }

    
        System.out.println("El valor mínimo almacenado en la matriz es: " + minimo);
    }
}

    
