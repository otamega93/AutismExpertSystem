package AESData;

import java.util.Date;

public class PatientData {
    
    private String patientName;
    private String patientAddress;
    private String patientPhoneNumber;
    private int patientId;
    private int diagnosisId;
    private Date updateAt;
    private Date deletedAt;

    public PatientData(String patientName, String patientAddress, String patientPhoneNumber, int patientId, int diagnosisId, Date updateAt, Date deletedAt) {
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientId = patientId;
        this.diagnosisId = diagnosisId;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
    }

    public PatientData() {
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

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
    
}
