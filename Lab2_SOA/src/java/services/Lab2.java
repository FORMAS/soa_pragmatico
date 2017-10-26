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
@WebService(serviceName = "Lab2")
public class Lab2 {
/**
     * Web service operation
     */
    @WebMethod(operationName = "getRelatorioPadrao")
    public String getRelatorioPadrao(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return "O Laboratorio 2 satisfez e a entrega demorou 30 dias";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getRelatorioEmergencia")
    public String getRelatorioEmergencia(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return "O Laboratorio 2 satisfez e a entrega demorou 15 dias";
    }
}
