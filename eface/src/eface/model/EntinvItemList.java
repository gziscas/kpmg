package eface.model;

public class EntinvItemList {
    private String entName;

    private String regNo;

    private String entType;

    private String regCap;

    private String regCapcur;

    private String canDate;

    private String revDate;

    private String entStatus;

    private String regOrg;

    private String subConam;

    private String currency;

    private String fundedRatio;

    private String esDate;

    private String name;

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo == null ? null : regNo.trim();
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType == null ? null : entType.trim();
    }

    public String getRegCap() {
        return regCap;
    }

    public void setRegCap(String regCap) {
        this.regCap = regCap == null ? null : regCap.trim();
    }

    public String getRegCapcur() {
        return regCapcur;
    }

    public void setRegCapcur(String regCapcur) {
        this.regCapcur = regCapcur == null ? null : regCapcur.trim();
    }

    public String getCanDate() {
        return canDate;
    }

    public void setCanDate(String canDate) {
        this.canDate = canDate == null ? null : canDate.trim();
    }

    public String getRevDate() {
        return revDate;
    }

    public void setRevDate(String revDate) {
        this.revDate = revDate == null ? null : revDate.trim();
    }

    public String getEntStatus() {
        return entStatus;
    }

    public void setEntStatus(String entStatus) {
        this.entStatus = entStatus == null ? null : entStatus.trim();
    }

    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg == null ? null : regOrg.trim();
    }

    public String getSubConam() {
        return subConam;
    }

    public void setSubConam(String subConam) {
        this.subConam = subConam == null ? null : subConam.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFundedRatio() {
        return fundedRatio;
    }

    public void setFundedRatio(String fundedRatio) {
        this.fundedRatio = fundedRatio == null ? null : fundedRatio.trim();
    }

    public String getEsDate() {
        return esDate;
    }

    public void setEsDate(String esDate) {
        this.esDate = esDate == null ? null : esDate.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entName=").append(entName);
        sb.append(", regNo=").append(regNo);
        sb.append(", entType=").append(entType);
        sb.append(", regCap=").append(regCap);
        sb.append(", regCapcur=").append(regCapcur);
        sb.append(", canDate=").append(canDate);
        sb.append(", revDate=").append(revDate);
        sb.append(", entStatus=").append(entStatus);
        sb.append(", regOrg=").append(regOrg);
        sb.append(", subConam=").append(subConam);
        sb.append(", currency=").append(currency);
        sb.append(", fundedRatio=").append(fundedRatio);
        sb.append(", esDate=").append(esDate);
        sb.append(", name=").append(name);
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
        EntinvItemList other = (EntinvItemList) that;
        return (this.getEntName() == null ? other.getEntName() == null : this.getEntName().equals(other.getEntName()))
            && (this.getRegNo() == null ? other.getRegNo() == null : this.getRegNo().equals(other.getRegNo()))
            && (this.getEntType() == null ? other.getEntType() == null : this.getEntType().equals(other.getEntType()))
            && (this.getRegCap() == null ? other.getRegCap() == null : this.getRegCap().equals(other.getRegCap()))
            && (this.getRegCapcur() == null ? other.getRegCapcur() == null : this.getRegCapcur().equals(other.getRegCapcur()))
            && (this.getCanDate() == null ? other.getCanDate() == null : this.getCanDate().equals(other.getCanDate()))
            && (this.getRevDate() == null ? other.getRevDate() == null : this.getRevDate().equals(other.getRevDate()))
            && (this.getEntStatus() == null ? other.getEntStatus() == null : this.getEntStatus().equals(other.getEntStatus()))
            && (this.getRegOrg() == null ? other.getRegOrg() == null : this.getRegOrg().equals(other.getRegOrg()))
            && (this.getSubConam() == null ? other.getSubConam() == null : this.getSubConam().equals(other.getSubConam()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getFundedRatio() == null ? other.getFundedRatio() == null : this.getFundedRatio().equals(other.getFundedRatio()))
            && (this.getEsDate() == null ? other.getEsDate() == null : this.getEsDate().equals(other.getEsDate()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEntName() == null) ? 0 : getEntName().hashCode());
        result = prime * result + ((getRegNo() == null) ? 0 : getRegNo().hashCode());
        result = prime * result + ((getEntType() == null) ? 0 : getEntType().hashCode());
        result = prime * result + ((getRegCap() == null) ? 0 : getRegCap().hashCode());
        result = prime * result + ((getRegCapcur() == null) ? 0 : getRegCapcur().hashCode());
        result = prime * result + ((getCanDate() == null) ? 0 : getCanDate().hashCode());
        result = prime * result + ((getRevDate() == null) ? 0 : getRevDate().hashCode());
        result = prime * result + ((getEntStatus() == null) ? 0 : getEntStatus().hashCode());
        result = prime * result + ((getRegOrg() == null) ? 0 : getRegOrg().hashCode());
        result = prime * result + ((getSubConam() == null) ? 0 : getSubConam().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getFundedRatio() == null) ? 0 : getFundedRatio().hashCode());
        result = prime * result + ((getEsDate() == null) ? 0 : getEsDate().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}