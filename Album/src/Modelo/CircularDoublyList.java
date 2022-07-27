package Modelo;


public class CircularDoublyList {
    private NodePostales head;
    
    public CircularDoublyList() {}

    public NodePostales getHead() {
        return head;
    }

    public void setHead(NodePostales head) {
        this.head = head;
    }
    
    public void insert (ClasePostales postales) {
        NodePostales newNode = new NodePostales(postales);
        
        if (this.getHead() == null) {
            newNode.setPrevious(newNode);
            newNode.setNext(newNode);
            this.setHead(newNode);
            System.out.println(newNode.getPostales().getIdPersonaje());
            return;
        }
        
        NodePostales tail = this.getHead().getPrevious();
        newNode.setNext(this.getHead());
        this.getHead().setPrevious(newNode);
        tail.setNext(newNode);
        newNode.setPrevious(tail);
        System.out.println(newNode.getPostales().getIdPersonaje());
    }
}
