/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas:"));

        String[] nombres = new String[cantPersonas];
        int[] edades = new int[cantPersonas];

        for (int i = 0; i < cantPersonas; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona " + (i + 1) + ":");
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de " + nombres[i] + ":"));
        }

        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Información de las personas:\n");

        for (int i = 0; i < cantPersonas; i++) {
            mensaje.append("Nombre: ").append(nombres[i]).append("\n");
            mensaje.append("Edad: ").append(edades[i]).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
    
}
