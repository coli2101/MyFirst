/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientejsf.amerikati.com;

import com.amerikatest1.ws.ClientesWS_Service;
import com.amerikatest1.ws.InmueblesWS;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author jose.gomez
 */
@ManagedBean(name="appBeanClient")
@ViewScoped
public class AppBeanClient implements Serializable{
    private String codigo;
    private List<InmueblesWS> inmuebles;
    private String saludo;
    
    public AppBeanClient(){
        
    }
    
    public void consultar(){
        ClientesWS_Service c = new ClientesWS_Service();
        saludo=c.getClientesWSPort().hello(codigo);

        
        inmuebles=c.getClientesWSPort().getInmueblesFromClientes(codigo);
    }
    
    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<InmueblesWS> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<InmueblesWS> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    
    
}
