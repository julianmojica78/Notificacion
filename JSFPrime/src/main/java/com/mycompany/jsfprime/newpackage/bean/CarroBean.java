/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfprime.newpackage.bean;

import com.mycompany.jsfprime.newpackage.model.Carro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ASUS-PC
 */

@ManagedBean
@SessionScoped
public class CarroBean implements Serializable{

    private List<Carro> listaCarro;    
    
    /**
     * Creates a new instance of CarroBean
     */
    public CarroBean() {
        listaCarro = new  ArrayList<>();
        listaCarro.add(new Carro("ABC123", "Blanco", "2019", "Mercedez"));
        listaCarro.add(new Carro("GTD789", "Negro", "2019", "Audi"));
        
    }
    
    public void agregar() {
        listaCarro.add(new Carro("JDE", "Morado", "2019", "Chevrolet"));
    }
    

    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(List<Carro> listaCarro) {
        this.listaCarro = listaCarro;
    }
    
    
    
}
