package Modelo;

public class NodePostales {
    
    private ClasePostales postales;
    private NodePostales next;
    private NodePostales previous;
    
    //Este constructor se usa en el insert de las listas simples
    public NodePostales() {}
    
    //Este constructor se usa en el insert de la lista doble
    public NodePostales(ClasePostales postales) {
        this.postales = postales;
    }

    public ClasePostales getPostales() {
        return postales;
    }

    public NodePostales getNext() {
        return next;
    }

    public void setPostales(ClasePostales postales) {
        this.postales = postales;
    }
    
    public void setNext(NodePostales next) {
        this.next = next;
    }
    
    public NodePostales getPrevious() {
        return previous;
    }
    
    public void setPrevious(NodePostales previous) {
        this.previous = previous;
    }
}
