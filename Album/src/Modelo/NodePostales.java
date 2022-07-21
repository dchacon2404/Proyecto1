package Modelo;

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
