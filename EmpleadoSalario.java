/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario.empleado.john;

/**
 *
 * @author John Paul
 */

import java.util.Scanner;

public class SalarioEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo de antiguedad: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas laboradas por semana: ");
        int horasLaboradas = scanner.nextInt();

        System.out.print("Ingrese el precio por hora: ");
        double precioHora = scanner.nextDouble();

        double salarioBruto = horasLaboradas * precioHora * 4 * 12; // Se multiplica por 4 para obtener el salario mensual y por 12 para obtener el salario anual

        if (antiguedad > 10) {
            salarioBruto += salarioBruto * 0.2; // Aplicar bono del 20%
        }

        if (salarioBruto > 1000 && salarioBruto <= 2000) {
            salarioBruto -= salarioBruto * 0.1; // Deducción del 10%
        } else if (salarioBruto > 2000) {
            salarioBruto -= salarioBruto * 0.15; // Deducción del 15%
        }

        System.out.println("El salario neto final es: $" + salarioBruto);
    }
}

