/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andresriquelme.ejercicio4;

/**
 *
 * @author laboratorioasu
 */
public class Coche {
    
    String marca;
    String modelo;
    int año;
    
    Coche(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    Coche(){
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 2000;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: "+ marca + ", Modelo: "+ modelo +", Año: "+ año);
    }
    
    public void mostrarInfo(String tipoInfo){
        if(tipoInfo.equals("marca")){
            System.out.println("Marca: "+ marca);
        }
    }
    
}
