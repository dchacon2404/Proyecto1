/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dchac
 */
public class Postales {
    
    private int idPerfil;
    private int idPersonaje;
    private byte[] imagen;

    public Postales() {
    }
    
    

    public Postales(int idPerfil, int idPersonaje, byte[] imagen) {
        this.idPerfil = idPerfil;
        this.idPersonaje = idPersonaje;
        this.imagen = imagen;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
    
    
    
}
