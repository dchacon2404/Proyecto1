package Modelo;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ListaSimplePersonajesBuenos {
    Connection cnn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion conexion = new Conexion();
    
    private NodePostales head;
    private NodePostales tail;

    public ListaSimplePersonajesBuenos() {
    }

    public NodePostales getHead() {
        return head;
    }

    public NodePostales getTail() {
        return tail;
    }

    public void setHead(NodePostales head) {
        this.head = head;
    }

    public void setTail(NodePostales tail) {
        this.tail = tail;
    }
    
    public void insert(ClasePostales postal) {
        
        NodePostales node = new NodePostales();
        node.setPostales(postal);
        
        if (this.getHead() == null) {
            this.setHead(node);
        } else {
            NodePostales currentNode = this.getHead();
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
    }
}
