/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dchac
 */
public class CustomLinkedListPostales {
    
    private NodePostales head;
    private NodePostales tail;

    public CustomLinkedListPostales() {
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
    
    public void insertarPostal(ClasePostales post) {
        
        NodePostales node = new NodePostales(post);
        node.setPostales(post);
        
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
