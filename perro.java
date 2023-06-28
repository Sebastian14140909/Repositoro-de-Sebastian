/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;

/**
 *
 * @author Sebastián
 */
public class perro {
    private final String fechaNacimiento;
    private final String raza;

    public perro(String nombre, String fechaNacimiento, String raza) {
        this.fechaNacimiento = fechaNacimiento;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println("Guau");
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




    

    

