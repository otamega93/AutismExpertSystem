/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AESViews;

import AESDAO.PatientDAO;
import AESData.PatientData;
import javax.swing.JOptionPane;

/**
 *
 * @author otamega
 */
public class JInternalFrameNewPatient extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameNewPatient
     */
    public JInternalFrameNewPatient() {
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

        jPanelNewPatient = new javax.swing.JPanel();
        jLabelNewPatientTitle = new javax.swing.JLabel();
        jLabelPatientId = new javax.swing.JLabel();
        jLabelPatientName = new javax.swing.JLabel();
        jLabelPatientAddress = new javax.swing.JLabel();
        jLabelPatientPhoneNumber = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jTextFieldPatientPhoneNumber = new javax.swing.JTextField();
        jTextFieldPatientName = new javax.swing.JTextField();
        jTextFieldPatientAddress = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonSave1 = new javax.swing.JButton();
        jLabelPatientHistorialNumber = new javax.swing.JLabel();
        jTextFieldPatientHistorialNumber = new javax.swing.JTextField();

        setTitle("Nuevo paciente");

        jLabelNewPatientTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelNewPatientTitle.setText("Registro de nuevos pacientes");

        jLabelPatientId.setText("Identificación del paciente:");

        jLabelPatientName.setText("Nombre del paciente:");

        jLabelPatientAddress.setText("Dirección del paciente:");

        jLabelPatientPhoneNumber.setText("Teléfono del paciente:");

        jButtonSave.setText("Salir");

        jButtonSave1.setText("Guardar");
        jButtonSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSave1ActionPerformed(evt);
            }
        });

        jLabelPatientHistorialNumber.setText("Nro de historia del paciente:");

        javax.swing.GroupLayout jPanelNewPatientLayout = new javax.swing.GroupLayout(jPanelNewPatient);
        jPanelNewPatient.setLayout(jPanelNewPatientLayout);
        jPanelNewPatientLayout.setHorizontalGroup(
            jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNewPatientTitle)
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                            .addComponent(jLabelPatientId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPatientId))
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                            .addComponent(jLabelPatientName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPatientName))
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                            .addComponent(jLabelPatientAddress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                            .addComponent(jLabelPatientPhoneNumber)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPatientHistorialNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                                        .addComponent(jButtonSave1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabelPatientHistorialNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNewPatientLayout.setVerticalGroup(
            jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNewPatientTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientId)
                    .addComponent(jTextFieldPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPatientName)
                    .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPatientAddress)
                    .addComponent(jTextFieldPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPatientPhoneNumber)
                    .addComponent(jTextFieldPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPatientHistorialNumber)
                    .addComponent(jTextFieldPatientHistorialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave1)
                    .addComponent(jButtonSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSave1ActionPerformed
        
        String deleted = " ";
        PatientData patientData = new PatientData();
        PatientDAO patientDAO = new PatientDAO();
        
        patientData.setPatientId(Integer.parseInt(jTextFieldPatientId.getText()));
        patientData.setPatientName(jTextFieldPatientName.getText());
        patientData.setPatientAddress(jTextFieldPatientAddress.getText());
        patientData.setPatientPhoneNumber(jTextFieldPatientPhoneNumber.getText());
        patientData.setHistorialNumber(Integer.parseInt(jTextFieldPatientHistorialNumber.getText()));
        patientData.setDeletedAt(deleted);
        
        patientDAO.add(patientData);
        JOptionPane.showMessageDialog(this, "Paciente guardado con éxito", "Guardado", WIDTH);
    }//GEN-LAST:event_jButtonSave1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSave1;
    private javax.swing.JLabel jLabelNewPatientTitle;
    private javax.swing.JLabel jLabelPatientAddress;
    private javax.swing.JLabel jLabelPatientHistorialNumber;
    private javax.swing.JLabel jLabelPatientId;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientPhoneNumber;
    private javax.swing.JPanel jPanelNewPatient;
    private javax.swing.JTextField jTextFieldPatientAddress;
    private javax.swing.JTextField jTextFieldPatientHistorialNumber;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldPatientPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
