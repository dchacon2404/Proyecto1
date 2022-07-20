package Modelo;

public class Personajes {
    private int idPersonaje;
    private byte[] imagen;

    public Personajes() {
    }

    public Personajes(int idPersonaje, byte[] imagen) {
        this.idPersonaje = idPersonaje;
        this.imagen = imagen;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
}
