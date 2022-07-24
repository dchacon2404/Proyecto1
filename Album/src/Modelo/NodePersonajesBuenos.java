/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dchac
 */
public class NodePersonajesBuenos {
    
    private ClasePostales postal;
    private NodePersonajesBuenos next;

    public NodePersonajesBuenos() {
    }

    public ClasePostales getPostal() {
        return postal;
    }

    public NodePersonajesBuenos getNext() {
        return next;
    }

    public void setPostal(ClasePostales postal) {
        this.postal = postal;
    }

    public void setNext(NodePersonajesBuenos next) {
        this.next = next;
    }
    
    
    
    
    
}
