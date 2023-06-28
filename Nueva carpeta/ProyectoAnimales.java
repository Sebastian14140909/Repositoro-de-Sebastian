/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass;

/**
 *
 * @author Sebastián
 */
public class ProyectoAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        gato lolo = new gato("lolo", "01/01/2019", "persa");
        perro cuco = new perro("cuco", "01/01/2022", "gran danes");
        persona sofia = new persona("Sofia", 20);

        System.out.println(sofia.getNombre() + " tiene " + sofia.getEdad() + " anos y siempre esta con sus animales. Su frase favorita es: ");
        sofia.hacerSonido();
        System.out.println(lolo.nombre + " es un gato " + lolo.getRaza() + " con " + lolo.getEdad() + " anos");
        System.out.println(cuco.nombre + " es un perro " + cuco.getRaza() + " con " + cuco.getEdad() + " anos");
    }
}
    
    

