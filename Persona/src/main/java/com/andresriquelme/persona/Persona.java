/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.persona;

/**
 *
 * @author laboratorioasu
 */
public class Persona {

    public static void main(String[] args) {
        dtoPersona persona = new dtoPersona();
        persona.setNombre("Andres");
        persona.setEdad(21);
        persona.setApellido("Riquelme");
        
        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Apellido: "+ persona.getApellido());
        System.out.println("Edad: "+ persona.getEdad());
    }
}
