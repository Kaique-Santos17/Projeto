
package Model.persistence;


public class Usuario {
    private String id;
    private String nome;
    private String CPF;
    private String Telefone;
    private Endereco endereco;

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCPF() {
        return CPF;
    }

    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    public String getTelefone() {
        return Telefone;
    }

   
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    
    public Endereco getEndereco() {
        return endereco;
    }

   
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
