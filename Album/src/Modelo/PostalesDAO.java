package Modelo;

import DB.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PostalesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection cnn;
    Conexion conexion = new Conexion();
    Personajes per = new Personajes();
    
    public void traerPostal1(JLabel label1, JLabel label2, JLabel label3) {
        String sql = "select idPersonaje, imagen from personajes order by rand() limit 1;";

        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                per.setIdPersonaje(rs.getInt(1));
                per.setImagen(rs.getString(2)+".png");
                
                ImageIcon ima = new ImageIcon(per.getImagen());
                Icon icono = new ImageIcon(ima.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), 
                        java.awt.Image.SCALE_SMOOTH));
                
                label2.setIcon(icono);
                label3.setText(per.getImagen());
                label1.setText(Integer.toString(per.getIdPersonaje()));
            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public int agregarP1(ClasePostales postales) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            ps.setInt(2, postales.getIdPersonaje());
            ps.setString(3, postales.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
    
    public int agregarP2(ClasePostales postales) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            ps.setInt(2, postales.getIdPersonaje());
            ps.setString(3, postales.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
    
    public int agregarP3(ClasePostales postales) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            ps.setInt(2, postales.getIdPersonaje());
            ps.setString(3, postales.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
    
}
