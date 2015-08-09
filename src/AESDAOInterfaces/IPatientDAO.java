package AESDAOInterfaces;

import AESData.PatientData;
import javax.swing.table.DefaultTableModel;


public interface IPatientDAO {
    
    public DefaultTableModel dataLoad(String value);
    
    public boolean add(PatientData patientData);
    
    public boolean update(PatientData patientData);
    
    public boolean delete(PatientData patientData);
    
    public boolean addFromDiagnosis(PatientData patientData);

}
