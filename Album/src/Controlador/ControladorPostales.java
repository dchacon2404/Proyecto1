package Controlador;

import Modelo.Personajes;
import Modelo.PostalesDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
        }

        if (e.getSource() == post.btnGuardar) {
        }
    }

    public void agregarP1() {

    }

    public void agregarP2() {

    }

    public void agregarP3() {

    }
}
