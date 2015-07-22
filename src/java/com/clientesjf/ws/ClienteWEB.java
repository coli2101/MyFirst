/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clientesjf.ws;

import javax.jws.WebService;

/**
 *
 * @author jose.gomez
 */
@WebService(serviceName = "ClientesWS", portName = "ClientesWSPort", endpointInterface = "com.amerikatest1.ws.ClientesWS", targetNamespace = "http://ws.amerikatest1.com/", wsdlLocation = "WEB-INF/wsdl/ClienteWEB/localhost_8084/AmerikaTest1/ClientesWS.wsdl")
public class ClienteWEB {

    public java.util.List<com.amerikatest1.ws.InmueblesWS> getInmueblesFromClientes(java.lang.String codCliente) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public java.lang.String hello(java.lang.String name) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
