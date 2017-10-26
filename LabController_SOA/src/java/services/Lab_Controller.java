/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import controller.Controller;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author he4dless
 */
@WebService(serviceName = "Lab_Controller")
public class Lab_Controller {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "hello";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "connect")
    public Integer connect(@WebParam(name = "priority") int priority) {
        Controller controller = new Controller();
        try {
            return controller.choose(priority);
        } catch (IOException ex) {
            Logger.getLogger(Lab_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (SAXException ex) {
            Logger.getLogger(Lab_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Lab_Controller.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
}
