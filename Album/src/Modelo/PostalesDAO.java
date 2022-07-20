package Modelo;

import DB.Conexion;
import java.awt.Color;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import vista.Postales;

public class PostalesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection cnn;
    Conexion conexion = new Conexion();
    
    public void TraerPostales() {
        
        Postales pos = new Postales();
        Personajes per = new Personajes();
        String sql = "select idPersonaje from personajes order by rand() limit 1";
        ImageIcon image;
        InputStream is;
        int id;
        
        try {
            
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                id = rs.getInt(1);
                pos.lblIdPostal1.setText(Integer.toString(id));
                System.out.println(id);
            }
            
        } catch (SQLException e) {
            System.out.println("Error 1: "+e.getMessage());
        }
        
    }
    
    public int agregarP1() {
        return 0;
    }
}
