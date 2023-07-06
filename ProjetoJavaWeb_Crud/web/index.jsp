<%-- 
    Document   : index.jsp
    Created on : 5 de jul de 2023, 12:24:32
    Author     : Kaique
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="ConnectionJDBC.ConnectionJDBC"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
        <style>
            body{
                background-image: url(b.jpg);
                background-color:cadetblue;
                margin-left: 35%;    
                margin-right: 35%  }
            h1{
                text-align: center;
                margin-top: 100px; 
            }
            
        </style>  
        
    </head>
    <body>
      <h1>Formulário de Cadastro de Usuário</h1>
    <form name="DadosUsuario" action="salvarUsuario.jsp" method="get">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required><br><br>
        
        <label for="cpf">CPF:</label>
        <input type="text" name="cpf" id="cpf" required><br><br>
        
        <label for="telefone">Telefone:</label>
        <input type="tel" name="telefone" id="telefone" required><br><br>
        
        <label for="logradouro">Logradouro:</label>
        <input type="text" name="logradouro" id="logradouro" required><br><br>
        
        <label for="cep">CEP:</label>
        <input type="text" name="cep" id="cep" required><br><br>
        
        <label for="bairro">Bairro:</label>
        <input type="text" name="bairro" id="bairro" required><br><br>
        
        <label for="estado">Estado:</label>
        <input type="text" name="estado" id="estado" required><br><br>
        
        <label for="cidade">Cidade:</label>
        <input type="text" name="cidade" id="cidade" required><br><br>
        
        <input type="submit" value="Cadastrar">
        
        <a href="index2.jsp">Venda seu </a>

    </form>
      
       
        
    </body>
</html>
