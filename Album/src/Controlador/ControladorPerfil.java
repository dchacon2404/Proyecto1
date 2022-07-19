package Controlador;

import Modelo.Perfil;
import Modelo.PerfilDAO;
import vista.CrearPerfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Login;

public class ControladorPerfil implements ActionListener {
    
    CrearPerfil vistaPerfil = new CrearPerfil();
    Perfil p = new Perfil();
    PerfilDAO dao = new PerfilDAO();
    Login log = new Login(); 
    
    
     public ControladorPerfil(CrearPerfil vista) {
        this.vistaPerfil = vista;
        this.vistaPerfil.btnCancelar.addActionListener(this);
        this.vistaPerfil.btnCrearPerfil.addActionListener(this);
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
        
        if (e.getSource() == vistaPerfil.btnCrearPerfil) {
            if (vistaPerfil.txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaPerfil, "Ingrese el nombre para crear el perfil");
            } else if (vistaPerfil.txtApellidos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaPerfil, "Ingrese los apellidos para crear el perfil");
            } else if((int) vistaPerfil.spEdad.getValue() <= 14) {
                JOptionPane.showMessageDialog(vistaPerfil, "La edad es menor a la indicada para crear un perfil");
            } else if (vistaPerfil.txtNombreU.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaPerfil, "Ingrese el nombre de usuario para crear el perfil");
            } else if (vistaPerfil.txtContrasena.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaPerfil, "Ingrese una contraseña para crear el perfil");
            } else {
                agregarPerfil();
            }
        }
    }
     
    public void agregarPerfil() {
        String nombre = vistaPerfil.txtNombre.getText();
        String apellidos = vistaPerfil.txtApellidos.getText();
        int edad = (int) vistaPerfil.spEdad.getValue();
        String nombreU = vistaPerfil.txtNombreU.getText();
        String contrasena = vistaPerfil.txtContrasena.getText();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setEdad(edad);
        p.setNombreUsuario(nombreU);
        p.setContrasena(contrasena);
        int r = dao.agregarPerfil(p);
        
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaPerfil, "El perfil se creó correctamente");
            vistaPerfil.dispose();
            log.setVisible(true);
            log.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(vistaPerfil, "No se pudo crear el perfil");
        }
    }
}
