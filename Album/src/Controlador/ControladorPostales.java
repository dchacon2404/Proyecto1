package Controlador;

import Modelo.Personajes;
import Modelo.PostalesDAO;
import Modelo.ClasePostales;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vista.Postales;
import vista.Principal;

public class ControladorPostales implements ActionListener {
    
    Personajes per = new Personajes();
    Postales pantalla = new Postales();
    PostalesDAO dao = new PostalesDAO();
    ClasePostales postales = new ClasePostales();

    public ControladorPostales(Postales pantalla) {
        this.pantalla = pantalla;
        this.pantalla.btnAbrirPostal1.addActionListener(this);
        this.pantalla.btnAbrirPostal2.addActionListener(this);
        this.pantalla.btnAbrirPostal3.addActionListener(this);
        this.pantalla.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == pantalla.btnAbrirPostal1) {
            traerPostal(pantalla.lblIdPostal1, pantalla.lblPostal1, pantalla.lblPath1);
        }
        
        if (e.getSource() == pantalla.btnAbrirPostal2) {
            traerPostal(pantalla.lblIdPostal2, pantalla.lblPostal2, pantalla.lblPath2);
        }
        
        if (e.getSource() == pantalla.btnAbrirPostal3) {
            traerPostal(pantalla.lblIdPostal3, pantalla.lblPostal3, pantalla.lblPath3);
        }
        
        if (e.getSource() == pantalla.btnGuardar) {
            
            if (pantalla.lblPath1.getText().equals(".")) {
                JOptionPane.showMessageDialog(pantalla, "Abra el primer sobre para guardar las postales");
            } else if(pantalla.lblPath2.getText().equals(".")) {
                JOptionPane.showMessageDialog(pantalla, "Abra el segundo sobre para guardar las postales");
            } else if(pantalla.lblPath3.getText().equals(".")) {
                JOptionPane.showMessageDialog(pantalla, "Abra el tercer sobre para guardar las postales");
            } else {
                agregarP1();
                agregarP2();
                agregarP3();
                pantalla.dispose();
                Principal principal = new Principal(Integer.parseInt(pantalla.lblIdUsuario.getText()));
                principal.setVisible(true);
                principal.setLocationRelativeTo(null);
            }
        }
    }
    
    public void traerPostal(JLabel label1, JLabel label2, JLabel label3) {
        dao.traerPostal1(label1, label2, label3);
    }
    
    public void agregarP1() {
        int idPerfil = Integer.parseInt(pantalla.lblIdUsuario.getText());
        int idPersonaje = Integer.parseInt(pantalla.lblIdPostal1.getText());
        String imagen = pantalla.lblPath1.getText();
        postales.setIdPerfil(idPerfil);
        postales.setIdPersonaje(idPersonaje);
        postales.setImagen(imagen);
        int r = dao.agregarP1(postales);
        
        if (r == 1) {
            JOptionPane.showMessageDialog(pantalla, "Postales guardadas");
        } else {
            JOptionPane.showMessageDialog(pantalla, "Las postales no se pudieron guardar");
        }
    }

    public void agregarP2() {
        int idPerfil = Integer.parseInt(pantalla.lblIdUsuario.getText());
        int idPersonaje = Integer.parseInt(pantalla.lblIdPostal2.getText());
        String imagen = pantalla.lblPath2.getText();
        postales.setIdPerfil(idPerfil);
        postales.setIdPersonaje(idPersonaje);
        postales.setImagen(imagen);
        int r = dao.agregarP2(postales);
        
        if (r == 1) {
            System.out.println("Postal guardada");
        } else {
            System.out.println("Postal no guardada");
        }
    }

    public void agregarP3() {
        int idPerfil = Integer.parseInt(pantalla.lblIdUsuario.getText());
        int idPersonaje = Integer.parseInt(pantalla.lblIdPostal3.getText());
        String imagen = pantalla.lblPath3.getText();
        postales.setIdPerfil(idPerfil);
        postales.setIdPersonaje(idPersonaje);
        postales.setImagen(imagen);
        int r = dao.agregarP3(postales);
        
        if (r == 1) {
            System.out.println("Postal guardada");
        } else {
            System.out.println("Postal no guardada");
        }
    }
}
