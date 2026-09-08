/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andresriquelme.maincoche;

/**
 *
 * @author laboratorioasu
 */
public class MainCoche {
    
    private String marca;
    private int anio;
    
    //Constructor
    public MainCoche(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }

    public void mostraInfo(){
        System.out.println("Marca: "+ marca + ", Año: "+ anio);
    }
    
    public static void main(String[] args) {
        MainCoche coche = new MainCoche("Toyota", 1233);
        
        coche.mostraInfo();
    }
}
