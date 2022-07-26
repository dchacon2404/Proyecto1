package vista;

import Modelo.ClasePostales;
import Modelo.PostalesDAO;
import java.awt.Color;


public class Album extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Album() {
        initComponents();
        lblIdUsuario.setText(Principal.lblId.getText());
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
        btnBuenos = new javax.swing.JButton();
        btnVillanos = new javax.swing.JButton();
        btnTodas = new javax.swing.JButton();
        btnRepetidas = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblIdUsuario = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addContainerGap(359, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnBuenos.setBackground(new java.awt.Color(0, 0, 0));
        btnBuenos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuenos.setForeground(new java.awt.Color(255, 255, 0));
        btnBuenos.setText("VER LAS POSTALES DE PERSONAJES BUENOS");
        btnBuenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuenosActionPerformed(evt);
            }
        });

        btnVillanos.setBackground(new java.awt.Color(0, 0, 0));
        btnVillanos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVillanos.setForeground(new java.awt.Color(255, 255, 0));
        btnVillanos.setText("VER LAS POSTALES DE PERSONAJES VILLANOS");
        btnVillanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVillanosActionPerformed(evt);
            }
        });

        btnTodas.setBackground(new java.awt.Color(0, 0, 0));
        btnTodas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTodas.setForeground(new java.awt.Color(255, 255, 0));
        btnTodas.setText("VER TODAS LAS POSTALES");
        btnTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodasActionPerformed(evt);
            }
        });

        btnRepetidas.setBackground(new java.awt.Color(0, 0, 0));
        btnRepetidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRepetidas.setForeground(new java.awt.Color(255, 255, 0));
        btnRepetidas.setText("VER POSTALES REPETIDAS");
        btnRepetidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepetidasActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setText("ÁLBUM");

        lblIdUsuario.setBackground(new java.awt.Color(0, 0, 0));
        lblIdUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIdUsuario.setForeground(new java.awt.Color(255, 255, 0));
        lblIdUsuario.setText(".");

        lblId.setBackground(new java.awt.Color(0, 0, 0));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 0));
        lblId.setText("Mi id:");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(lblTitulo))
                    .addComponent(btnVillanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRepetidas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblIdUsuario)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addComponent(btnBuenos)
                .addGap(32, 32, 32)
                .addComponent(btnVillanos)
                .addGap(30, 30, 30)
                .addComponent(btnTodas)
                .addGap(35, 35, 35)
                .addComponent(btnRepetidas)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
        Principal p = new Principal(Integer.parseInt(lblIdUsuario.getText()));
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuenosActionPerformed
        PersonajesBuenos buenos = new PersonajesBuenos();
        buenos.setVisible(true);
        buenos.setLocationRelativeTo(null);
        PostalesDAO dao = new PostalesDAO();
        ClasePostales postales = new ClasePostales();
        
        postales.setIdPerfil(Integer.parseInt(lblIdUsuario.getText()));
        dao.ListaBuenos(postales, buenos.tableId);
    }//GEN-LAST:event_btnBuenosActionPerformed

    private void btnTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodasActionPerformed
        TodosLosPersonajes todos  = new TodosLosPersonajes();
        todos.setVisible(true);
        todos.setLocationRelativeTo(null);
        PostalesDAO dao = new PostalesDAO();
        ClasePostales postales = new ClasePostales();
        
        postales.setIdPerfil(Integer.parseInt(lblIdUsuario.getText()));
        dao.ListaTodos(postales, todos.tableId);
    }//GEN-LAST:event_btnTodasActionPerformed

    private void btnVillanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVillanosActionPerformed
        PersonajesMalos malos = new PersonajesMalos();
        malos.setVisible(true);
        malos.setLocationRelativeTo(null);
        PostalesDAO dao = new PostalesDAO();
        ClasePostales postales = new ClasePostales();
        
        postales.setIdPerfil(Integer.parseInt(lblIdUsuario.getText()));
        dao.ListaMalos(postales, malos.tableId);
    }//GEN-LAST:event_btnVillanosActionPerformed

    private void btnRepetidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepetidasActionPerformed
        Repetidas repetidas = new Repetidas();
        repetidas.setVisible(true);
        repetidas.setLocationRelativeTo(null);
        PostalesDAO dao = new PostalesDAO();
        ClasePostales postales = new ClasePostales();
        
        postales.setIdPerfil(Integer.parseInt(lblIdUsuario.getText()));
        dao.ListaRepetidas(postales, repetidas.tableId);
    }//GEN-LAST:event_btnRepetidasActionPerformed

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
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Album.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Album().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    public javax.swing.JButton btnBuenos;
    public javax.swing.JButton btnRepetidas;
    private javax.swing.JLabel btnSalir;
    public javax.swing.JButton btnTodas;
    public javax.swing.JButton btnVillanos;
    private javax.swing.JPanel head;
    private javax.swing.JLabel lblId;
    public static javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
