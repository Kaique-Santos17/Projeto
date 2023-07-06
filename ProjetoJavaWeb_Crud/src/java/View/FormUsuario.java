
package View;

import Controller.UsuarioController;


public class FormUsuario {
    public String id;
    public String nome;
    public String CPF;
    public String Telefone;
    public String logradouro;
    public String cep;
    public String bairro;
    public String estado;
    public String cidade;
    public String telefonevendedor;
    public String informacoes;
    public String placa;
    public String ano;
    public String modelo;
    public String cor;
    public String marca;
    public String valor;
   
     
    public boolean btnSalvar(){
        UsuarioController userCtrl = new UsuarioController();
        return userCtrl.cadastrar(this);
    }  
      
    
}
