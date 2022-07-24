package Controlador;

import Modelo.Personajes;
import Modelo.PostalesDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import vista.Postales;

public class ControladorPostales implements ActionListener {
    
    Personajes per = new Personajes();
    Postales post = new Postales();
    PostalesDAO dao = new PostalesDAO();

    public ControladorPostales(Postales post) {
        this.post = post;
        this.post.btnAbrirPostal1.addActionListener(this);
        this.post.btnAbrirPostal2.addActionListener(this);
        this.post.btnAbrirPostal3.addActionListener(this);
        this.post.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == post.btnAbrirPostal1) {
            traerPostal(post.lblIdPostal1, post.lblPostal1, post.lblPath1);
        }
        
        if (e.getSource() == post.btnAbrirPostal2) {
            traerPostal(post.lblIdPostal2, post.lblPostal2, post.lblPath2);
        }
        
        if (e.getSource() == post.btnAbrirPostal3) {
            traerPostal(post.lblIdPostal3, post.lblPostal3, post.lblPath3);
        }
        
        if (e.getSource() == post.btnGuardar) {
        }
    }
    
    public void traerPostal(JLabel label1, JLabel label2, JLabel label3) {
        dao.traerPostal1(label1, label2, label3);
    }
    
    public void agregarP1() {

    }

    public void agregarP2() {

    }

    public void agregarP3() {

    }
}
