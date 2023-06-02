/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SalarioTrabajador;

/**
 *
 * @author John Paul
 */
import javax.swing.JOptionPane;

public class SalarioTrabajador {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del trabajador:");
        double salarioSemanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario semanal:"));

        double salarioMensual = salarioSemanal * 4; // Se multiplica por 4 para obtener el salario mensual
        double deducciones = salarioMensual * 0.0934; // Deducciones correspondientes al 9.34%
        double salarioNeto = salarioMensual - deducciones;

        String mensaje = "Estimado " + nombre + ", el salario de este mes se desglosa de la siguiente manera:\n"
                + "Salario bruto: $" + salarioMensual + "\n"
                + "Deducciones: $" + deducciones + "\n"
                + "Salario Neto: $" + salarioNeto;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
