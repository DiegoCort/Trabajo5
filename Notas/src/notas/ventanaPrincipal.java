
package notas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ventanaPrincipal extends javax.swing.JFrame {

    public ventanaPrincipal() {
        initComponents();
        setTitle("Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btncalcular = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        txtNota5 = new javax.swing.JTextField();
        promedio = new javax.swing.JLabel();
        dEstandar = new javax.swing.JLabel();
        mayor = new javax.swing.JLabel();
        menor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nota 1:");

        jLabel2.setText("Nota 2:");

        jLabel3.setText("Nota 3:");

        jLabel4.setText("Nota 4:");

        jLabel5.setText("Nota 5:");

        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        promedio.setText("PROMEDIO: ");

        dEstandar.setText("DESVIACION ESTANDAR:");

        mayor.setText("NOTA MAYOR:");

        menor.setText("NOTA MENOR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(promedio)
                            .addComponent(dEstandar)
                            .addComponent(mayor)
                            .addComponent(menor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNota4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNota2)
                            .addComponent(txtNota3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btncalcular)
                        .addGap(27, 27, 27)
                        .addComponent(btnlimpiar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalcular)
                    .addComponent(btnlimpiar))
                .addGap(18, 18, 18)
                .addComponent(promedio)
                .addGap(18, 18, 18)
                .addComponent(dEstandar)
                .addGap(18, 18, 18)
                .addComponent(mayor)
                .addGap(18, 18, 18)
                .addComponent(menor)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtNota5.setText("");
        promedio.setText("PROMEDIO: ");
        dEstandar.setText("DESVIACION ESTANDAR: ");
        mayor.setText("NOTA MAYOR: ");
        menor.setText("NOTA MENOR: ");
        
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed

        try{
        Notas  notas = new Notas();
        notas.ListaNotas[0]=Double.parseDouble(txtNota1.getText());
        notas.ListaNotas[1]=Double.parseDouble(txtNota2.getText());
        notas.ListaNotas[2]=Double.parseDouble(txtNota3.getText());
        notas.ListaNotas[3]=Double.parseDouble(txtNota4.getText());
        notas.ListaNotas[4]=Double.parseDouble(txtNota5.getText());
        
        notas.cPromedio();
        notas.dEstandar();
        notas.cMenor();
        notas.cMenor();
        
        promedio.setText("PROMEDIO: " + String.valueOf(String.format("%.2f", notas.cPromedio())));
        double DE = notas.dEstandar();
        dEstandar.setText("DESVIACION ESTANDAR: " + String.format("%.2f", DE));
        mayor.setText("NOTA MAYOR: " + String.valueOf(notas.cMayor()));
        menor.setText("NOTA MENOR: " + String.valueOf(notas.cMenor()));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Se ha introducido un caracter no numerico");
            txtNota1.setText("");
            txtNota2.setText("");
            txtNota3.setText("");
            txtNota4.setText("");
            txtNota5.setText("");
        }
    }//GEN-LAST:event_btncalcularActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel dEstandar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel mayor;
    private javax.swing.JLabel menor;
    private javax.swing.JLabel promedio;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextField txtNota5;
    // End of variables declaration//GEN-END:variables
}
