package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Teste {  
    
    private static final String url = "jdbc:mysql://192.168.37.66:3306/nome_do_banco_que_deseja_conectar";  
    private static final String driver = "com.mysql.jdbc.Driver";  
    private static final String user = "luiz";  
    private static final String password = "34531239";  
      
    public static Connection getConnection(){  
          
        Connection con =  null;  
          
        try {  
              
            Class.forName(driver);  
            con = DriverManager.getConnection(url, user, password);  
                          
        } catch (ClassNotFoundException e) {  
            System.out.println("Driver não encontrado.");  
        } catch (SQLException e) {  
            System.out.println("Excessão de SQL: "+e);  
        } catch (Exception e) {  
            System.out.println("Excessão!"+e);  
        }  
          
        return con;  
    }  
    public static void main(String[] args) {  
        Connection con = getConnection();  
        if(con != null){  
            System.out.println("Conexão realizada com sucesso!");  
        }  
    }  
}
