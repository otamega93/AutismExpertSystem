package AESDAO;

import AESConnection.DBConnection;
import AESDAOInterfaces.IPatientDAO;
import AESData.PatientData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PatientDAO implements IPatientDAO {
    
    private final DBConnection mysql = new DBConnection();
    private final Connection conn = mysql.ConnecrDb();
    private String sSQL = "";
    private PreparedStatement pst = null;
    private final String temp = "";
    
    @Override
    public DefaultTableModel dataLoad(String value) {

        ResultSet rs;
        DefaultTableModel model;

        try {
            String[] headers = {"ID", "Número Historia","Nombre", "Teléfono", "Dirección", "Número Diagnóstico", "Borrado el", "Actualizado el"};
            String[] registers = new String[8];
            sSQL = "SELECT * FROM Patient where (patient_id) LIKE '%" + value + "%' OR (patient_name) LIKE '%" + value + "%'"
                    + " OR (patient_historialnumber) ";

            model = new DefaultTableModel(null, headers);
            pst = conn.prepareStatement(sSQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                registers[0] = rs.getString("patient_id");
                registers[1] = rs.getString("patient_historialnumber");
                registers[2] = rs.getString("patient_name");
                registers[3] = rs.getString("patient_phonenumber");
                registers[4] = rs.getString("patient_address");
                registers[5] = rs.getString("diagnosis_id");
                registers[6] = rs.getString("deleted_at");
                registers[7] = rs.getString("updated_at");
                
                model.addRow(registers);
            }

            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return null;
        }

    }
    
    @Override
    public boolean add(PatientData patientData) {

        try {

            sSQL = "INSERT INTO Patient(patient_name,patient_address,patient_phonenumber,patient_id,patient_historialnumber,deleted_at) values (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sSQL);

            pst.setString(1, patientData.getPatientName());
            pst.setString(2, patientData.getPatientAddress());
            pst.setString(3, patientData.getPatientPhoneNumber());
            pst.setInt(4, patientData.getPatientId());
            pst.setInt(5, patientData.getHistorialNumber());
            pst.setString(6, patientData.getDeletedAt());
           
            pst.execute();
            return true;

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return false;
        }

    }

    @Override
    public boolean update(PatientData patientData) {
            
        try {

            int patientId = patientData.getPatientId();
            int patientHistorialNumber = patientData.getHistorialNumber();
            String patientName = patientData.getPatientName();
            String patientAddress = patientData.getPatientAddress();
            String patientPhoneNumber = patientData.getPatientPhoneNumber();
                        
            String sSQL = "UPDATE Patient SET patient_name='" + patientName + "', patient_address='" + patientAddress + "',"
                + " patient_phonenumber='" + patientPhoneNumber + "', patient_historialnumber='" + patientHistorialNumber + "',"
                + "WHERE patient_id='" + patientId + "' ";
            PreparedStatement pst = conn.prepareStatement(sSQL);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro actualizado");

            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return false;

        }
    }

    @Override
    public boolean delete(PatientData patientData) {
        
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        int value = patientData.getPatientId();

        sSQL = "UPDATE Patient SET deleted_at='" + timestamp + "' WHERE patient_id='" + value + "' ";
        
        try {
                pst = conn.prepareStatement(sSQL);
                pst.execute();

                return true;
        }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return false;
        }
    }
}
