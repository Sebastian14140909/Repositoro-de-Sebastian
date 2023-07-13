/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] ventas = new double[5];
        
        
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese el monto vendido por el vendedor " + (i+1) + ": ");
            Scanner scanner = new Scanner(System.in);
            ventas[i] = scanner.nextDouble();
        }
        
       
        double totalVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            totalVentas += ventas[i];
            System.out.println("Monto total vendido por el vendedor " + (i+1) + ": " + ventas[i]);
        }
        
        
        System.out.println("Monto total vendido por todos los vendedores: " + totalVentas);
    }
}
   
    }
