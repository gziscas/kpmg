package eface.model;

public class MorDetailList {
    private String morregId;

    private String mortgaGor;

    private String more;

    private String regOrg;

    private String regiDate;

    private String morType;

    private String morRegcno;

    private String appreGrea;

    private String priclasecKind;

    private String priclaseCam;

    private String pefperFrom;

    private String pefperTo;

    private String canDate;

    public String getMorregId() {
        return morregId;
    }

    public void setMorregId(String morregId) {
        this.morregId = morregId == null ? null : morregId.trim();
    }

    public String getMortgaGor() {
        return mortgaGor;
    }

    public void setMortgaGor(String mortgaGor) {
        this.mortgaGor = mortgaGor == null ? null : mortgaGor.trim();
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more == null ? null : more.trim();
    }

    public String getRegOrg() {
        return regOrg;
    }

    public void setRegOrg(String regOrg) {
        this.regOrg = regOrg == null ? null : regOrg.trim();
    }

    public String getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(String regiDate) {
        this.regiDate = regiDate == null ? null : regiDate.trim();
    }

    public String getMorType() {
        return morType;
    }

    public void setMorType(String morType) {
        this.morType = morType == null ? null : morType.trim();
    }

    public String getMorRegcno() {
        return morRegcno;
    }

    public void setMorRegcno(String morRegcno) {
        this.morRegcno = morRegcno == null ? null : morRegcno.trim();
    }

    public String getAppreGrea() {
        return appreGrea;
    }

    public void setAppreGrea(String appreGrea) {
        this.appreGrea = appreGrea == null ? null : appreGrea.trim();
    }

    public String getPriclasecKind() {
        return priclasecKind;
    }

    public void setPriclasecKind(String priclasecKind) {
        this.priclasecKind = priclasecKind == null ? null : priclasecKind.trim();
    }

    public String getPriclaseCam() {
        return priclaseCam;
    }

    public void setPriclaseCam(String priclaseCam) {
        this.priclaseCam = priclaseCam == null ? null : priclaseCam.trim();
    }

    public String getPefperFrom() {
        return pefperFrom;
    }

    public void setPefperFrom(String pefperFrom) {
        this.pefperFrom = pefperFrom == null ? null : pefperFrom.trim();
    }

    public String getPefperTo() {
        return pefperTo;
    }

    public void setPefperTo(String pefperTo) {
        this.pefperTo = pefperTo == null ? null : pefperTo.trim();
    }

    public String getCanDate() {
        return canDate;
    }

    public void setCanDate(String canDate) {
        this.canDate = canDate == null ? null : canDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", morregId=").append(morregId);
        sb.append(", mortgaGor=").append(mortgaGor);
        sb.append(", more=").append(more);
        sb.append(", regOrg=").append(regOrg);
        sb.append(", regiDate=").append(regiDate);
        sb.append(", morType=").append(morType);
        sb.append(", morRegcno=").append(morRegcno);
        sb.append(", appreGrea=").append(appreGrea);
        sb.append(", priclasecKind=").append(priclasecKind);
        sb.append(", priclaseCam=").append(priclaseCam);
        sb.append(", pefperFrom=").append(pefperFrom);
        sb.append(", pefperTo=").append(pefperTo);
        sb.append(", canDate=").append(canDate);
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
        MorDetailList other = (MorDetailList) that;
        return (this.getMorregId() == null ? other.getMorregId() == null : this.getMorregId().equals(other.getMorregId()))
            && (this.getMortgaGor() == null ? other.getMortgaGor() == null : this.getMortgaGor().equals(other.getMortgaGor()))
            && (this.getMore() == null ? other.getMore() == null : this.getMore().equals(other.getMore()))
            && (this.getRegOrg() == null ? other.getRegOrg() == null : this.getRegOrg().equals(other.getRegOrg()))
            && (this.getRegiDate() == null ? other.getRegiDate() == null : this.getRegiDate().equals(other.getRegiDate()))
            && (this.getMorType() == null ? other.getMorType() == null : this.getMorType().equals(other.getMorType()))
            && (this.getMorRegcno() == null ? other.getMorRegcno() == null : this.getMorRegcno().equals(other.getMorRegcno()))
            && (this.getAppreGrea() == null ? other.getAppreGrea() == null : this.getAppreGrea().equals(other.getAppreGrea()))
            && (this.getPriclasecKind() == null ? other.getPriclasecKind() == null : this.getPriclasecKind().equals(other.getPriclasecKind()))
            && (this.getPriclaseCam() == null ? other.getPriclaseCam() == null : this.getPriclaseCam().equals(other.getPriclaseCam()))
            && (this.getPefperFrom() == null ? other.getPefperFrom() == null : this.getPefperFrom().equals(other.getPefperFrom()))
            && (this.getPefperTo() == null ? other.getPefperTo() == null : this.getPefperTo().equals(other.getPefperTo()))
            && (this.getCanDate() == null ? other.getCanDate() == null : this.getCanDate().equals(other.getCanDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMorregId() == null) ? 0 : getMorregId().hashCode());
        result = prime * result + ((getMortgaGor() == null) ? 0 : getMortgaGor().hashCode());
        result = prime * result + ((getMore() == null) ? 0 : getMore().hashCode());
        result = prime * result + ((getRegOrg() == null) ? 0 : getRegOrg().hashCode());
        result = prime * result + ((getRegiDate() == null) ? 0 : getRegiDate().hashCode());
        result = prime * result + ((getMorType() == null) ? 0 : getMorType().hashCode());
        result = prime * result + ((getMorRegcno() == null) ? 0 : getMorRegcno().hashCode());
        result = prime * result + ((getAppreGrea() == null) ? 0 : getAppreGrea().hashCode());
        result = prime * result + ((getPriclasecKind() == null) ? 0 : getPriclasecKind().hashCode());
        result = prime * result + ((getPriclaseCam() == null) ? 0 : getPriclaseCam().hashCode());
        result = prime * result + ((getPefperFrom() == null) ? 0 : getPefperFrom().hashCode());
        result = prime * result + ((getPefperTo() == null) ? 0 : getPefperTo().hashCode());
        result = prime * result + ((getCanDate() == null) ? 0 : getCanDate().hashCode());
        return result;
    }
}