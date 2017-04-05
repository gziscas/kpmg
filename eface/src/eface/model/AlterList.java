package eface.model;

public class AlterList {
    private String altDate;

    private String altItem;

    private String altBe;

    private String altAf;

    public String getAltDate() {
        return altDate;
    }

    public void setAltDate(String altDate) {
        this.altDate = altDate == null ? null : altDate.trim();
    }

    public String getAltItem() {
        return altItem;
    }

    public void setAltItem(String altItem) {
        this.altItem = altItem == null ? null : altItem.trim();
    }

    public String getAltBe() {
        return altBe;
    }

    public void setAltBe(String altBe) {
        this.altBe = altBe == null ? null : altBe.trim();
    }

    public String getAltAf() {
        return altAf;
    }

    public void setAltAf(String altAf) {
        this.altAf = altAf == null ? null : altAf.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", altDate=").append(altDate);
        sb.append(", altItem=").append(altItem);
        sb.append(", altBe=").append(altBe);
        sb.append(", altAf=").append(altAf);
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
        AlterList other = (AlterList) that;
        return (this.getAltDate() == null ? other.getAltDate() == null : this.getAltDate().equals(other.getAltDate()))
            && (this.getAltItem() == null ? other.getAltItem() == null : this.getAltItem().equals(other.getAltItem()))
            && (this.getAltBe() == null ? other.getAltBe() == null : this.getAltBe().equals(other.getAltBe()))
            && (this.getAltAf() == null ? other.getAltAf() == null : this.getAltAf().equals(other.getAltAf()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAltDate() == null) ? 0 : getAltDate().hashCode());
        result = prime * result + ((getAltItem() == null) ? 0 : getAltItem().hashCode());
        result = prime * result + ((getAltBe() == null) ? 0 : getAltBe().hashCode());
        result = prime * result + ((getAltAf() == null) ? 0 : getAltAf().hashCode());
        return result;
    }
}