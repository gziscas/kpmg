package eface.model;

public class LiquidationList {
    private String ligentity;

    private String ligprincipal;

    private String liqMen;

    private String liGst;

    private String ligEndDate;

    private String debtTranee;

    private String claimTranee;

    public String getLigentity() {
        return ligentity;
    }

    public void setLigentity(String ligentity) {
        this.ligentity = ligentity == null ? null : ligentity.trim();
    }

    public String getLigprincipal() {
        return ligprincipal;
    }

    public void setLigprincipal(String ligprincipal) {
        this.ligprincipal = ligprincipal == null ? null : ligprincipal.trim();
    }

    public String getLiqMen() {
        return liqMen;
    }

    public void setLiqMen(String liqMen) {
        this.liqMen = liqMen == null ? null : liqMen.trim();
    }

    public String getLiGst() {
        return liGst;
    }

    public void setLiGst(String liGst) {
        this.liGst = liGst == null ? null : liGst.trim();
    }

    public String getLigEndDate() {
        return ligEndDate;
    }

    public void setLigEndDate(String ligEndDate) {
        this.ligEndDate = ligEndDate == null ? null : ligEndDate.trim();
    }

    public String getDebtTranee() {
        return debtTranee;
    }

    public void setDebtTranee(String debtTranee) {
        this.debtTranee = debtTranee == null ? null : debtTranee.trim();
    }

    public String getClaimTranee() {
        return claimTranee;
    }

    public void setClaimTranee(String claimTranee) {
        this.claimTranee = claimTranee == null ? null : claimTranee.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ligentity=").append(ligentity);
        sb.append(", ligprincipal=").append(ligprincipal);
        sb.append(", liqMen=").append(liqMen);
        sb.append(", liGst=").append(liGst);
        sb.append(", ligEndDate=").append(ligEndDate);
        sb.append(", debtTranee=").append(debtTranee);
        sb.append(", claimTranee=").append(claimTranee);
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
        LiquidationList other = (LiquidationList) that;
        return (this.getLigentity() == null ? other.getLigentity() == null : this.getLigentity().equals(other.getLigentity()))
            && (this.getLigprincipal() == null ? other.getLigprincipal() == null : this.getLigprincipal().equals(other.getLigprincipal()))
            && (this.getLiqMen() == null ? other.getLiqMen() == null : this.getLiqMen().equals(other.getLiqMen()))
            && (this.getLiGst() == null ? other.getLiGst() == null : this.getLiGst().equals(other.getLiGst()))
            && (this.getLigEndDate() == null ? other.getLigEndDate() == null : this.getLigEndDate().equals(other.getLigEndDate()))
            && (this.getDebtTranee() == null ? other.getDebtTranee() == null : this.getDebtTranee().equals(other.getDebtTranee()))
            && (this.getClaimTranee() == null ? other.getClaimTranee() == null : this.getClaimTranee().equals(other.getClaimTranee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLigentity() == null) ? 0 : getLigentity().hashCode());
        result = prime * result + ((getLigprincipal() == null) ? 0 : getLigprincipal().hashCode());
        result = prime * result + ((getLiqMen() == null) ? 0 : getLiqMen().hashCode());
        result = prime * result + ((getLiGst() == null) ? 0 : getLiGst().hashCode());
        result = prime * result + ((getLigEndDate() == null) ? 0 : getLigEndDate().hashCode());
        result = prime * result + ((getDebtTranee() == null) ? 0 : getDebtTranee().hashCode());
        result = prime * result + ((getClaimTranee() == null) ? 0 : getClaimTranee().hashCode());
        return result;
    }
}