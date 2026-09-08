/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.ejercicio4;

/**
 *
 * @author laboratorioasu
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Constructor sin parámetros
        Coche coche1 = new Coche();
        coche1.mostrarInfo();
        coche1.mostrarInfo("marca");
        
        // Constructor con Parámetros
        Coche coche2 = new Coche("Hyundai", "Santa Fe", 2006);
        coche2.mostrarInfo();
        coche2.mostrarInfo("marca");
        
    }
}
