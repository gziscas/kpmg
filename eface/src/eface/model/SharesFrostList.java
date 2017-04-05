package eface.model;

public class SharesFrostList {
    private String froDocno;

    private String froAuth;

    private String froFrom;

    private String froTo;

    private String froAm;

    private String thawAuth;

    private String thawDocno;

    private String thawDate;

    private String thawComment;

    public String getFroDocno() {
        return froDocno;
    }

    public void setFroDocno(String froDocno) {
        this.froDocno = froDocno == null ? null : froDocno.trim();
    }

    public String getFroAuth() {
        return froAuth;
    }

    public void setFroAuth(String froAuth) {
        this.froAuth = froAuth == null ? null : froAuth.trim();
    }

    public String getFroFrom() {
        return froFrom;
    }

    public void setFroFrom(String froFrom) {
        this.froFrom = froFrom == null ? null : froFrom.trim();
    }

    public String getFroTo() {
        return froTo;
    }

    public void setFroTo(String froTo) {
        this.froTo = froTo == null ? null : froTo.trim();
    }

    public String getFroAm() {
        return froAm;
    }

    public void setFroAm(String froAm) {
        this.froAm = froAm == null ? null : froAm.trim();
    }

    public String getThawAuth() {
        return thawAuth;
    }

    public void setThawAuth(String thawAuth) {
        this.thawAuth = thawAuth == null ? null : thawAuth.trim();
    }

    public String getThawDocno() {
        return thawDocno;
    }

    public void setThawDocno(String thawDocno) {
        this.thawDocno = thawDocno == null ? null : thawDocno.trim();
    }

    public String getThawDate() {
        return thawDate;
    }

    public void setThawDate(String thawDate) {
        this.thawDate = thawDate == null ? null : thawDate.trim();
    }

    public String getThawComment() {
        return thawComment;
    }

    public void setThawComment(String thawComment) {
        this.thawComment = thawComment == null ? null : thawComment.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", froDocno=").append(froDocno);
        sb.append(", froAuth=").append(froAuth);
        sb.append(", froFrom=").append(froFrom);
        sb.append(", froTo=").append(froTo);
        sb.append(", froAm=").append(froAm);
        sb.append(", thawAuth=").append(thawAuth);
        sb.append(", thawDocno=").append(thawDocno);
        sb.append(", thawDate=").append(thawDate);
        sb.append(", thawComment=").append(thawComment);
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
        SharesFrostList other = (SharesFrostList) that;
        return (this.getFroDocno() == null ? other.getFroDocno() == null : this.getFroDocno().equals(other.getFroDocno()))
            && (this.getFroAuth() == null ? other.getFroAuth() == null : this.getFroAuth().equals(other.getFroAuth()))
            && (this.getFroFrom() == null ? other.getFroFrom() == null : this.getFroFrom().equals(other.getFroFrom()))
            && (this.getFroTo() == null ? other.getFroTo() == null : this.getFroTo().equals(other.getFroTo()))
            && (this.getFroAm() == null ? other.getFroAm() == null : this.getFroAm().equals(other.getFroAm()))
            && (this.getThawAuth() == null ? other.getThawAuth() == null : this.getThawAuth().equals(other.getThawAuth()))
            && (this.getThawDocno() == null ? other.getThawDocno() == null : this.getThawDocno().equals(other.getThawDocno()))
            && (this.getThawDate() == null ? other.getThawDate() == null : this.getThawDate().equals(other.getThawDate()))
            && (this.getThawComment() == null ? other.getThawComment() == null : this.getThawComment().equals(other.getThawComment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFroDocno() == null) ? 0 : getFroDocno().hashCode());
        result = prime * result + ((getFroAuth() == null) ? 0 : getFroAuth().hashCode());
        result = prime * result + ((getFroFrom() == null) ? 0 : getFroFrom().hashCode());
        result = prime * result + ((getFroTo() == null) ? 0 : getFroTo().hashCode());
        result = prime * result + ((getFroAm() == null) ? 0 : getFroAm().hashCode());
        result = prime * result + ((getThawAuth() == null) ? 0 : getThawAuth().hashCode());
        result = prime * result + ((getThawDocno() == null) ? 0 : getThawDocno().hashCode());
        result = prime * result + ((getThawDate() == null) ? 0 : getThawDate().hashCode());
        result = prime * result + ((getThawComment() == null) ? 0 : getThawComment().hashCode());
        return result;
    }
}