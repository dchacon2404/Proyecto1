package Controlador;

import Modelo.PostalesDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import vista.Postales;

public class ControladorPostales implements ActionListener{
    
    Postales post = new Postales();
    PostalesDAO dao = new PostalesDAO();
    
    public ControladorPostales(Postales post){
        this.post = post;
        this.post.btnAbrirPostal2.addActionListener(this);
        this.post.btnGuardar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == post.btnGuardar) {
        }
    }
    
    public void agregarP1(File ruta) {
        int idPerfil = Integer.parseInt(post.lblIdUsuario.getText());
        int idPersonaje = Integer.parseInt(post.lblIdPostal1.getText());
        
        try {
            byte[] imagen = new byte[(int) ruta.length()];
        } catch (Exception e) {
        }
    }
    
    public void agregarP2() {
        
    }
    
    public void agregarP3() {
        
    }
}
