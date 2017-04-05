package eface.model;

public class SharesImpawnList {
    private String impoRg;

    private String impoRgtype;

    private String impAm;

    private String imponrecDate;

    private String impExaeep;

    private String impSanDate;

    private String impTo;

    public String getImpoRg() {
        return impoRg;
    }

    public void setImpoRg(String impoRg) {
        this.impoRg = impoRg == null ? null : impoRg.trim();
    }

    public String getImpoRgtype() {
        return impoRgtype;
    }

    public void setImpoRgtype(String impoRgtype) {
        this.impoRgtype = impoRgtype == null ? null : impoRgtype.trim();
    }

    public String getImpAm() {
        return impAm;
    }

    public void setImpAm(String impAm) {
        this.impAm = impAm == null ? null : impAm.trim();
    }

    public String getImponrecDate() {
        return imponrecDate;
    }

    public void setImponrecDate(String imponrecDate) {
        this.imponrecDate = imponrecDate == null ? null : imponrecDate.trim();
    }

    public String getImpExaeep() {
        return impExaeep;
    }

    public void setImpExaeep(String impExaeep) {
        this.impExaeep = impExaeep == null ? null : impExaeep.trim();
    }

    public String getImpSanDate() {
        return impSanDate;
    }

    public void setImpSanDate(String impSanDate) {
        this.impSanDate = impSanDate == null ? null : impSanDate.trim();
    }

    public String getImpTo() {
        return impTo;
    }

    public void setImpTo(String impTo) {
        this.impTo = impTo == null ? null : impTo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", impoRg=").append(impoRg);
        sb.append(", impoRgtype=").append(impoRgtype);
        sb.append(", impAm=").append(impAm);
        sb.append(", imponrecDate=").append(imponrecDate);
        sb.append(", impExaeep=").append(impExaeep);
        sb.append(", impSanDate=").append(impSanDate);
        sb.append(", impTo=").append(impTo);
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
        SharesImpawnList other = (SharesImpawnList) that;
        return (this.getImpoRg() == null ? other.getImpoRg() == null : this.getImpoRg().equals(other.getImpoRg()))
            && (this.getImpoRgtype() == null ? other.getImpoRgtype() == null : this.getImpoRgtype().equals(other.getImpoRgtype()))
            && (this.getImpAm() == null ? other.getImpAm() == null : this.getImpAm().equals(other.getImpAm()))
            && (this.getImponrecDate() == null ? other.getImponrecDate() == null : this.getImponrecDate().equals(other.getImponrecDate()))
            && (this.getImpExaeep() == null ? other.getImpExaeep() == null : this.getImpExaeep().equals(other.getImpExaeep()))
            && (this.getImpSanDate() == null ? other.getImpSanDate() == null : this.getImpSanDate().equals(other.getImpSanDate()))
            && (this.getImpTo() == null ? other.getImpTo() == null : this.getImpTo().equals(other.getImpTo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getImpoRg() == null) ? 0 : getImpoRg().hashCode());
        result = prime * result + ((getImpoRgtype() == null) ? 0 : getImpoRgtype().hashCode());
        result = prime * result + ((getImpAm() == null) ? 0 : getImpAm().hashCode());
        result = prime * result + ((getImponrecDate() == null) ? 0 : getImponrecDate().hashCode());
        result = prime * result + ((getImpExaeep() == null) ? 0 : getImpExaeep().hashCode());
        result = prime * result + ((getImpSanDate() == null) ? 0 : getImpSanDate().hashCode());
        result = prime * result + ((getImpTo() == null) ? 0 : getImpTo().hashCode());
        return result;
    }
}