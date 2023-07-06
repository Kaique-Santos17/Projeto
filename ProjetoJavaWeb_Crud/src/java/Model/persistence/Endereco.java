
package Model.persistence;

import java.util.List;


public class Endereco {
    private String id;
    private String logradouro;
    private String cep;
    private String bairro;
    private String estado;
    private String cidade;
    private List<Usuario> usuarios;

    
    
    public String getId() {
        return id;
    }

  
    public void setId(String id) {
        this.id = id;
    }

  
    public String getLougradouro() {
        return logradouro;
    }

    
    public void setLougradouro(String lougradouro) {
        this.logradouro = lougradouro;
    }

   
    public String getCep() {
        return cep;
    }

   
    public void setCep(String cep) {
        this.cep = cep;
    }

    
    public String getBairro() {
        return bairro;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getCidade() {
        return cidade;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
