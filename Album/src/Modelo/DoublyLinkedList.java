package Modelo;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vista.TodosLosPersonajes;


public class DoublyLinkedList {
    Connection cnn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    
    private NodePostales head;
    private NodePostales tail;

    public NodePostales getHead() {
        return head;
    }

    public void setHead(NodePostales head) {
        this.head = head;
    }

    public NodePostales getTail() {
        return tail;
    }

    public void setTail(NodePostales tail) {
        this.tail = tail;
    }
    
    
    public void insert(ClasePostales postales, JLabel label1) {
        String sql = "select idPerfil, idPersonaje, imagen from postales where idPerfil = ?;";
        TodosLosPersonajes pantalla = new TodosLosPersonajes();
        
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, postales.getIdPerfil());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                postales.setIdPerfil(rs.getInt(1));
                postales.setIdPersonaje(rs.getInt(2));
                postales.setImagen(rs.getString(3));
                
                NodePostales newNode = new NodePostales(postales);
                
                if (this.getHead() == null) {
                    this.setHead(newNode);
                    this.setTail(newNode);
                    
                    String imagen = newNode.getPostales().getImagen();
                    ImageIcon ima = new ImageIcon(imagen);
                    Icon icono = new ImageIcon(ima.getImage().getScaledInstance(label1.getWidth(), 
                            label1.getHeight(), java.awt.Image.SCALE_SMOOTH));
                    label1.setIcon(icono);
                    pantalla.lblPath.setText(newNode.getPostales().getImagen());
                    
                    this.getHead().setPrevious(null);
                    this.getTail().setNext(null);
                } else {
                    this.getTail().setNext(newNode);
                    newNode.setPrevious(this.getTail());
                    this.setTail(newNode);
                    this.getTail().setNext(null);
                    
                    String imagen = newNode.getPostales().getImagen();
                    ImageIcon ima = new ImageIcon(imagen);
                    Icon icono = new ImageIcon(ima.getImage().getScaledInstance(label1.getWidth(), 
                            label1.getHeight(), java.awt.Image.SCALE_SMOOTH));
                    label1.setIcon(icono);
                    pantalla.lblPath.setText(newNode.getPostales().getImagen());
                }
            }   
            
        } catch(SQLException e) {
            System.out.println("Error ListaDoble: "+e.getMessage());
        }
    }
    
    public void printNodes(){
        NodePostales currentNode = this.getHead();
        TodosLosPersonajes todos = new TodosLosPersonajes();
        
        if (currentNode == null){
            JOptionPane.showMessageDialog(todos, "Todavía no tienes postales, abre un sobre");
            return; 
        } else {
            //Print each node and then go to next.  
            //System.out.println(currentNode.getPostales().getIdPersonaje() + "\n");
            System.out.println(currentNode.getPostales().getImagen() + "\n");
            //currentNode = currentNode.getNext();  
        }
    }
}
