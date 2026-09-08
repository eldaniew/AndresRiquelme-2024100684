/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.clase4;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;
    public int ci;
    public String direccion;
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+ apellido);
        System.out.println("Edad: "+ edad);
        System.out.println("CI: "+ ci);
        System.out.println("Direccion: "+ direccion);
    }
}
