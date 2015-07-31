package AESData;

import java.util.Date;


public class DiagnosisData {

    private int diagnosisId;
    private int diagnosisThreatment;
    private int threatmentID;
    private String diagnosisResult;
    private Date deletedAt;
    private Date updateAt;

    public DiagnosisData(int diagnosisId, int diagnosisThreatment, int threatmentID, String diagnosisResult, Date deletedAt, Date updateAt) {
        this.diagnosisId = diagnosisId;
        this.diagnosisThreatment = diagnosisThreatment;
        this.threatmentID = threatmentID;
        this.diagnosisResult = diagnosisResult;
        this.deletedAt = deletedAt;
        this.updateAt = updateAt;
    }

    public DiagnosisData() {
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(int diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public int getDiagnosisThreatment() {
        return diagnosisThreatment;
    }

    public void setDiagnosisThreatment(int diagnosisThreatment) {
        this.diagnosisThreatment = diagnosisThreatment;
    }

    public int getThreatmentID() {
        return threatmentID;
    }

    public void setThreatmentID(int threatmentID) {
        this.threatmentID = threatmentID;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAT) {
        this.updateAt = updateAT;
    }
        
}
