
package ConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionJDBC {
    String usuario = "root";
    String senha = "";
    String url = "jdbc:mysql://localhost:3306/teste";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    Connection con = null;
    
    
    public Connection getConnection() throws ClassNotFoundException{
        try{
            if(con == null){
                Class.forName(driver);
                con = (Connection) DriverManager.getConnection(url, usuario, senha);
                System.out.println("conexão ativa");
                        
            }
            
        }catch(SQLException e){
            System.out.println("Conexão não ativa");
            e.printStackTrace();
            e.getMessage();
        }
        
        
        return con;
    }
    
}
