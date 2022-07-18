/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Perfil;
import Modelo.PerfilDAO;
import vista.CrearPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
/**
 *
 * @author Jahir
 */
public class ControladorPerfil implements ActionListener {
    
    CrearPerfil vistaPerfil = new CrearPerfil();
    Perfil p = new Perfil();
    PerfilDAO dao = new PerfilDAO();
    
    
     public ControladorPerfil(CrearPerfil vista) {
        this.vistaPerfil = vista;
        this.vistaPerfil.btnCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaPerfil.btnCancelar) {
            vistaPerfil.txtNombre.setText(null);
            vistaPerfil.txtApellidos.setText(null);
            vistaPerfil.spEdad.setValue(0);
            vistaPerfil.txtNombreU.setText(null);
            vistaPerfil.txtContrasena.setText(null);
        }
    }
     
     


}
