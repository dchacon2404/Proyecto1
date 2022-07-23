package Modelo;

public class Personajes {
    private int idPersonaje;
    private String imagen;

    public Personajes() {
    }

    public Personajes(int idPersonaje, String imagen) {
        this.idPersonaje = idPersonaje;
        this.imagen = imagen;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
