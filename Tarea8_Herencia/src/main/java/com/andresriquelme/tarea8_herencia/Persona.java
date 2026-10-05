/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.tarea8_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    private String nombre;
    private String cedula;
    
    public Persona(String nombre, String cedula){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Nombre: "+ nombre +" | Cedula: "+ cedula;
    }
}
