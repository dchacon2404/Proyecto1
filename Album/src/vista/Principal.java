package vista;

import Controlador.ControladorPostales;
import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Principal(int idPerfil) {
        initComponents();
        lblId.setText(Integer.toString(idPerfil));
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
        btnSalir = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        btnSobres = new javax.swing.JButton();
        btnAlbum = new javax.swing.JButton();
        head = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblId1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("  X");
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
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 0, 30, 30));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("MENÚ");
        bg.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        fondo.setBackground(new java.awt.Color(0, 0, 0));
        fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        btnSobres.setBackground(new java.awt.Color(0, 0, 0));
        btnSobres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSobres.setForeground(new java.awt.Color(255, 255, 0));
        btnSobres.setText("SOBRES");
        btnSobres.setBorder(null);
        btnSobres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobresActionPerformed(evt);
            }
        });

        btnAlbum.setBackground(new java.awt.Color(0, 0, 0));
        btnAlbum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlbum.setForeground(new java.awt.Color(255, 255, 51));
        btnAlbum.setText("ÁLBUM");
        btnAlbum.setBorder(null);
        btnAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnSobres, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSobres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 90));

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
            .addGap(0, 320, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        bg.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        lblId.setBackground(new java.awt.Color(0, 0, 0));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 0));
        lblId.setText(".");
        bg.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 30, -1));

        lblId1.setBackground(new java.awt.Color(0, 0, 0));
        lblId1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId1.setForeground(new java.awt.Color(255, 255, 0));
        lblId1.setText("Mi id:");
        bg.add(lblId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setForeground(Color.yellow);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSobresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobresActionPerformed
        this.dispose();
        Postales pos = new Postales();
        pos.setVisible(true);
        pos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSobresActionPerformed

    private void btnAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumActionPerformed
        this.dispose();
        Album alb = new Album();
        alb.setVisible(true);
        alb.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAlbumActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(Integer.parseInt(lblId.getText())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnAlbum;
    private javax.swing.JLabel btnSalir;
    public javax.swing.JButton btnSobres;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel head;
    public static javax.swing.JLabel lblId;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
