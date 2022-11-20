
package figuras;

import javax.swing.JFrame;

public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal() {
        initComponents();
        setTitle("FIGURAS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCilindro = new javax.swing.JButton();
        btnEsfera = new javax.swing.JButton();
        btnPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCilindro.setText("CILINDRO");
        btnCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCilindroActionPerformed(evt);
            }
        });

        btnEsfera.setText("ESFERA");
        btnEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsferaActionPerformed(evt);
            }
        });

        btnPiramide.setText("PIRAMIDE");
        btnPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiramideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCilindro)
                .addGap(18, 18, 18)
                .addComponent(btnEsfera)
                .addGap(18, 18, 18)
                .addComponent(btnPiramide)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCilindro)
                    .addComponent(btnEsfera)
                    .addComponent(btnPiramide))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCilindroActionPerformed

        VentanaCilindro ventanaCilindro = new VentanaCilindro();
        ventanaCilindro.setVisible(true);
    }//GEN-LAST:event_btnCilindroActionPerformed

    private void btnEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsferaActionPerformed

        VentanaEsfera ventanaEsfera = new VentanaEsfera();
        ventanaEsfera.setVisible(true);
    }//GEN-LAST:event_btnEsferaActionPerformed

    private void btnPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiramideActionPerformed

        VentanaPiramide ventanaPiramide = new VentanaPiramide();
        ventanaPiramide.setVisible(true);
    }//GEN-LAST:event_btnPiramideActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCilindro;
    private javax.swing.JButton btnEsfera;
    private javax.swing.JButton btnPiramide;
    // End of variables declaration//GEN-END:variables
}
