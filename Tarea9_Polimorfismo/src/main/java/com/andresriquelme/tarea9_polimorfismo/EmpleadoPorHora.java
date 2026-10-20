/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.tarea9_polimorfismo;

/**
 *
 * @author HOME
 */
public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double valorPorHora;
    
    public EmpleadoPorHora(String nombre, int horasTrabajadas, double valorPorHora){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    
    @Override
    public double calcularSueldo(){
        return horasTrabajadas * valorPorHora;
    }
}
