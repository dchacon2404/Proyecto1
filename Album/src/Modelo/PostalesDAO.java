package Modelo;

import DB.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PostalesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection cnn;
    Conexion conexion = new Conexion();
    
    public void traerPostal() {
        Personajes per = new Personajes();
        String sql = "select idPersonaje, imagen from personajes order by rand() limit 1";

        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                per.setIdPersonaje(rs.getInt(1));
                per.setImagen(rs.getString(2));

            }

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    public int agregarP1(Perfil perfil, Personajes personaje) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, perfil.getIdUsuario());
            ps.setInt(2, personaje.getIdPersonaje());
            ps.setString(3, personaje.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
    
    public int agregarP2(Perfil perfil, Personajes personaje) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, perfil.getIdUsuario());
            ps.setInt(2, personaje.getIdPersonaje());
            ps.setString(3, personaje.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
    
    public int agregarP3(Perfil perfil, Personajes personaje) {
        int r = 0;
        String sql = "insert into postales (idPerfil, idPersonaje, imagen) values (?, ?, ?)";
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, perfil.getIdUsuario());
            ps.setInt(2, personaje.getIdPersonaje());
            ps.setString(3, personaje.getImagen());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
        return r;
    }
}
