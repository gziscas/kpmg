package eface.model;

public class BasicList {
    private String enterpriseName;

    private String frName;

    private String creditCode;

    private String regNo;

    private String regCap;

    private String regCapCur;

    private String esDate;

    private String openFrom;

    private String openTo;

    private String enterpriseType;

    private String enterpriseStatus;

    private String cancelDate;

    private String revokeDate;

    private String address;

    private String abultem;

    private String cbultem;

    private String operateScope;

    private String operateScopeAndForm;

    private String regOrg;

    private String ancheYear;

    private String ancheDate;

    private String industryPhyCode;

    private String industryPhyName;

    private String industryCode;

    private String industryName;

    private String recCap;

    private String oriRegNo;

    private String apprDate;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getFrName() {
        return frName;
    }

    public void setFrName(String frName) {
        this.frName = frName == null ? null : frName.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getRegCap() {
        return regCap;
    }

    public void setRegCap(String regCap) {
        this.regCap = regCap == null ? null : regCap.trim();
    }

    public String getRegCapCur() {
        return regCapCur;
    }

    public void setRegCapCur(String regCapCur) {
        this.regCapCur = regCapCur == null ? null : regCapCur.trim();
    }

    public String getEsDate() {
        return esDate;
    }

    public void setEsDate(String esDate) {
        this.esDate = esDate == null ? null : esDate.trim();
    }

    public String getOpenFrom() {
        return openFrom;
    }

    public void setOpenFrom(String openFrom) {
        this.openFrom = openFrom == null ? null : openFrom.trim();
    }

    public String getOpenTo() {
        return openTo;
    }

    public void setOpenTo(String openTo) {
        this.openTo = openTo == null ? null : openTo.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getEnterpriseStatus() {
        return enterpriseStatus;
    }

    public void setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus == null ? null : enterpriseStatus.trim();
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate == null ? null : cancelDate.trim();
    }

    public String getRevokeDate() {
        return revokeDate;
    }

    public void setRevokeDate(String revokeDate) {
        this.revokeDate = revokeDate == null ? null : revokeDate.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAbultem() {
        return abultem;
    }

    public void setAbultem(String abultem) {
        this.abultem = abultem == null ? null : abultem.trim();
    }

    public String getCbultem() {
        return cbultem;
    }

    public void setCbultem(String cbultem) {
        this.cbultem = cbultem == null ? null : cbultem.trim();
    }

    public String getOperateScope() {
        return operateScope;
    }

    public void setOperateScope(String operateScope) {
        this.operateScope = operateScope == null ? null : operateScope.trim();
    }

    public String getOperateScopeAndForm() {
        return operateScopeAndForm;
    }

    public void setOperateScopeAndForm(String operateScopeAndForm) {
        this.operateScopeAndForm = operateScopeAndForm == null ? null : operateScopeAndForm.trim();
    }

    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg == null ? null : regOrg.trim();
    }

    public String getAncheYear() {
        return ancheYear;
    }

    public void setAncheYear(String ancheYear) {
        this.ancheYear = ancheYear == null ? null : ancheYear.trim();
    }

    public String getAncheDate() {
        return ancheDate;
    }

    public void setAncheDate(String ancheDate) {
        this.ancheDate = ancheDate == null ? null : ancheDate.trim();
    }

    public String getIndustryPhyCode() {
        return industryPhyCode;
    }

    public void setIndustryPhyCode(String industryPhyCode) {
        this.industryPhyCode = industryPhyCode == null ? null : industryPhyCode.trim();
    }

    public String getIndustryPhyName() {
        return industryPhyName;
    }

    public void setIndustryPhyName(String industryPhyName) {
        this.industryPhyName = industryPhyName == null ? null : industryPhyName.trim();
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode == null ? null : industryCode.trim();
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public String getRecCap() {
        return recCap;
    }

    public void setRecCap(String recCap) {
        this.recCap = recCap == null ? null : recCap.trim();
    }

    public String getOriRegNo() {
        return oriRegNo;
    }

    public void setOriRegNo(String oriRegNo) {
        this.oriRegNo = oriRegNo == null ? null : oriRegNo.trim();
    }

    public String getApprDate() {
        return apprDate;
    }

    public void setApprDate(String apprDate) {
        this.apprDate = apprDate == null ? null : apprDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", frName=").append(frName);
        sb.append(", creditCode=").append(creditCode);
        sb.append(", regNo=").append(regNo);
        sb.append(", regCap=").append(regCap);
        sb.append(", regCapCur=").append(regCapCur);
        sb.append(", esDate=").append(esDate);
        sb.append(", openFrom=").append(openFrom);
        sb.append(", openTo=").append(openTo);
        sb.append(", enterpriseType=").append(enterpriseType);
        sb.append(", enterpriseStatus=").append(enterpriseStatus);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", revokeDate=").append(revokeDate);
        sb.append(", address=").append(address);
        sb.append(", abultem=").append(abultem);
        sb.append(", cbultem=").append(cbultem);
        sb.append(", operateScope=").append(operateScope);
        sb.append(", operateScopeAndForm=").append(operateScopeAndForm);
        sb.append(", regOrg=").append(regOrg);
        sb.append(", ancheYear=").append(ancheYear);
        sb.append(", ancheDate=").append(ancheDate);
        sb.append(", industryPhyCode=").append(industryPhyCode);
        sb.append(", industryPhyName=").append(industryPhyName);
        sb.append(", industryCode=").append(industryCode);
        sb.append(", industryName=").append(industryName);
        sb.append(", recCap=").append(recCap);
        sb.append(", oriRegNo=").append(oriRegNo);
        sb.append(", apprDate=").append(apprDate);
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
        BasicList other = (BasicList) that;
        return (this.getEnterpriseName() == null ? other.getEnterpriseName() == null : this.getEnterpriseName().equals(other.getEnterpriseName()))
            && (this.getFrName() == null ? other.getFrName() == null : this.getFrName().equals(other.getFrName()))
            && (this.getCreditCode() == null ? other.getCreditCode() == null : this.getCreditCode().equals(other.getCreditCode()))
            && (this.getRegNo() == null ? other.getRegNo() == null : this.getRegNo().equals(other.getRegNo()))
            && (this.getRegCap() == null ? other.getRegCap() == null : this.getRegCap().equals(other.getRegCap()))
            && (this.getRegCapCur() == null ? other.getRegCapCur() == null : this.getRegCapCur().equals(other.getRegCapCur()))
            && (this.getEsDate() == null ? other.getEsDate() == null : this.getEsDate().equals(other.getEsDate()))
            && (this.getOpenFrom() == null ? other.getOpenFrom() == null : this.getOpenFrom().equals(other.getOpenFrom()))
            && (this.getOpenTo() == null ? other.getOpenTo() == null : this.getOpenTo().equals(other.getOpenTo()))
            && (this.getEnterpriseType() == null ? other.getEnterpriseType() == null : this.getEnterpriseType().equals(other.getEnterpriseType()))
            && (this.getEnterpriseStatus() == null ? other.getEnterpriseStatus() == null : this.getEnterpriseStatus().equals(other.getEnterpriseStatus()))
            && (this.getCancelDate() == null ? other.getCancelDate() == null : this.getCancelDate().equals(other.getCancelDate()))
            && (this.getRevokeDate() == null ? other.getRevokeDate() == null : this.getRevokeDate().equals(other.getRevokeDate()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAbultem() == null ? other.getAbultem() == null : this.getAbultem().equals(other.getAbultem()))
            && (this.getCbultem() == null ? other.getCbultem() == null : this.getCbultem().equals(other.getCbultem()))
            && (this.getOperateScope() == null ? other.getOperateScope() == null : this.getOperateScope().equals(other.getOperateScope()))
            && (this.getOperateScopeAndForm() == null ? other.getOperateScopeAndForm() == null : this.getOperateScopeAndForm().equals(other.getOperateScopeAndForm()))
            && (this.getRegOrg() == null ? other.getRegOrg() == null : this.getRegOrg().equals(other.getRegOrg()))
            && (this.getAncheYear() == null ? other.getAncheYear() == null : this.getAncheYear().equals(other.getAncheYear()))
            && (this.getAncheDate() == null ? other.getAncheDate() == null : this.getAncheDate().equals(other.getAncheDate()))
            && (this.getIndustryPhyCode() == null ? other.getIndustryPhyCode() == null : this.getIndustryPhyCode().equals(other.getIndustryPhyCode()))
            && (this.getIndustryPhyName() == null ? other.getIndustryPhyName() == null : this.getIndustryPhyName().equals(other.getIndustryPhyName()))
            && (this.getIndustryCode() == null ? other.getIndustryCode() == null : this.getIndustryCode().equals(other.getIndustryCode()))
            && (this.getIndustryName() == null ? other.getIndustryName() == null : this.getIndustryName().equals(other.getIndustryName()))
            && (this.getRecCap() == null ? other.getRecCap() == null : this.getRecCap().equals(other.getRecCap()))
            && (this.getOriRegNo() == null ? other.getOriRegNo() == null : this.getOriRegNo().equals(other.getOriRegNo()))
            && (this.getApprDate() == null ? other.getApprDate() == null : this.getApprDate().equals(other.getApprDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEnterpriseName() == null) ? 0 : getEnterpriseName().hashCode());
        result = prime * result + ((getFrName() == null) ? 0 : getFrName().hashCode());
        result = prime * result + ((getCreditCode() == null) ? 0 : getCreditCode().hashCode());
        result = prime * result + ((getRegNo() == null) ? 0 : getRegNo().hashCode());
        result = prime * result + ((getRegCap() == null) ? 0 : getRegCap().hashCode());
        result = prime * result + ((getRegCapCur() == null) ? 0 : getRegCapCur().hashCode());
        result = prime * result + ((getEsDate() == null) ? 0 : getEsDate().hashCode());
        result = prime * result + ((getOpenFrom() == null) ? 0 : getOpenFrom().hashCode());
        result = prime * result + ((getOpenTo() == null) ? 0 : getOpenTo().hashCode());
        result = prime * result + ((getEnterpriseType() == null) ? 0 : getEnterpriseType().hashCode());
        result = prime * result + ((getEnterpriseStatus() == null) ? 0 : getEnterpriseStatus().hashCode());
        result = prime * result + ((getCancelDate() == null) ? 0 : getCancelDate().hashCode());
        result = prime * result + ((getRevokeDate() == null) ? 0 : getRevokeDate().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAbultem() == null) ? 0 : getAbultem().hashCode());
        result = prime * result + ((getCbultem() == null) ? 0 : getCbultem().hashCode());
        result = prime * result + ((getOperateScope() == null) ? 0 : getOperateScope().hashCode());
        result = prime * result + ((getOperateScopeAndForm() == null) ? 0 : getOperateScopeAndForm().hashCode());
        result = prime * result + ((getRegOrg() == null) ? 0 : getRegOrg().hashCode());
        result = prime * result + ((getAncheYear() == null) ? 0 : getAncheYear().hashCode());
        result = prime * result + ((getAncheDate() == null) ? 0 : getAncheDate().hashCode());
        result = prime * result + ((getIndustryPhyCode() == null) ? 0 : getIndustryPhyCode().hashCode());
        result = prime * result + ((getIndustryPhyName() == null) ? 0 : getIndustryPhyName().hashCode());
        result = prime * result + ((getIndustryCode() == null) ? 0 : getIndustryCode().hashCode());
        result = prime * result + ((getIndustryName() == null) ? 0 : getIndustryName().hashCode());
        result = prime * result + ((getRecCap() == null) ? 0 : getRecCap().hashCode());
        result = prime * result + ((getOriRegNo() == null) ? 0 : getOriRegNo().hashCode());
        result = prime * result + ((getApprDate() == null) ? 0 : getApprDate().hashCode());
        return result;
    }
}