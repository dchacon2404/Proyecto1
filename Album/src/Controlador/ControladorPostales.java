package Controlador;

import Modelo.PostalesDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
}
