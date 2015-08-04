package AESData;

import java.util.Date;


public class DiagnosisData {

    private int diagnosisId;
    private int diagnosisThreatment;
    private int threatmentID;
    private String diagnosisResult;
    private String deletedAt;
    private String updateAt;

    public DiagnosisData(int diagnosisId, int diagnosisThreatment, int threatmentID, String diagnosisResult, String deletedAt, String updateAt) {
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

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAT) {
        this.updateAt = updateAT;
    }
        
}
