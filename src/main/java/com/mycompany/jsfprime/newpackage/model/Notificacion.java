/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfprime.newpackage.model;

/**
 * Clase para la notificacion del admin
 * @author Jonathan
 */
public class Notificacion {
    /**
     * atributo de tipo String para capturar la accion ejecutada
     */
    String accion;
    /**
     * atributo de tipo String para capturar el elemento ejecutado
     */
    String elemento;
    /**
     * Constructor de la clase Notificacion
     * @param accion
     * @param elemento 
     */
    public Notificacion(String accion, String elemento) {
        this.accion = accion;
        this.elemento = elemento;
    }
    /**
     * Constructor vacio de la clase Notificacion
     */
    public Notificacion() {
    }
    /**
     * obtiene la accion 
     * @return accion
     */
    public String getAccion() {
        return accion;
    }
    /**
     * modifica la accion
     * @param accion 
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }
    /**
     * obtiene el elemento
     * @return elemento
     */
    public String getElemento() {
        return elemento;
    }
    /**
     * modifica el elemento
     * @param elemento 
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    
    
    
}
