/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.clase4;

/**
 *
 * @author laboratorioasu
 */
public class Clase4 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre = "Andres";
        persona1.apellido = "Riquelme";
        persona1.edad = 21;
        persona1.ci = 7121620;
        persona1.direccion = "Avd. Artigas";
        
        persona1.mostrarInformacion();
        System.out.println("Nombre de la persona: "+ persona1.nombre);
    }
}
