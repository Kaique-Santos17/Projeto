
package Model.DAO;

import ConnectionJDBC.ConnectionJDBC;
import Model.persistence.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    
    public Connection con;
    private String sqlUsuario = null;
    private String sqlEndereco = null;
    public String sqlVenda = null;
    private PreparedStatement psUsuario = null;
    private PreparedStatement psEndereco = null;
    public PreparedStatement psVenda = null;
    private ResultSet rs  = null;

    
    public boolean salvar(Usuario user) throws ClassNotFoundException{
        con = new ConnectionJDBC().getConnection();
        
        sqlUsuario = "insert into usuario(nome,CPF,Telefone,Endereco) values(?,?,?,?)";
        sqlEndereco = "insert into endereco(logradouro,cep,cidade,estado,bairro) values(?,?,?,?,?)";
        sqlVenda = "insert into venda(telefonevendedor,informacoes,placa,ano,modelo,cor,marca,valor) values(?,?,?,?,?,?,?,?)";

        try{
            psEndereco = con.prepareStatement(sqlEndereco);
            psEndereco.setString(1,user.getEndereco().getLougradouro());
            psEndereco.setString(2,user.getEndereco().getCep());
            psEndereco.setString(3,user.getEndereco().getCidade());
            psEndereco.setString(4,user.getEndereco().getEstado());
            psEndereco.setString(5,user.getEndereco().getBairro());
            psEndereco.executeUpdate();

            
            ResultSet rs = psEndereco.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            
            psUsuario = con.prepareStatement(sqlUsuario);
            psUsuario.setString(1,user.getNome());
            psUsuario.setString(2,user.getCPF());
            psUsuario.setString(3,user.getTelefone());
            psUsuario.setInt(4,id);
            
            psUsuario.executeUpdate();
            
           
            
           
            
        
        }catch(SQLException e){
            e.printStackTrace();
        
        }
    return true;    
    }
}
