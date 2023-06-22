/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author LABORATORIO 04
 */
public class perro1 {
    public String perro ;
    private String raza;
    private String nombreCompleto;
    
    public String getNombreCompleto(){
        String nombreCompleto = null;
        return nombreCompleto+"de David";
    }
    public void setNombreCompeto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }
    public String getRaza(){
        return raza;
    }
    public void prueba(String raza){
        this.nombreCompleto="Chihuahua";
    }
    public void SetRaza(String raza){
        this.raza = raza;
        
    }
}
