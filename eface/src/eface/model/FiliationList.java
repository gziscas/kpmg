package eface.model;

public class FiliationList {
    private String brName;

    private String brRegno;

    private String brPrincipal;

    private String cbuItem;

    private String brAddr;

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName == null ? null : brName.trim();
    }

    public String getBrRegno() {
        return brRegno;
    }

    public void setBrRegno(String brRegno) {
        this.brRegno = brRegno == null ? null : brRegno.trim();
    }

    public String getBrPrincipal() {
        return brPrincipal;
    }

    public void setBrPrincipal(String brPrincipal) {
        this.brPrincipal = brPrincipal == null ? null : brPrincipal.trim();
    }

    public String getCbuItem() {
        return cbuItem;
    }

    public void setCbuItem(String cbuItem) {
        this.cbuItem = cbuItem == null ? null : cbuItem.trim();
    }

    public String getBrAddr() {
        return brAddr;
    }

    public void setBrAddr(String brAddr) {
        this.brAddr = brAddr == null ? null : brAddr.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", brName=").append(brName);
        sb.append(", brRegno=").append(brRegno);
        sb.append(", brPrincipal=").append(brPrincipal);
        sb.append(", cbuItem=").append(cbuItem);
        sb.append(", brAddr=").append(brAddr);
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
        FiliationList other = (FiliationList) that;
        return (this.getBrName() == null ? other.getBrName() == null : this.getBrName().equals(other.getBrName()))
            && (this.getBrRegno() == null ? other.getBrRegno() == null : this.getBrRegno().equals(other.getBrRegno()))
            && (this.getBrPrincipal() == null ? other.getBrPrincipal() == null : this.getBrPrincipal().equals(other.getBrPrincipal()))
            && (this.getCbuItem() == null ? other.getCbuItem() == null : this.getCbuItem().equals(other.getCbuItem()))
            && (this.getBrAddr() == null ? other.getBrAddr() == null : this.getBrAddr().equals(other.getBrAddr()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBrName() == null) ? 0 : getBrName().hashCode());
        result = prime * result + ((getBrRegno() == null) ? 0 : getBrRegno().hashCode());
        result = prime * result + ((getBrPrincipal() == null) ? 0 : getBrPrincipal().hashCode());
        result = prime * result + ((getCbuItem() == null) ? 0 : getCbuItem().hashCode());
        result = prime * result + ((getBrAddr() == null) ? 0 : getBrAddr().hashCode());
        return result;
    }
}