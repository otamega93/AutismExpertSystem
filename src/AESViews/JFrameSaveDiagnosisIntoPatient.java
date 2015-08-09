/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AESViews;

import AESDAO.PatientDAO;
import AESData.PatientData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author otamega
 */
public class JFrameSaveDiagnosisIntoPatient extends javax.swing.JFrame {

    /**
     * Creates new form JFrameSaveDiagnosisIntoPatient
     */
    private int id = 0;
    private String patientName = "";
    
    JInternalFrameStartDiagnosis jInternalFrameStartDiagnosis = new JInternalFrameStartDiagnosis();
    
    public JFrameSaveDiagnosisIntoPatient() {
        initComponents();
        this.setTitle("Guardar diagnóstico en el paciente");
        dataLoad("");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        System.out.println(jInternalFrameStartDiagnosis.test);
    }

    private void dataLoad(String search) {

        try {
            DefaultTableModel model;
            PatientDAO patientDAO = new PatientDAO();
            model = patientDAO.dataLoad(search);

            jTablePatient.setModel(model);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSaveDiagnosisIntoPatient = new javax.swing.JPanel();
        jLabelExplanation = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatient = new javax.swing.JTable();
        jButtonAsign = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelExplanation.setText("Seleccione el usuario al cual le desea asignar el diagnóstico");

        jLabelSearch.setText("Buscar:");

        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jTablePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePatient);

        jButtonAsign.setText("Asignar");
        jButtonAsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignActionPerformed(evt);
            }
        });

        jButtonExit.setText("Salir");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSaveDiagnosisIntoPatientLayout = new javax.swing.GroupLayout(jPanelSaveDiagnosisIntoPatient);
        jPanelSaveDiagnosisIntoPatient.setLayout(jPanelSaveDiagnosisIntoPatientLayout);
        jPanelSaveDiagnosisIntoPatientLayout.setHorizontalGroup(
            jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createSequentialGroup()
                        .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelExplanation)
                            .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createSequentialGroup()
                                .addComponent(jLabelSearch)
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSaveDiagnosisIntoPatientLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAsign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSaveDiagnosisIntoPatientLayout.setVerticalGroup(
            jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExplanation)
                .addGap(18, 18, 18)
                .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearch)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSaveDiagnosisIntoPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAsign)
                    .addComponent(jButtonExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSaveDiagnosisIntoPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSaveDiagnosisIntoPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignActionPerformed
        PatientData patientData = new PatientData();
        PatientDAO patientDAO = new PatientDAO();
        
        int j = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea asignar el diagnóstico a " + patientName + "?", "¡Alerta!", JOptionPane.OK_CANCEL_OPTION);
        if ((j) == JOptionPane.OK_OPTION) {

            patientData.setPatientId(id);
            patientDAO.addFromDiagnosis(patientData);
            JOptionPane.showMessageDialog(rootPane, "Diagnóstico asignado al paciente exitosamente");
            this.dispose();

        }

        if ((j) == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "No ha asignado el diagnóstico a ningún paciente");
        }        
    }//GEN-LAST:event_jButtonAsignActionPerformed

    private void jTablePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePatientMouseClicked
        int row = jTablePatient.rowAtPoint(evt.getPoint());
        id = Integer.parseInt(jTablePatient.getValueAt(row, 0).toString());
        patientName = jTablePatient.getValueAt(row, 2).toString();
    }//GEN-LAST:event_jTablePatientMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        dataLoad(jTextFieldSearch.getText());
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTextFieldSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchKeyPressed

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
            java.util.logging.Logger.getLogger(JFrameSaveDiagnosisIntoPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveDiagnosisIntoPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveDiagnosisIntoPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameSaveDiagnosisIntoPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameSaveDiagnosisIntoPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsign;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelExplanation;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JPanel jPanelSaveDiagnosisIntoPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatient;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
