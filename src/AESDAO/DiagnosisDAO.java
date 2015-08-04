package AESDAO;

import AESConnection.DBConnection;
import AESDAOInterfaces.IDiagnosisDAO;
import AESData.DiagnosisData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DiagnosisDAO implements IDiagnosisDAO {
    
    private final DBConnection mysql = new DBConnection();
    private final Connection conn = mysql.ConnecrDb();
    private String sSQL = "";
    private PreparedStatement pst = null;
    private final String temp = "";

    @Override
    public DefaultTableModel showDiagnosis(String value) {
        
        ResultSet rs;
        DefaultTableModel model;

        try {
            String[] headers = {"ID", "Tratamiento Diagnóstico","Resultado", "Tratamiento ID", "Actualizado el", "Borrado el"};
            String[] registers = new String[6];
            sSQL = "SELECT * FROM Patient where (diagnosis_id) LIKE '%" + value + "%' OR (diagnosis_result) LIKE '%" + value + "%'";

            model = new DefaultTableModel(null, headers);
            pst = conn.prepareStatement(sSQL);
            rs = pst.executeQuery();

            while (rs.next()) {

                registers[0] = rs.getString("diagnosis_id");
                registers[1] = rs.getString("diagnosis_threatment");
                registers[2] = rs.getString("diagnosis_result");
                registers[3] = rs.getString("threatment_id");
                registers[4] = rs.getString("deleted_at");
                registers[5] = rs.getString("updated_at");
                
                model.addRow(registers);
            }

            return model;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return null;
        }
    }

    @Override
    public boolean add(DiagnosisData diagnosisData) {
        
        String deleted = "";
        try {

            sSQL = "INSERT INTO Diagnosis(diagnosis_id,diagnosis_threatment,diagnosis_result,threatment_id,deleted_at) values (?,?,?,?,?)";
            pst = conn.prepareStatement(sSQL);

            pst.setInt(1, diagnosisData.getDiagnosisId());
            pst.setInt(2, diagnosisData.getDiagnosisThreatment());
            pst.setString(3, diagnosisData.getDiagnosisResult());
            pst.setInt(4, diagnosisData.getThreatmentID());
            //pst.setDate(5, (Date) diagnosisData.getUpdateAt());
            pst.setString(5, deleted);
           
            pst.execute();
            return true;

        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);

            return false;
        }
    }

    @Override
    public boolean update(DiagnosisData diagnosisData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(DiagnosisData diagnosisData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
