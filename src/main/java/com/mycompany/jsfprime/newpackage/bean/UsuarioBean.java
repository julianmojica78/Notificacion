/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jsfprime.newpackage.bean;

import com.mycompany.jsfprime.newpackage.model.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.commons.lang.StringEscapeUtils;
import org.primefaces.event.RowEditEvent;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 *
 * Clase Managed Bean para controlar la vista de usuarios
 */
@ManagedBean(name = "usuario")
@SessionScoped
public class UsuarioBean implements Serializable {

    /**
     * atributo de la Clase Usuario
     */
    private Usuario user = new Usuario();
    /**
     * atributo para la lista de Usuario
     */
    List<Usuario> listado = new ArrayList();
    /**
     * atributo para la lista de notificaciones
     */
    List<Notificacion> noti = new ArrayList();

    /**
     * Constructor de UsuarioBean
     */
    public UsuarioBean() {

    }

    /**
     * Funcion para agregar a la lista de usuarios
     *
     * @param nombre
     * @param apellido
     * @param edad
     */
    public void Agregar(String nombre, String apellido, int edad) {
        Usuario userNuevo = new Usuario(nombre, apellido, edad);
        //lista.Agregar(nombre,apellido,edad);
        listado.add(userNuevo);
        //lista.AgregarUsuario(user);
        Notificar("AGREGADO", nombre);
    }

    /**
     *obtiene los atributos de la clase Usuario
     * @return user
     */
    public Usuario getUser() {
        return user;
    }
    /**
     * modifica los atributos de la clase Usuario
     * @param usuario 
     */
    public void setUser(Usuario usuario) {
        this.user = user;
    }
    /**
     * obtiene la lista de usuarios
     * @return listado
     */
    public List<Usuario> getListado() {
        return listado;
    }
    /**
     * modifica la lista de usuarios
     * @param listado 
     */
    public void setListado(List<Usuario> listado) {
        this.listado = listado;
    }
    /**
     * obtiene la lista de notificaciones
     * @return noti
     */
    public List<Notificacion> getNoti() {
        return noti;
    }

    public void setNoti(List<Notificacion> noti) {
        this.noti = noti;
    }
    /**
     * funcion para modificar los datos de la lista en el datatable
     * @param event 
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Usuario Editado", ((Usuario) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        Notificar("EDITADO", ((Usuario) event.getObject()).getNombre());
    }
    /**
     * funcion para cancelar la edicion en el datatable
     * @param event 
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edicion Cancelada", ((Usuario) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * funcion para eliminar el usuario de la lista
     * @param usuario 
     */
    public void Eliminar(Usuario usuario) {
        Notificar("ELIMINADO", usuario.getNombre());
        listado.remove(usuario);
    }
    /**
     * funcion para hacer el push al admin
     * @param summary
     * @param detail 
     */
    public void Notificar(String summary, String detail) {
        Notificacion notif = new Notificacion(summary, detail);
        noti.add(notif);
        //lista.AgregarNotificacion(notif);
        String CHANNEL = "/notify";

        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish(CHANNEL, new FacesMessage(StringEscapeUtils.escapeHtml(summary), StringEscapeUtils.escapeHtml(detail)));
    }

}
