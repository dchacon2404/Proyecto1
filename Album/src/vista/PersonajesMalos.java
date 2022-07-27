package vista;

import DB.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PersonajesMalos extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public PersonajesMalos() {
        initComponents();
        lblIdPerfil.setText(Album.lblIdUsuario.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        lblPersonaje = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMiId = new javax.swing.JLabel();
        lblIdPerfil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableId = new javax.swing.JTable();
        lblIdPersonaje = new javax.swing.JLabel();
        lblPath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(new java.awt.Color(0, 0, 0));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 30));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("   X");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 40, 30));

        lblPersonaje.setBackground(new java.awt.Color(0, 0, 0));
        lblPersonaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPersonaje.setForeground(new java.awt.Color(255, 255, 0));
        lblPersonaje.setText("                          PERSONAJE");
        lblPersonaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        bg.add(lblPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 290, 395));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("MIS PERSONAJES MALOS");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        lblMiId.setBackground(new java.awt.Color(0, 0, 0));
        lblMiId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMiId.setForeground(new java.awt.Color(255, 255, 0));
        lblMiId.setText("Mi id:");
        bg.add(lblMiId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblIdPerfil.setBackground(new java.awt.Color(0, 0, 0));
        lblIdPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIdPerfil.setForeground(new java.awt.Color(255, 255, 0));
        lblIdPerfil.setText(".");
        bg.add(lblIdPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 30, -1));

        tableId.setBackground(new java.awt.Color(0, 0, 0));
        tableId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        tableId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableId.setForeground(new java.awt.Color(255, 255, 0));
        tableId.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableIdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableId);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 190, 100));

        lblIdPersonaje.setBackground(new java.awt.Color(0, 0, 0));
        lblIdPersonaje.setText(".");
        bg.add(lblIdPersonaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 30, -1));

        lblPath.setBackground(new java.awt.Color(0, 0, 0));
        lblPath.setText(".");
        bg.add(lblPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.yellow);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseExited

    private void tableIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableIdMouseClicked

       PreparedStatement ps;
        ResultSet rs;
        Connection cnn;
        Conexion conexion = new Conexion();
        int fila = tableId.getSelectedRow();
        lblIdPersonaje.setText(tableId.getValueAt(fila, 0).toString());

        String sql = "SELECT imagen FROM album.postales\n" +         
                     "where idPerfil = ? and idPersonaje = ?";

        try {
            cnn = conexion.getConnection();
            ps = cnn.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(lblIdPerfil.getText()));
            ps.setInt(2, Integer.parseInt(lblIdPersonaje.getText()));
            rs = ps.executeQuery();

            while(rs.next()) {
                lblPath.setText(rs.getString(1));

                ImageIcon img = new ImageIcon(lblPath.getText());
                Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblPersonaje.getWidth(),
                    lblPersonaje.getHeight(), java.awt.Image.SCALE_SMOOTH));
            lblPersonaje.setIcon(icono);
        }
        } catch (SQLException e) {
        }


    }//GEN-LAST:event_tableIdMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonajesMalos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonajesMalos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonajesMalos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonajesMalos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonajesMalos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JLabel btnSalir;
    public javax.swing.JPanel head;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIdPerfil;
    public javax.swing.JLabel lblIdPersonaje;
    public javax.swing.JLabel lblMiId;
    public javax.swing.JLabel lblPath;
    public javax.swing.JLabel lblPersonaje;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTable tableId;
    // End of variables declaration//GEN-END:variables
}
