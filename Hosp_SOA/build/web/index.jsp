<%@page import="services.LabController"%>
<%@page import="services.LabController_Service"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>Solicitar relatório</div>
        
        <form action="formhandler.jsp" method="get">
            <label for="name">Name</label>
            <input type="text" name="name">
            <br>
            
            <select name="priority">
              <option value="0">Padrão</option>
              <option value="1">Emergência</option>
              <option value="2">Urgência</option>
            </select>
            
            <input type="submit" name="action" value="add">
        </form>
        <br>
        <br>
        <br>
            
            
        </p>
    </body>
</html>
