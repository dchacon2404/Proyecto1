package Modelo;

import DB.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


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
    
    
    public void insert(ClasePostales postales) {
        
        NodePostales newNode = new NodePostales(postales);

        if (this.getHead() == null) {
            this.setHead(newNode);
            this.setTail(newNode);

            this.getHead().setPrevious(null);
            this.getTail().setNext(null);
            System.out.println(newNode.getPostales().getImagen());
        } else {
            this.getTail().setNext(newNode);
            newNode.setPrevious(this.getTail());
            this.setTail(newNode);
            this.getTail().setNext(null);
            System.out.println(newNode.getPostales().getImagen());
        }
    }
    
    public void print(){
        NodePostales currentNode = this.getHead();
        
        if (currentNode == null){
            System.out.println("list is empty");  
            return; 
        }
        while(currentNode != null) {  
            //Print each node and then go to next.  
            System.out.println(currentNode.getPostales().getImagen() + " "); 
            currentNode = currentNode.getNext();
        } 
    }
}
