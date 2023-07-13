/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author LABORATORIO 04
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar el tamaño del arreglo al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamano del arreglo: ");
        int tamanoArreglo = scanner.nextInt();

       
        String[] arreglo = llenarArreglo(tamanoArreglo);

        
        mostrarArreglo(arreglo);
    }

    public static String[] llenarArreglo(int tamano) {
        Scanner scanner = new Scanner(System.in);
        String[] arreglo = new String[tamano];
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            arreglo[i] = scanner.nextLine();
        }
        return arreglo;
    }

    public static void mostrarArreglo(String[] arreglo) {
        System.out.println("Los datos almacenados son:");
        for (String dato : arreglo) {
            System.out.println(dato);
        }
    }
}

    
        
    

    
