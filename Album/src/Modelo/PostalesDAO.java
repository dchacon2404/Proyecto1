package Modelo;

import DB.Conexion;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PostalesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection cnn;
    Conexion conexion = new Conexion();
    Personajes per = new Personajes();
    
    public void traerPostal1(JLabel label1, JLabel label2, JLabel label3) {
        String sql = "call pa_TraerPostal;";

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
        String sql = "Call pa_AgregarP1(?,?,?)";
        
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
        String sql = "Call pa_AgregarP1(?,?,?)";
        
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
        String sql = "Call pa_AgregarP1(?,?,?)";
        
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
    
    public void ListaBuenos(ClasePostales postales, JTable table) {
        String[] title = {"ID DE LOS PERSONAJES"};
        String[] datos = new String[1];
        DefaultTableModel modelo2 = new DefaultTableModel(null, title);
        String sql = "Call pa_ListBuenos(?);";
        ListaSimplePersonajes ListS = new ListaSimplePersonajes();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                postales.setIdPersonaje(rs.getInt(1));
                
                //Acá se insertan los nodos
                ListS.insert(postales);
                
                //Se agregra el id del personaje a la tabla
                datos[0] = Integer.toString(postales.getIdPersonaje());
                modelo2.addRow(datos);
            } 
            table.setModel(modelo2);
        }catch (SQLException e) {
            System.out.println("Error al traer personajes: "+e.getMessage());
        }      
    }
    
    public void ListaMalos(ClasePostales postales, JTable table) {
        
        String[] title = {"ID DE LOS PERSONAJES"};
        String[] datos = new String[1];
        DefaultTableModel modelo2 = new DefaultTableModel(null, title);
        String sql = "call pa_ListMalos(?)";
        ListaSimplePersonajes ListS = new ListaSimplePersonajes();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                postales.setIdPersonaje(rs.getInt(1));
                
                //Acá se insertan los nodos
                ListS.insert(postales);
                
                //Se agregra el id del personaje a la tabla
                datos[0] = Integer.toString(postales.getIdPersonaje());
                modelo2.addRow(datos);
            } 
            table.setModel(modelo2);
        }catch (SQLException e) {
            System.out.println("Error al traer personajes: "+e.getMessage());
        } 
    }
        
    
    
    public void ListaTodos(ClasePostales postales, JTable table) {
        
        String[] title = {"ID DE TODOS MIS PERSONAJES"};
        String[] datos = new String[1];
        DefaultTableModel modelo = new DefaultTableModel(null, title);
        String sql = "call pa_ListTodos(?);";
        DoublyLinkedList lista = new DoublyLinkedList();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                postales.setIdPersonaje(rs.getInt(1));
                
                //Acá se insertan los nodos
                lista.insert(postales);
                
                //Se agregra el id del personaje a la tabla
                datos[0] = Integer.toString(postales.getIdPersonaje());
                modelo.addRow(datos);
            } 
            table.setModel(modelo);
            
        } catch (SQLException e) {
            System.out.println("Error al traer todos los personajes: "+e.getMessage());
        }    
    }
    
    public void ListaRepetidas(ClasePostales postales, JTable table) {
        String[] title = {"ID DEL PERSONAJE", "VECES REPETIDAS"};
        String[] datos = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, title);
        String sql = "select idPersonaje, count(idPersonaje)  as cuantos from "
                + "postales where idPerfil = ? group by 1 having count(idPersonaje) > 1;";
        CircularDoublyList lista = new CircularDoublyList();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            rs = ps.executeQuery();
            
            while(rs.next()) {
                postales.setIdPersonaje(rs.getInt(1));
                
                //Acá se insertan los nodos
                lista.insert(postales);
                
                //Se agregra el id del personaje a la tabla
                datos[0] = Integer.toString(postales.getIdPersonaje());
                datos[1] = Integer.toString(rs.getInt(2));
                modelo.addRow(datos);
            }
            table.setModel(modelo);
            
        } catch(SQLException e) {
            System.out.println("Error al traer repetidas: "+e.getMessage());
        }
    }
}
