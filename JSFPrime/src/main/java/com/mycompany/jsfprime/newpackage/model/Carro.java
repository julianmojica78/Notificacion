/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfprime.newpackage.model;

import java.io.Serializable;

/**
 *
 * @author ASUS-PC
 */

public class Carro implements Serializable{
    
    
    private String placa;
    
    private String color;
    
    private String modelo;
    
    private String marca;
    
    public Carro() {
    
    }

    public Carro(String placa, String color, String modelo, String marca) {
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
    }

    
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
    
}
