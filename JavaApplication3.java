/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int sumaEsquinas = matriz[0][0] + matriz[0][n - 1] + matriz[n - 1][0] + matriz[n - 1][n - 1];
        System.out.println("La suma de las 4 esquinas es: " + sumaEsquinas);

        int sumaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal += matriz[i][i];
        }
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);

        int sumaDiagonalInversa = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonalInversa += matriz[i][n - 1 - i];
        }
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);

        int maximo = matriz[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        System.out.println("El número mayor de la matriz es: " + maximo);
    }
}

    

    
