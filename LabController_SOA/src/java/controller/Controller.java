/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import services.Lab_Controller;

/**
 *
 * @author he4dless
 */
public class Controller {
    String response;
    
    public Controller(){
        
        
        
    }
    
    
    public int choose(int priority) throws IOException, SAXException, ParserConfigurationException{
        try {
            // baixa e parsa o arquivo XML de um url
            URL url = new URL("https://raw.githubusercontent.com/hofstede-matheus/soa_pragmatico/master/repo.xml?token=ALqOlUcx4p2tcar8SPgkbriToeqBn3hfks5Z-GzrwA%3D%3D");
            InputStream stream = url.openStream();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stream);
            
            
            // NodeList nList = doc.getElementsByTagName("service");
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Lab_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /**
        * Procurar o serviço mais relevante
        **/
        
        switch(priority){
                
                case 0:
                    return 2;
                    
                case 1:
                    return 1;
                    
                case 2:
                    return 1;
                
                default: 
                    return 0;
            }
        
    }
    
}
