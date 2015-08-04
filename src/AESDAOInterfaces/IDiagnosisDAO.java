package AESDAOInterfaces;

import AESData.DiagnosisData;
import javax.swing.table.DefaultTableModel;

public interface IDiagnosisDAO {

    public DefaultTableModel showDiagnosis (String value);
    
    public boolean add (DiagnosisData diagnosisData);
    
    public boolean update(DiagnosisData diagnosisData);
    
    public boolean delete(DiagnosisData diagnosisData);
}
