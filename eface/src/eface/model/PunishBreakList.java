package eface.model;

public class PunishBreakList {
    private String caseCode;

    private String inameClean;

    private String type;

    private String sex;

    private String age;

    private String cardNo;

    private String idCardLocation;

    private String businessEntity;

    private String regDate;

    private String publishDate;

    private String courtName;

    private String province;

    private String gistID;

    private String gistUnit;

    private String duty;

    private String disruptTypeName;

    private String performance;

    private String performedPart;

    private String unperformPart;

    private String focusNumber;

    public String getCaseCode() {
        return caseCode;
    }

    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode == null ? null : caseCode.trim();
    }

    public String getInameClean() {
        return inameClean;
    }

    public void setInameClean(String inameClean) {
        this.inameClean = inameClean == null ? null : inameClean.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getIdCardLocation() {
        return idCardLocation;
    }

    public void setIdCardLocation(String idCardLocation) {
        this.idCardLocation = idCardLocation == null ? null : idCardLocation.trim();
    }

    public String getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(String businessEntity) {
        this.businessEntity = businessEntity == null ? null : businessEntity.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate == null ? null : publishDate.trim();
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName == null ? null : courtName.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getGistID() {
        return gistID;
    }

    public void setGistID(String gistID) {
        this.gistID = gistID == null ? null : gistID.trim();
    }

    public String getGistUnit() {
        return gistUnit;
    }

    public void setGistUnit(String gistUnit) {
        this.gistUnit = gistUnit == null ? null : gistUnit.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getDisruptTypeName() {
        return disruptTypeName;
    }

    public void setDisruptTypeName(String disruptTypeName) {
        this.disruptTypeName = disruptTypeName == null ? null : disruptTypeName.trim();
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance == null ? null : performance.trim();
    }

    public String getPerformedPart() {
        return performedPart;
    }

    public void setPerformedPart(String performedPart) {
        this.performedPart = performedPart == null ? null : performedPart.trim();
    }

    public String getUnperformPart() {
        return unperformPart;
    }

    public void setUnperformPart(String unperformPart) {
        this.unperformPart = unperformPart == null ? null : unperformPart.trim();
    }

    public String getFocusNumber() {
        return focusNumber;
    }

    public void setFocusNumber(String focusNumber) {
        this.focusNumber = focusNumber == null ? null : focusNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseCode=").append(caseCode);
        sb.append(", inameClean=").append(inameClean);
        sb.append(", type=").append(type);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", idCardLocation=").append(idCardLocation);
        sb.append(", businessEntity=").append(businessEntity);
        sb.append(", regDate=").append(regDate);
        sb.append(", publishDate=").append(publishDate);
        sb.append(", courtName=").append(courtName);
        sb.append(", province=").append(province);
        sb.append(", gistid=").append(gistID);
        sb.append(", gistUnit=").append(gistUnit);
        sb.append(", duty=").append(duty);
        sb.append(", disruptTypeName=").append(disruptTypeName);
        sb.append(", performance=").append(performance);
        sb.append(", performedPart=").append(performedPart);
        sb.append(", unperformPart=").append(unperformPart);
        sb.append(", focusNumber=").append(focusNumber);
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
        PunishBreakList other = (PunishBreakList) that;
        return (this.getCaseCode() == null ? other.getCaseCode() == null : this.getCaseCode().equals(other.getCaseCode()))
            && (this.getInameClean() == null ? other.getInameClean() == null : this.getInameClean().equals(other.getInameClean()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getIdCardLocation() == null ? other.getIdCardLocation() == null : this.getIdCardLocation().equals(other.getIdCardLocation()))
            && (this.getBusinessEntity() == null ? other.getBusinessEntity() == null : this.getBusinessEntity().equals(other.getBusinessEntity()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getPublishDate() == null ? other.getPublishDate() == null : this.getPublishDate().equals(other.getPublishDate()))
            && (this.getCourtName() == null ? other.getCourtName() == null : this.getCourtName().equals(other.getCourtName()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getGistID() == null ? other.getGistID() == null : this.getGistID().equals(other.getGistID()))
            && (this.getGistUnit() == null ? other.getGistUnit() == null : this.getGistUnit().equals(other.getGistUnit()))
            && (this.getDuty() == null ? other.getDuty() == null : this.getDuty().equals(other.getDuty()))
            && (this.getDisruptTypeName() == null ? other.getDisruptTypeName() == null : this.getDisruptTypeName().equals(other.getDisruptTypeName()))
            && (this.getPerformance() == null ? other.getPerformance() == null : this.getPerformance().equals(other.getPerformance()))
            && (this.getPerformedPart() == null ? other.getPerformedPart() == null : this.getPerformedPart().equals(other.getPerformedPart()))
            && (this.getUnperformPart() == null ? other.getUnperformPart() == null : this.getUnperformPart().equals(other.getUnperformPart()))
            && (this.getFocusNumber() == null ? other.getFocusNumber() == null : this.getFocusNumber().equals(other.getFocusNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseCode() == null) ? 0 : getCaseCode().hashCode());
        result = prime * result + ((getInameClean() == null) ? 0 : getInameClean().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getIdCardLocation() == null) ? 0 : getIdCardLocation().hashCode());
        result = prime * result + ((getBusinessEntity() == null) ? 0 : getBusinessEntity().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getPublishDate() == null) ? 0 : getPublishDate().hashCode());
        result = prime * result + ((getCourtName() == null) ? 0 : getCourtName().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getGistID() == null) ? 0 : getGistID().hashCode());
        result = prime * result + ((getGistUnit() == null) ? 0 : getGistUnit().hashCode());
        result = prime * result + ((getDuty() == null) ? 0 : getDuty().hashCode());
        result = prime * result + ((getDisruptTypeName() == null) ? 0 : getDisruptTypeName().hashCode());
        result = prime * result + ((getPerformance() == null) ? 0 : getPerformance().hashCode());
        result = prime * result + ((getPerformedPart() == null) ? 0 : getPerformedPart().hashCode());
        result = prime * result + ((getUnperformPart() == null) ? 0 : getUnperformPart().hashCode());
        result = prime * result + ((getFocusNumber() == null) ? 0 : getFocusNumber().hashCode());
        return result;
    }
}