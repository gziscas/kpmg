package eface.model;

public class PunishedList {
    private String caseCode;

    private String inameClean;

    private String cardNo;

    private String sex;

    private String age;

    private String province;

    private String idCardLocation;

    private String regDate;

    private String courtName;

    private String regDateClean;

    private String caseState;

    private String execMoney;

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getIdCardLocation() {
        return idCardLocation;
    }

    public void setIdCardLocation(String idCardLocation) {
        this.idCardLocation = idCardLocation == null ? null : idCardLocation.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName == null ? null : courtName.trim();
    }

    public String getRegDateClean() {
        return regDateClean;
    }

    public void setRegDateClean(String regDateClean) {
        this.regDateClean = regDateClean == null ? null : regDateClean.trim();
    }

    public String getCaseState() {
        return caseState;
    }

    public void setCaseState(String caseState) {
        this.caseState = caseState == null ? null : caseState.trim();
    }

    public String getExecMoney() {
        return execMoney;
    }

    public void setExecMoney(String execMoney) {
        this.execMoney = execMoney == null ? null : execMoney.trim();
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
        sb.append(", cardNo=").append(cardNo);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", province=").append(province);
        sb.append(", idCardLocation=").append(idCardLocation);
        sb.append(", regDate=").append(regDate);
        sb.append(", courtName=").append(courtName);
        sb.append(", regDateClean=").append(regDateClean);
        sb.append(", caseState=").append(caseState);
        sb.append(", execMoney=").append(execMoney);
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
        PunishedList other = (PunishedList) that;
        return (this.getCaseCode() == null ? other.getCaseCode() == null : this.getCaseCode().equals(other.getCaseCode()))
            && (this.getInameClean() == null ? other.getInameClean() == null : this.getInameClean().equals(other.getInameClean()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getIdCardLocation() == null ? other.getIdCardLocation() == null : this.getIdCardLocation().equals(other.getIdCardLocation()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getCourtName() == null ? other.getCourtName() == null : this.getCourtName().equals(other.getCourtName()))
            && (this.getRegDateClean() == null ? other.getRegDateClean() == null : this.getRegDateClean().equals(other.getRegDateClean()))
            && (this.getCaseState() == null ? other.getCaseState() == null : this.getCaseState().equals(other.getCaseState()))
            && (this.getExecMoney() == null ? other.getExecMoney() == null : this.getExecMoney().equals(other.getExecMoney()))
            && (this.getFocusNumber() == null ? other.getFocusNumber() == null : this.getFocusNumber().equals(other.getFocusNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseCode() == null) ? 0 : getCaseCode().hashCode());
        result = prime * result + ((getInameClean() == null) ? 0 : getInameClean().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getIdCardLocation() == null) ? 0 : getIdCardLocation().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getCourtName() == null) ? 0 : getCourtName().hashCode());
        result = prime * result + ((getRegDateClean() == null) ? 0 : getRegDateClean().hashCode());
        result = prime * result + ((getCaseState() == null) ? 0 : getCaseState().hashCode());
        result = prime * result + ((getExecMoney() == null) ? 0 : getExecMoney().hashCode());
        result = prime * result + ((getFocusNumber() == null) ? 0 : getFocusNumber().hashCode());
        return result;
    }
}