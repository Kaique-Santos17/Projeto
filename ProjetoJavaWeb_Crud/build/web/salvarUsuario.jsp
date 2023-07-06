<%-- 
    Document   : salvarUsuario
    Created on : 5 de jul de 2023, 18:37:32
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
            user.nome = request.getParameter("nome");
            user.CPF = request.getParameter("CPF");
            user.Telefone = request.getParameter("Telefone");
            user.logradouro = request.getParameter("logradouro");
            user.cep = request.getParameter("cep");
            user.cidade = request.getParameter("cidade");
            user.estado = request.getParameter("estado");
            user.bairro = request.getParameter("bairro");
           
          
           
         if(user.btnSalvar()){
         out.print("Salvou");
            
            }else{
            out.print("Não salvou");
            }  

        
        
        %>
        
        
        
        <h1>Hello World!</h1>
    </body>
</html>
