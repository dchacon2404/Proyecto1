package Modelo;


public class DoublyLinkedList {
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
        } else {
            this.getTail().setNext(newNode);
            newNode.setPrevious(this.getTail());
            this.setTail(newNode);
            this.getTail().setNext(null);
        }
    }
}
