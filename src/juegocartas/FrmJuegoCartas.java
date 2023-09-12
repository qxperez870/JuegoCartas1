package juegocartas;

import javax.swing.JOptionPane;

public class FrmJuegoCartas extends javax.swing.JFrame {
    
    private Jugador jugador1=new Jugador();
    private Jugador jugador2=new Jugador();

    public FrmJuegoCartas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRepartir = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        tpJugadores = new javax.swing.JTabbedPane();
        pnlJugador1 = new javax.swing.JPanel();
        pnlJugador2 = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JButton();
        btnEscaleras = new javax.swing.JButton();
        btnPuntaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRepartir.setText("Repartir");
        btnRepartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepartirActionPerformed(evt);
            }
        });

        btnVerificar.setText("Grupos por nombre");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        tpJugadores.setBackground(new java.awt.Color(255, 255, 204));

        pnlJugador1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout pnlJugador1Layout = new javax.swing.GroupLayout(pnlJugador1);
        pnlJugador1.setLayout(pnlJugador1Layout);
        pnlJugador1Layout.setHorizontalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        pnlJugador1Layout.setVerticalGroup(
            pnlJugador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Martín Estrada Contreras", pnlJugador1);

        pnlJugador2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout pnlJugador2Layout = new javax.swing.GroupLayout(pnlJugador2);
        pnlJugador2.setLayout(pnlJugador2Layout);
        pnlJugador2Layout.setHorizontalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );
        pnlJugador2Layout.setVerticalGroup(
            pnlJugador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        tpJugadores.addTab("Raúl Vidal", pnlJugador2);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnEscaleras.setText("Escaleras");
        btnEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscalerasActionPerformed(evt);
            }
        });

        btnPuntaje.setText("PUNTAJE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tpJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRepartir)
                    .addComponent(btnOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerificar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEscaleras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btnPuntaje)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRepartir)
                            .addComponent(btnVerificar))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdenar)
                            .addComponent(btnEscaleras))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnPuntaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(tpJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepartirActionPerformed
        jugador1.repartir();
        jugador2.repartir();
        jugador1.mostrar(pnlJugador1);
        jugador2.mostrar(pnlJugador2);   
    }//GEN-LAST:event_btnRepartirActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        int pestaña=tpJugadores.getSelectedIndex();
        String mensaje="";
        switch(pestaña){
            case 0:
                mensaje=jugador1.getGruposPorNombre();
                break;
            case 1:
                mensaje=jugador2.getGruposPorNombre();
                break;
        }
        
        JOptionPane.showMessageDialog(null,mensaje);
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        jugador1.ordenar();
        jugador2.ordenar();
        jugador1.mostrar(pnlJugador1);
        jugador2.mostrar(pnlJugador2);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEscalerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscalerasActionPerformed
        int pestaña=tpJugadores.getSelectedIndex();
        String mensaje="";
        switch(pestaña){
            case 0:
                jugador1.ordenar();
                mensaje=jugador1.getGruposPorEscalera();
                break;
            case 1:
                jugador2.ordenar();
                mensaje=jugador2.getGruposPorEscalera();
                break;
        }
        
        JOptionPane.showMessageDialog(null,mensaje);
    }//GEN-LAST:event_btnEscalerasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuegoCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuegoCartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscaleras;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnPuntaje;
    private javax.swing.JButton btnRepartir;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JPanel pnlJugador1;
    private javax.swing.JPanel pnlJugador2;
    private javax.swing.JTabbedPane tpJugadores;
    // End of variables declaration//GEN-END:variables
}
