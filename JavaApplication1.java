/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastián
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fechaNac=new GregorianCalendar(2000,01,01);
        Calendar fechaHoy=Calendar.getInstance();
        int anoNac=fechaNac.get(Calendar.YEAR);
        int anoHoy=fechaHoy.get(Calendar.YEAR);
        int edad=anoHoy−int anoNac = anoNac;
        System.out.println("Edad="+edad);
    }
    
}
