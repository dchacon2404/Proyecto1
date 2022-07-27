
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Conexion {
    
    private Connection cnn = null; 
    private Statement st = null;
    
    public Conexion() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/album?useUnicode=true&useJDBCCompliant"
                    + "TimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");
            st = cnn.createStatement();
            System.out.println("Conexión Buena");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error 1: "+e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return cnn;
    }
    
    public void desconnection() {
        
        try {
            cnn.close();
            System.exit(0);
            
        } catch (SQLException e) {
            System.out.println("Error 3: "+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Conexion co = new Conexion();
        System.out.println("");
    }
    
}
