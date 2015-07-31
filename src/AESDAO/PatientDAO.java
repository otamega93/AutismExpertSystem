package AESDAO;

import AESConnection.DBConnection;
import AESData.PatientData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PatientDAO {
    
    private final DBConnection mysql = new DBConnection();
    private final Connection conn = mysql.ConnecrDb();
    private String sSQL = "";
    private PreparedStatement pst = null;
    private final String temp = "";
    
    public DefaultTableModel cargar(String valor) {

        ResultSet rs;
        DefaultTableModel model;

        try {
            String[] titulos = {"Cedula", "Nombre", "Telefono", "Direccion", "Profesion", "Borrado en"};
            String[] registros = new String[6];
            sSQL = "SELECT * FROM professor where (professor_id) LIKE '%" + valor + "%' or (professor_name) LIKE '%" + valor + "%'"
                    + " or(professor_career_name) LIKE '%" + valor + "%'";

            model = new DefaultTableModel(null, titulos);
            pst = conn.prepareStatement(sSQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("professor_id");
                registros[1] = rs.getString("professor_name");
                registros[2] = rs.getString("professor_phonenumber");
                registros[3] = rs.getString("professor_address");
                registros[4] = rs.getString("professor_career_name");
                registros[5] = rs.getString("deleted_at");
                model.addRow(registros);
            }

            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return null;
        }

    }
    
    public boolean add(PatientData patientData) {

        try {

            sSQL = "INSERT INTO Patient(patient_name,patient_address,patient_phonenumber,patient_id) values (?,?,?,?)";
            pst = conn.prepareStatement(sSQL);

            pst.setObject(1, patientData.getPatientName());
            pst.setString(2, patientData.getPatientAddress());
            pst.setString(3, patientData.getPatientPhoneNumber());
            pst.setInt(4, patientData.getPatientId());
           
            pst.execute();
            return true;

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return false;
        }

    }
}
