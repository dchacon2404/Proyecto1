/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dchac
 */
public class ListaSimplePersonajesBuenos {
    Connection cnn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    
    private NodePersonajesBuenos head;
    private NodePersonajesBuenos tail;

    public ListaSimplePersonajesBuenos() {
    }

    public NodePersonajesBuenos getHead() {
        return head;
    }

    public NodePersonajesBuenos getTail() {
        return tail;
    }

    public void setHead(NodePersonajesBuenos head) {
        this.head = head;
    }

    public void setTail(NodePersonajesBuenos tail) {
        this.tail = tail;
    }
    
    public void insert(ClasePostales postal) {
        
        NodePersonajesBuenos node = new NodePersonajesBuenos();
        node.setPostal(postal);
        
        if (this.getHead() == null) {
            this.setHead(node);
        } else {
            NodePersonajesBuenos currentNode = this.getHead();
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }
    
    public ListaSimplePersonajesBuenos listarBuenos(){
        
        ListaSimplePersonajesBuenos datos = new ListaSimplePersonajesBuenos();
        String sql ="SELECT imagen FROM album.postales\n" +
                    "where idPersonaje < 11\n" +
                    "and idPerfil = ?";
        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                ClasePostales postal = new ClasePostales();
                postal.setIdPerfil(rs.getInt(0));
                postal.setIdPersonaje(rs.getInt(1));
                postal.setImagen(rs.getString(3));
                datos.insert(postal);
                
            }
            
        } catch (Exception e) {
        }
        return datos;
    }
    
    
}
