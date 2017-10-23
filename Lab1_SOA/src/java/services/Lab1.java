/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author he4dless
 */
@WebService(serviceName = "Lab1")
public class Lab1 {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getRelatorioEmergencia")
    public String getRelatorioEmergencia(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return "15 dias";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "gerarRelatorioUrgencia")
    public String gerarRelatorioUrgencia(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return "5 dias";
    }
}
