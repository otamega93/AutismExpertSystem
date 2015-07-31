/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AESViews;

/**
 *
 * @author otamega
 */
public class JInternalFrameViewPatient extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameViewPatient
     */
    public JInternalFrameViewPatient() {
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

        jPanelViewPatient = new javax.swing.JPanel();
        jLabelViewPatientTitle = new javax.swing.JLabel();
        jPanelOptionFrame = new javax.swing.JPanel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePatient = new javax.swing.JTable();
        jPanelData = new javax.swing.JPanel();
        jLabelPatientName = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jTextFieldPatientAddress = new javax.swing.JTextField();
        jLabelPatientId = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jLabelPatientPhoneNumber = new javax.swing.JLabel();
        jTextFieldPatientPhoneNumber = new javax.swing.JTextField();
        jButtonReportView = new javax.swing.JButton();

        setTitle("Consulta de pacientes registrados");

        jLabelViewPatientTitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabelViewPatientTitle.setText("Pacientes registrados");

        jPanelOptionFrame.setBorder(javax.swing.BorderFactory.createTitledBorder("Marco de opciones"));

        jButtonSearch.setText("Buscar");

        jButtonEdit.setText("Editar");

        jButtonDelete.setText("Eliminar");

        jButtonRefresh.setText("Refrescar");

        javax.swing.GroupLayout jPanelOptionFrameLayout = new javax.swing.GroupLayout(jPanelOptionFrame);
        jPanelOptionFrame.setLayout(jPanelOptionFrameLayout);
        jPanelOptionFrameLayout.setHorizontalGroup(
            jPanelOptionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDelete)
                .addContainerGap())
        );
        jPanelOptionFrameLayout.setVerticalGroup(
            jPanelOptionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOptionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonRefresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(jTablePatient);

        jPanelData.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabelPatientName.setText("Nombre:");

        jLabelAddress.setText("Dirección:");

        jLabelPatientId.setText("Identidad:");

        jLabelPatientPhoneNumber.setText("Teléfono:");

        jButtonReportView.setText("Ver reporte");

        javax.swing.GroupLayout jPanelDataLayout = new javax.swing.GroupLayout(jPanelData);
        jPanelData.setLayout(jPanelDataLayout);
        jPanelDataLayout.setHorizontalGroup(
            jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataLayout.createSequentialGroup()
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelDataLayout.createSequentialGroup()
                        .addComponent(jLabelPatientId)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabelPatientName)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldPatientName))
                    .addGroup(jPanelDataLayout.createSequentialGroup()
                        .addComponent(jLabelAddress)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDataLayout.createSequentialGroup()
                        .addComponent(jLabelPatientPhoneNumber)
                        .addGap(3, 3, 3)
                        .addComponent(jTextFieldPatientPhoneNumber))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDataLayout.createSequentialGroup()
                        .addGap(0, 186, Short.MAX_VALUE)
                        .addComponent(jButtonReportView)))
                .addContainerGap())
        );
        jPanelDataLayout.setVerticalGroup(
            jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatientName)
                    .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPatientId)
                        .addComponent(jTextFieldPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPatientPhoneNumber)
                        .addComponent(jTextFieldPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAddress)
                    .addGroup(jPanelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPatientAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonReportView)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelViewPatientLayout = new javax.swing.GroupLayout(jPanelViewPatient);
        jPanelViewPatient.setLayout(jPanelViewPatientLayout);
        jPanelViewPatientLayout.setHorizontalGroup(
            jPanelViewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOptionFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelViewPatientLayout.createSequentialGroup()
                        .addComponent(jLabelViewPatientTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelViewPatientLayout.setVerticalGroup(
            jPanelViewPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewPatientLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelViewPatientTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOptionFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelViewPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonReportView;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelPatientId;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPatientPhoneNumber;
    private javax.swing.JLabel jLabelViewPatientTitle;
    private javax.swing.JPanel jPanelData;
    private javax.swing.JPanel jPanelOptionFrame;
    private javax.swing.JPanel jPanelViewPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePatient;
    private javax.swing.JTextField jTextFieldPatientAddress;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldPatientPhoneNumber;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}