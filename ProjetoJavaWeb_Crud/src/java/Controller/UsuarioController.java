
package Controller;

import Model.DAO.UsuarioDAO;
import Model.persistence.Endereco;
import Model.persistence.Usuario;
import Model.persistence.Venda;
import View.FormUsuario;



public class UsuarioController {
    public boolean cadastrar(FormUsuario user) throws ClassNotFoundException{
        Usuario usuario = new Usuario();
        usuario.setNome(user.nome);
        usuario.setCPF(user.CPF);
        usuario.setTelefone(user.Telefone);
        
        //endereço
        Endereco endereco = new Endereco();
        endereco.setLougradouro(user.logradouro);
        endereco.setCep(user.cep);
        endereco.setCidade(user.cidade);
        endereco.setEstado(user.estado);
        endereco.setBairro(user.bairro);
        
        usuario.setEndereco(endereco);
        
        //venda
        Venda venda = new Venda();
        venda.setTelefonevendedor(user.telefonevendedor);
        venda.setInformacoes(user.informacoes);
        venda.setPlaca(user.placa);
        venda.setAno(user.ano);
        venda.setModelo(user.modelo);
        venda.setCor(user.cor);
        venda.setMarca(user.marca);
        venda.setValor(user.valor);
       
        UsuarioDAO userDAO = new UsuarioDAO();
        
        return userDAO.salvar(usuario);
    }
}
