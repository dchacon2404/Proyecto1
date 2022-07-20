package Modelo;

import DB.Conexion;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import vista.Postales;

public class PostalesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection cnn;
    Conexion conexion = new Conexion();
    
    public void TraerPostales() {
        
        String sql = "select idPersonaje, imagen from personajes order by rand() limit 3";
        Postales sobre = new Postales();
        Personajes per = new Personajes();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                per.setIdPersonaje(rs.getInt(1));
                per.setImagen(rs.getBytes(2));
            }
            
        } catch (SQLException e) {
            System.out.println("Error 2: "+e.getMessage());
        }
 
    }
}
