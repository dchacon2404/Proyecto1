/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dchac
 */
public class NodePostales {
    
    private Postales postales;
    private NodePostales next;

    public NodePostales() {
    }

    public Postales getPostales() {
        return postales;
    }

    public NodePostales getNext() {
        return next;
    }

    public void setPostales(Postales postales) {
        this.postales = postales;
    }

    public void setNext(NodePostales next) {
        this.next = next;
    }
    
    
    
    
}
