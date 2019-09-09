/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfprime.newpackage.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para obtener los atributos del usuario
 * @author DAVID
 */

public class Usuario implements Serializable{
    
    /**
     * atributo de tipo String para obtener el nombre del usuario
     */
    private String nombre;
    /**
     * atributo de tipo String para obtener el apellido del usuario
     */    
    private String apellido;
    /**
     * atributo de tipo integer para obtener la edad del usuario
     */
    private int edad;
    /**
     * lista de los usuarios
     */
    List<Usuario> listado = new ArrayList<>();
   
    /**
     * Constructor vacio del Usuario
     */
    public Usuario() {
    
    }
    /**
     * Constructor del Usuario
     * @param nombre
     * @param apellido
     * @param edad 
     */
    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
    /**
     * obtiene el nombre del usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * modifica el nombre del usuario
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * obtiene el apellido del usuario
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * modifica el apellido del usuario
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * obtiene la edad del usuario
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * modifica la edad del usuario
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * obtiene la lista del usuario
     * @return listado
     */
    public List<Usuario> getListado() {
        return listado;
    }
    /**
     * modifica la lista del usuario
     * @param listado 
     */
    public void setListado(List<Usuario> listado) {
        this.listado = listado;
    }

    
    
    
}
