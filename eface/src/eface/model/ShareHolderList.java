package eface.model;

public class ShareHolderList {
    private String shareholderName;

    private String subConam;

    private String regCapCur;

    private String conDate;

    private String fundedRatio;

    private String country;

    public String getShareholderName() {
        return shareholderName;
    }

    public void setShareholderName(String shareholderName) {
        this.shareholderName = shareholderName == null ? null : shareholderName.trim();
    }

    public String getSubConam() {
        return subConam;
    }

    public void setSubConam(String subConam) {
        this.subConam = subConam == null ? null : subConam.trim();
    }

    public String getRegCapCur() {
        return regCapCur;
    }

    public void setRegCapCur(String regCapCur) {
        this.regCapCur = regCapCur == null ? null : regCapCur.trim();
    }

    public String getConDate() {
        return conDate;
    }

    public void setConDate(String conDate) {
        this.conDate = conDate == null ? null : conDate.trim();
    }

    public String getFundedRatio() {
        return fundedRatio;
    }

    public void setFundedRatio(String fundedRatio) {
        this.fundedRatio = fundedRatio == null ? null : fundedRatio.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shareholderName=").append(shareholderName);
        sb.append(", subConam=").append(subConam);
        sb.append(", regCapCur=").append(regCapCur);
        sb.append(", conDate=").append(conDate);
        sb.append(", fundedRatio=").append(fundedRatio);
        sb.append(", country=").append(country);
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
        ShareHolderList other = (ShareHolderList) that;
        return (this.getShareholderName() == null ? other.getShareholderName() == null : this.getShareholderName().equals(other.getShareholderName()))
            && (this.getSubConam() == null ? other.getSubConam() == null : this.getSubConam().equals(other.getSubConam()))
            && (this.getRegCapCur() == null ? other.getRegCapCur() == null : this.getRegCapCur().equals(other.getRegCapCur()))
            && (this.getConDate() == null ? other.getConDate() == null : this.getConDate().equals(other.getConDate()))
            && (this.getFundedRatio() == null ? other.getFundedRatio() == null : this.getFundedRatio().equals(other.getFundedRatio()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShareholderName() == null) ? 0 : getShareholderName().hashCode());
        result = prime * result + ((getSubConam() == null) ? 0 : getSubConam().hashCode());
        result = prime * result + ((getRegCapCur() == null) ? 0 : getRegCapCur().hashCode());
        result = prime * result + ((getConDate() == null) ? 0 : getConDate().hashCode());
        result = prime * result + ((getFundedRatio() == null) ? 0 : getFundedRatio().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return result;
    }
}