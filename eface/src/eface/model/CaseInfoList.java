package eface.model;

public class CaseInfoList {
    private String caseTime;

    private String caseReason;

    private String caseType;

    private String exeSort;

    private String caseResult;

    private String pendecissDate;

    private String penAuth;

    private String illegFact;

    private String penBasis;

    private String penType;

    private String penResult;

    private String penAm;

    private String penExest;

    private String penContent;

    private String penDecNo;

    public String getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(String caseTime) {
        this.caseTime = caseTime == null ? null : caseTime.trim();
    }

    public String getCaseReason() {
        return caseReason;
    }

    public void setCaseReason(String caseReason) {
        this.caseReason = caseReason == null ? null : caseReason.trim();
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getExeSort() {
        return exeSort;
    }

    public void setExeSort(String exeSort) {
        this.exeSort = exeSort == null ? null : exeSort.trim();
    }

    public String getCaseResult() {
        return caseResult;
    }

    public void setCaseResult(String caseResult) {
        this.caseResult = caseResult == null ? null : caseResult.trim();
    }

    public String getPendecissDate() {
        return pendecissDate;
    }

    public void setPendecissDate(String pendecissDate) {
        this.pendecissDate = pendecissDate == null ? null : pendecissDate.trim();
    }

    public String getPenAuth() {
        return penAuth;
    }

    public void setPenAuth(String penAuth) {
        this.penAuth = penAuth == null ? null : penAuth.trim();
    }

    public String getIllegFact() {
        return illegFact;
    }

    public void setIllegFact(String illegFact) {
        this.illegFact = illegFact == null ? null : illegFact.trim();
    }

    public String getPenBasis() {
        return penBasis;
    }

    public void setPenBasis(String penBasis) {
        this.penBasis = penBasis == null ? null : penBasis.trim();
    }

    public String getPenType() {
        return penType;
    }

    public void setPenType(String penType) {
        this.penType = penType == null ? null : penType.trim();
    }

    public String getPenResult() {
        return penResult;
    }

    public void setPenResult(String penResult) {
        this.penResult = penResult == null ? null : penResult.trim();
    }

    public String getPenAm() {
        return penAm;
    }

    public void setPenAm(String penAm) {
        this.penAm = penAm == null ? null : penAm.trim();
    }

    public String getPenExest() {
        return penExest;
    }

    public void setPenExest(String penExest) {
        this.penExest = penExest == null ? null : penExest.trim();
    }

    public String getPenContent() {
        return penContent;
    }

    public void setPenContent(String penContent) {
        this.penContent = penContent == null ? null : penContent.trim();
    }

    public String getPenDecNo() {
        return penDecNo;
    }

    public void setPenDecNo(String penDecNo) {
        this.penDecNo = penDecNo == null ? null : penDecNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseTime=").append(caseTime);
        sb.append(", caseReason=").append(caseReason);
        sb.append(", caseType=").append(caseType);
        sb.append(", exeSort=").append(exeSort);
        sb.append(", caseResult=").append(caseResult);
        sb.append(", pendecissDate=").append(pendecissDate);
        sb.append(", penAuth=").append(penAuth);
        sb.append(", illegFact=").append(illegFact);
        sb.append(", penBasis=").append(penBasis);
        sb.append(", penType=").append(penType);
        sb.append(", penResult=").append(penResult);
        sb.append(", penAm=").append(penAm);
        sb.append(", penExest=").append(penExest);
        sb.append(", penContent=").append(penContent);
        sb.append(", penDecNo=").append(penDecNo);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CaseInfoList other = (CaseInfoList) that;
        return (this.getCaseTime() == null ? other.getCaseTime() == null : this.getCaseTime().equals(other.getCaseTime()))
            && (this.getCaseReason() == null ? other.getCaseReason() == null : this.getCaseReason().equals(other.getCaseReason()))
            && (this.getCaseType() == null ? other.getCaseType() == null : this.getCaseType().equals(other.getCaseType()))
            && (this.getExeSort() == null ? other.getExeSort() == null : this.getExeSort().equals(other.getExeSort()))
            && (this.getCaseResult() == null ? other.getCaseResult() == null : this.getCaseResult().equals(other.getCaseResult()))
            && (this.getPendecissDate() == null ? other.getPendecissDate() == null : this.getPendecissDate().equals(other.getPendecissDate()))
            && (this.getPenAuth() == null ? other.getPenAuth() == null : this.getPenAuth().equals(other.getPenAuth()))
            && (this.getIllegFact() == null ? other.getIllegFact() == null : this.getIllegFact().equals(other.getIllegFact()))
            && (this.getPenBasis() == null ? other.getPenBasis() == null : this.getPenBasis().equals(other.getPenBasis()))
            && (this.getPenType() == null ? other.getPenType() == null : this.getPenType().equals(other.getPenType()))
            && (this.getPenResult() == null ? other.getPenResult() == null : this.getPenResult().equals(other.getPenResult()))
            && (this.getPenAm() == null ? other.getPenAm() == null : this.getPenAm().equals(other.getPenAm()))
            && (this.getPenExest() == null ? other.getPenExest() == null : this.getPenExest().equals(other.getPenExest()))
            && (this.getPenContent() == null ? other.getPenContent() == null : this.getPenContent().equals(other.getPenContent()))
            && (this.getPenDecNo() == null ? other.getPenDecNo() == null : this.getPenDecNo().equals(other.getPenDecNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseTime() == null) ? 0 : getCaseTime().hashCode());
        result = prime * result + ((getCaseReason() == null) ? 0 : getCaseReason().hashCode());
        result = prime * result + ((getCaseType() == null) ? 0 : getCaseType().hashCode());
        result = prime * result + ((getExeSort() == null) ? 0 : getExeSort().hashCode());
        result = prime * result + ((getCaseResult() == null) ? 0 : getCaseResult().hashCode());
        result = prime * result + ((getPendecissDate() == null) ? 0 : getPendecissDate().hashCode());
        result = prime * result + ((getPenAuth() == null) ? 0 : getPenAuth().hashCode());
        result = prime * result + ((getIllegFact() == null) ? 0 : getIllegFact().hashCode());
        result = prime * result + ((getPenBasis() == null) ? 0 : getPenBasis().hashCode());
        result = prime * result + ((getPenType() == null) ? 0 : getPenType().hashCode());
        result = prime * result + ((getPenResult() == null) ? 0 : getPenResult().hashCode());
        result = prime * result + ((getPenAm() == null) ? 0 : getPenAm().hashCode());
        result = prime * result + ((getPenExest() == null) ? 0 : getPenExest().hashCode());
        result = prime * result + ((getPenContent() == null) ? 0 : getPenContent().hashCode());
        result = prime * result + ((getPenDecNo() == null) ? 0 : getPenDecNo().hashCode());
        return result;
    }
}