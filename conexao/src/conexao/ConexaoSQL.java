package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;









public class ConexaoSQL {  
    public static Connection getConexaoSQL() throws ClassNotFoundException, SQLException{  
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
        return DriverManager.getConnection("jdbc:sqlserver:192.168.37.66:1433","luiz","34531239");  
    }  
} 
