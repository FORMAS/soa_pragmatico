<%-- 
    Document   : formhandler
    Created on : Sep 25, 2017, 3:33:01 PM
    Author     : hofstede
--%>



<%@page import="services.Lab2"%>
<%@page import="services.Lab2_Service"%>
<%@page import="services.Lab1"%>
<%@page import="services.Lab1_Service"%>
<%@page import="services.LabController"%>
<%@page import="services.LabController_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        
        <%
            int priority = Integer.parseInt(request.getParameter("priority"));
            LabController_Service lcs = new LabController_Service();
            LabController lc = lcs.getLabControllerPort();
            int service = lc.connect(priority);
            
            //out.print(service);
            
            
            
            if(service == 1){
                // serviço 1 satisfez
                
                Lab1_Service l1s = new Lab1_Service();
                Lab1 l1 = l1s.getLab1Port();
                
                //faz a requisição a partir do contexto
                if(priority == 1){
                    out.print(l1.getRelatorioEmergencia(""));
                }else if(priority == 2){
                    out.print(l1.gerarRelatorioUrgencia(""));
                }
                
            }else if(service == 2){
                //servico 2 satisfaz
                Lab2_Service l2s = new Lab2_Service();
                Lab2 l2 = l2s.getLab2Port();
                
                //faz a requisição a partir do contexto
                if(priority == 0){
                    out.print(l2.getRelatorioPadrao(""));
                }else if(priority == 1){
                    out.print(l2.getRelatorioEmergencia(""));
                }
            }
            
        
        %>
    </body>
</html>
