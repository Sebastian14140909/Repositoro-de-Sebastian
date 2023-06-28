/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author Sebastián
 */
public class gato {
    final String nombre;
    private final String fechaNacimiento;
    private final String raza;

    public gato(String nombre, String fechaNacimiento, String raza) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println("Miau");
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        int anioNacimiento = Integer.parseInt(fechaNacimiento.substring(6));
        int anioActual = java.time.Year.now().getValue();
        return anioActual - anioNacimiento;
    }
}

    

