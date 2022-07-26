package Modelo;

public class ClasePostales {
    
    private int idPerfil;
    private int idPersonaje;
    private String imagen;
    
    //Este constructor se usa en el insert de las listas simples
    public ClasePostales() {}

    public int getIdPerfil() {
        return idPerfil;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
