package AESDAOInterfaces;

import AESData.PatientData;
import javax.swing.table.DefaultTableModel;


public interface IDiagnosisDAO {

    public DefaultTableModel showDiagnosis (String value);
    
    public boolean add (PatientData patientData);
    
}
