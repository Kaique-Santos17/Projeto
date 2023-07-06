<%-- 
    Document   : salvarVeiculos
    Created on : 6 de jul de 2023, 13:19:12
    Author     : Kaique
--%>
<%@page import="View.FormUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            FormUsuario user = new FormUsuario();
            user.telefonevendedor = request.getParameter("telefonevendedor");
            user.informacoes = request.getParameter("informacoes");
            user.placa = request.getParameter("placa");
            user.ano = request.getParameter("ano");
            user.modelo = request.getParameter("modelo");
            user.cor = request.getParameter("cor");
            user.marca = request.getParameter("marca");
            user.valor = request.getParameter("valor");
            
          
           
         if(user.btnSalvar()){
         out.print("Salvou");
            
            }else{
            out.print("Não salvou");
            }  
        
        
        
        
        
        
        %>
        
        
        
        
        <h1>Hello World!</h1>
    </body>
</html>
