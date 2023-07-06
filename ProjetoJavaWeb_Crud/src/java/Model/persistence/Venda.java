
package Model.persistence;


public class Venda {
    private String id;
    private String telefonevendedor;
    private String informacoes;
    private String placa;
    private String ano;
    private String modelo;
    private String cor;
    private String marca;
    private String valor;

    
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }


    public String getTelefonevendedor() {
        return telefonevendedor;
    }

    
    public void setTelefonevendedor(String telefonevendedor) {
        this.telefonevendedor = telefonevendedor;
    }

   
    public String getInformacoes() {
        return informacoes;
    }

  
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

   
    public String getPlaca() {
        return placa;
    }

    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    public String getAno() {
        return ano;
    }

    
    public void setAno(String ano) {
        this.ano = ano;
    }

    
    public String getModelo() {
        return modelo;
    }

  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public String getCor() {
        return cor;
    }

    
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getValor() {
        return valor;
    }

    
    public void setValor(String valor) {
        this.valor = valor;
    }
}
