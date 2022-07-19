/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import DB.Conexion;

/**
 *
 * @author Jahir
 */
public class PerfilDAO {

    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    Conexion conexion = new Conexion();

    public int agregarPerfil(Perfil perfil) {

        int r = 0;
        String sql = "INSERT INTO perfil (Nombre, Apellidos, Edad, NombreUsuario, Contrasena) VALUES (?,?,?,?,?)";

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
