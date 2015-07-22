/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientejsf.amerikati.com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author jose.gomez
 */
@ManagedBean
@RequestScoped
public class LoginBean {

    private String usuario;
    private String password;

    public LoginBean() {
    }

    public String validaUsuario() {
        if (usuario.equals("Notodocodigo") && "pass".equals(password)) {
            return "usuarioCorrecto";
        } else {
            return "usuarioIncorrecto";
        }
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
