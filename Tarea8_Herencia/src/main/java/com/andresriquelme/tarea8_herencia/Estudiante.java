/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.tarea8_herencia;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante extends Persona  {
    private String matricula;
    private String carrera;
    
    public Estudiante (String nombre, String cedula, String matricula, String carrera){
        super(nombre, cedula);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Matricula: "+ matricula +" | Carrera: "+ carrera;
    }
}
