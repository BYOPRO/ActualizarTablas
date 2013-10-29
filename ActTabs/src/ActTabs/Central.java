package ActTabs;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*@author BYO*/
public class Central extends javax.swing.JFrame {

    DriverBD CONX1 = new DriverBD();

    public Central() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jTabbedPane1 = new javax.swing.JTabbedPane();
          jPanel1 = new javax.swing.JPanel();
          jPanel5 = new javax.swing.JPanel();
          jLabel4 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          TextoPass = new javax.swing.JPasswordField();
          TextoUser = new javax.swing.JTextField();
          jLabel2 = new javax.swing.JLabel();
          TextoBD = new javax.swing.JTextField();
          jLabel1 = new javax.swing.JLabel();
          TextoHost = new javax.swing.JTextField();
          jPanel6 = new javax.swing.JPanel();
          LabelEstadoConx = new javax.swing.JLabel();
          BotonConectar = new javax.swing.JButton();
          jPanel3 = new javax.swing.JPanel();
          LabelReg = new javax.swing.JPanel();
          BotonReg = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("Actualizar registros");

          jTabbedPane1.setBackground(new java.awt.Color(240, 240, 240));
          jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

          jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

          jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de conexión.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

          jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel4.setText("Contraseña:");

          jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel3.setText("Usuario:");

          TextoPass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          TextoPass.setPreferredSize(new java.awt.Dimension(140, 25));
          TextoPass.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TextoPassActionPerformed(evt);
               }
          });

          TextoUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          TextoUser.setPreferredSize(new java.awt.Dimension(140, 25));

          jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel2.setText("Base de datos:");

          TextoBD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          TextoBD.setText("renap");
          TextoBD.setPreferredSize(new java.awt.Dimension(140, 25));

          jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel1.setText("Host:");

          TextoHost.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          TextoHost.setText("localhost");
          TextoHost.setPreferredSize(new java.awt.Dimension(140, 25));

          javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
          jPanel5.setLayout(jPanel5Layout);
          jPanel5Layout.setHorizontalGroup(
               jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(TextoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                              .addComponent(jLabel3)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(TextoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                              .addComponent(jLabel2)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                              .addComponent(TextoBD, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(TextoHost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
          );
          jPanel5Layout.setVerticalGroup(
               jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(TextoHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(TextoBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(TextoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(TextoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel4))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

          LabelEstadoConx.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelEstadoConx.setForeground(new java.awt.Color(255, 0, 0));
          LabelEstadoConx.setText("Desconectado.");

          BotonConectar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          BotonConectar.setText("Conectar");
          BotonConectar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonConectarActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
          jPanel6.setLayout(jPanel6Layout);
          jPanel6Layout.setHorizontalGroup(
               jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotonConectar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelEstadoConx)
                    .addContainerGap())
          );
          jPanel6Layout.setVerticalGroup(
               jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(LabelEstadoConx)
                         .addComponent(BotonConectar))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(73, Short.MAX_VALUE))
          );

          jTabbedPane1.addTab("Conexión", jPanel1);

          LabelReg.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

          BotonReg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          BotonReg.setText("Agregar Registros");
          BotonReg.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BotonRegActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout LabelRegLayout = new javax.swing.GroupLayout(LabelReg);
          LabelReg.setLayout(LabelRegLayout);
          LabelRegLayout.setHorizontalGroup(
               LabelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(LabelRegLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotonReg, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addContainerGap())
          );
          LabelRegLayout.setVerticalGroup(
               LabelRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(LabelRegLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BotonReg)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
          jPanel3.setLayout(jPanel3Layout);
          jPanel3Layout.setHorizontalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LabelReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );
          jPanel3Layout.setVerticalGroup(
               jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(LabelReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE))
          );

          jTabbedPane1.addTab("Registros", jPanel3);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTabbedPane1)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void BotonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConectarActionPerformed
        String CONEXIONSTATE = LabelEstadoConx.getText();
        datos dato = new datos();
        switch (CONEXIONSTATE) {
            case "Desconectado.":
                String IP = TextoHost.getText();
                String BD = TextoBD.getText();
                String USER = TextoUser.getText();
                String PASS = String.valueOf(TextoPass.getPassword());
                
                dato.setHost(IP);
                dato.setBD(BD);
                dato.setUser(USER);
                dato.setPass(PASS);
                
                this.CONX1.DriverBDVarSet(dato);
                try {
                    this.CONX1.Conectar();
                    LabelEstadoConx.setText("Conectado.");
                    LabelEstadoConx.setForeground(Color.BLUE);
                    BotonConectar.setText("Desconectar");
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,
                            "No se pudo establecer una conexión.\n\n"
                            + "Verifique: \n"
                            + "Los datos de conexión.\n"
                            + "Que la base de datos esté en funcionamiento.",
                            "Error en conexión.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "Conectado.":
                try {
                    this.CONX1.Desconectar();
                    LabelEstadoConx.setText("Desconectado.");
                    LabelEstadoConx.setForeground(Color.RED);
                    BotonConectar.setText("Conectar");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo desconectar.", "Error desconectando.", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                break;
        }


    }//GEN-LAST:event_BotonConectarActionPerformed

     private void TextoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPassActionPerformed
         // TODO add your handling code here:
     }//GEN-LAST:event_TextoPassActionPerformed

     private void BotonRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegActionPerformed
         if ("SI".equals(this.CONX1.getStat())) {
             Reg REG1 = new Reg();
             REG1.BorrarRegistros(CONX1);
             REG1.RegistrarDeptos(CONX1);
         } else {
             JOptionPane.showMessageDialog(null, "Conecte el programa con la base de datos.", "No conectado.", JOptionPane.ERROR_MESSAGE);
         }
     }//GEN-LAST:event_BotonRegActionPerformed

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
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Central.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Central().setVisible(true);
            }
        });
    }
     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton BotonConectar;
     private javax.swing.JButton BotonReg;
     private javax.swing.JLabel LabelEstadoConx;
     private javax.swing.JPanel LabelReg;
     private javax.swing.JTextField TextoBD;
     private javax.swing.JTextField TextoHost;
     private javax.swing.JPasswordField TextoPass;
     private javax.swing.JTextField TextoUser;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel3;
     private javax.swing.JPanel jPanel5;
     private javax.swing.JPanel jPanel6;
     private javax.swing.JTabbedPane jTabbedPane1;
     // End of variables declaration//GEN-END:variables
}
