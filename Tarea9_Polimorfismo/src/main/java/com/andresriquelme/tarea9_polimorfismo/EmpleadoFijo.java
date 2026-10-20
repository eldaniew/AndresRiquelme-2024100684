/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.tarea9_polimorfismo;

/**
 *
 * @author HOME
 */
public class EmpleadoFijo extends Empleado{
    private double sueldoMensual;
    
    public EmpleadoFijo(String nombre, double sueldoMensual){
        super(nombre);
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoMensual;
    }
}
