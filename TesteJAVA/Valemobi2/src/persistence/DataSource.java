package persistence;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    private Connection con;
    
    public DataSource() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/valemobi";
        String user = "root";
        String pass = "root";
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);        
    }
    
    public Connection getCon() {
        return con;
    }
}
