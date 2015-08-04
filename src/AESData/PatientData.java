package AESData;

public class PatientData {
    
    private String patientName;
    private String patientAddress;
    private String patientPhoneNumber;
    private String updateAt;
    private String deletedAt;
    private int patientId;
    private int historialNumber;
    private int diagnosisId;    

    public PatientData(String patientName, String patientAddress, String patientPhoneNumber, int patientId, int historialNumber,int diagnosisId, String updateAt, String deletedAt) {
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientId = patientId;
        this.diagnosisId = diagnosisId;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
        this.historialNumber = historialNumber;
    }

    public PatientData() {
    }

    public int getHistorialNumber() {
        return historialNumber;
    }

    public void setHistorialNumber(int historialNumber) {
        this.historialNumber = historialNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(int diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }
    
}
