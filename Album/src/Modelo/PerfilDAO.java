package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import DB.Conexion;
import javax.swing.JOptionPane;
import vista.CrearPerfil;


public class PerfilDAO {

    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conexion = new Conexion();

    public int agregarPerfil(Perfil perfil) {
        CrearPerfil cp = new CrearPerfil();
        int r = 0;
        String sql = "Call pa_AgregarPerfil(?,?,?,?,?)";

        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, perfil.getNombre());
            ps.setString(2, perfil.getApellidos());
            ps.setInt(3, perfil.getEdad());   
            ps.setString(4, perfil.getNombreUsuario());
            ps.setString(5, perfil.getContrasena());
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("error agregar perfil"+e.getMessage());
            JOptionPane.showMessageDialog(cp, "El nombre de usuario ingresado ya está en uso, por favor ingrese otro");
        }
        return r;
    }
    
    public boolean Login(Perfil perfil) {
        
        String sql = "SELECT idPerfil, NombreUsuario, Contrasena FROM perfil WHERE NombreUsuario=?";
        
        try {
            con = conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, perfil.getNombreUsuario());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (perfil.getContrasena().equals(rs.getString("Contrasena"))) {
                    perfil.setIdUsuario(rs.getInt("idPerfil"));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
            
        } catch (SQLException e) {
            return false;
        }
    }
}
