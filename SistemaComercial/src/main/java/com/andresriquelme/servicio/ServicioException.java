/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.servicio;

/**
 *
 * @author HOME
 */
public class ServicioException extends Exception {
    public ServicioException(String mensaje) {
        super(mensaje);
    }
    public ServicioException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
