package AESData;

import java.util.Date;


public class ResultData {
    
    private int threatmentId;
    private int diagnosisId;
    private String threatmentDescription;
    private Date deletedAt;
    private Date updateAt;

    public ResultData(int threatmentId, int diagnosisId, String threatmentDescription, Date deletedAt, Date updateAt) {
        this.threatmentId = threatmentId;
        this.diagnosisId = diagnosisId;
        this.threatmentDescription = threatmentDescription;
        this.deletedAt = deletedAt;
        this.updateAt = updateAt;
    }

    public ResultData() {
    }

    public int getThreatmentId() {
        return threatmentId;
    }

    public void setThreatmentId(int threatmentId) {
        this.threatmentId = threatmentId;
    }

    public int getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(int diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public String getThreatmentDescription() {
        return threatmentDescription;
    }

    public void setThreatmentDescription(String threatmentDescription) {
        this.threatmentDescription = threatmentDescription;
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

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
    
}
