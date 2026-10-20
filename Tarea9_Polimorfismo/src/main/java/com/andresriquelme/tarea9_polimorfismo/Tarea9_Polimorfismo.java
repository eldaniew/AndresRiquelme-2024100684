/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.tarea9_polimorfismo;

/**
 *
 * @author HOME
 */
public class Tarea9_Polimorfismo {

    public static void main(String[] args) {
        Empleado[] nomina = new Empleado[2];
        
        nomina[0] = new EmpleadoFijo("Andres Riquelme", 3500000);
        nomina[1] = new EmpleadoPorHora("Daniel Ramirez", 40, 50000);
        
        for (Empleado e : nomina){
            System.out.println(e.getNombre() + " -> Sueldo: Gs. "+ e.calcularSueldo());
        }
    }
}
