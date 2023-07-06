<%-- 
    Document   : index2
    Created on : 6 de jul de 2023, 13:12:04
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
        
        <h1>Formulário de Cadastro de Veículo</h1>
    <form name="DadosVeiculo" action="salvarVeiculos.jsp" method="get">
        <label for="telefoneVendedor">Telefone do Vendedor:</label>
        <input type="tel" name="telefoneVendedor" id="telefoneVendedor" required><br><br>
        
        <label for="informacoesVeiculo">Informações do Veículo:</label>
        <textarea name="informacoesVeiculo" id="informacoesVeiculo" required></textarea><br><br>
        
        <label for="placa">Placa:</label>
        <input type="text" name="placa" id="placa" required><br><br>
        
        <label for="ano">Ano:</label>
        <input type="number" name="ano" id="ano" required><br><br>
        
        <label for="modelo">Modelo:</label>
        <input type="text" name="modelo" id="modelo" required><br><br>
        
        <label for="cor">Cor do Veículo:</label>
        <input type="text" name="cor" id="cor" required><br><br>
        
        <label for="marca">Marca do Veículo:</label>
        <input type="text" name="marca" id="marca" required><br><br>
        
        <label for="valorVenda">Valor de Venda:</label>
        <input type="number" name="valorVenda" id="valorVenda" step="0.01" required><br><br>
        
        <input type="submit" value="Cadastrar">
        
        <a href="index.jsp">voltar para cadastro</a>

    </form>
       
    </body>
</html>
