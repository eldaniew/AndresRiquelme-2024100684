/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.ejercicio2;

/**
 *
 * @author laboratorioasu
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Juan");
        persona.setEdad(25);
        
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: "+ persona.getEdad());
    }
}
