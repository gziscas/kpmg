package eface.model;

public class MorguaInfoList {
    private String morregId;

    private String guaName;

    private String quan;

    private String value;

    public String getMorregId() {
        return morregId;
    }

    public void setMorregId(String morregId) {
        this.morregId = morregId == null ? null : morregId.trim();
    }

    public String getGuaName() {
        return guaName;
    }

    public void setGuaName(String guaName) {
        this.guaName = guaName == null ? null : guaName.trim();
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan == null ? null : quan.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", morregId=").append(morregId);
        sb.append(", guaName=").append(guaName);
        sb.append(", quan=").append(quan);
        sb.append(", value=").append(value);
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
        MorguaInfoList other = (MorguaInfoList) that;
        return (this.getMorregId() == null ? other.getMorregId() == null : this.getMorregId().equals(other.getMorregId()))
            && (this.getGuaName() == null ? other.getGuaName() == null : this.getGuaName().equals(other.getGuaName()))
            && (this.getQuan() == null ? other.getQuan() == null : this.getQuan().equals(other.getQuan()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMorregId() == null) ? 0 : getMorregId().hashCode());
        result = prime * result + ((getGuaName() == null) ? 0 : getGuaName().hashCode());
        result = prime * result + ((getQuan() == null) ? 0 : getQuan().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        return result;
    }
}