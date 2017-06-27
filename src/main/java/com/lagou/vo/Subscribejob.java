package com.lagou.vo;

public class Subscribejob {
    private Integer subscribeid;

    private String semail;

    private String scycle;

    private String sjobname;

    private String sjobworkcity;

    private String ssalary;

    private Integer subscribedelstatus;

    public Integer getSubscribeid() {
        return subscribeid;
    }

    public void setSubscribeid(Integer subscribeid) {
        this.subscribeid = subscribeid;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail == null ? null : semail.trim();
    }

    public String getScycle() {
        return scycle;
    }

    public void setScycle(String scycle) {
        this.scycle = scycle == null ? null : scycle.trim();
    }

    public String getSjobname() {
        return sjobname;
    }

    public void setSjobname(String sjobname) {
        this.sjobname = sjobname == null ? null : sjobname.trim();
    }

    public String getSjobworkcity() {
        return sjobworkcity;
    }

    public void setSjobworkcity(String sjobworkcity) {
        this.sjobworkcity = sjobworkcity == null ? null : sjobworkcity.trim();
    }

    public String getSsalary() {
        return ssalary;
    }

    public void setSsalary(String ssalary) {
        this.ssalary = ssalary == null ? null : ssalary.trim();
    }

    public Integer getSubscribedelstatus() {
        return subscribedelstatus;
    }

    public void setSubscribedelstatus(Integer subscribedelstatus) {
        this.subscribedelstatus = subscribedelstatus;
    }
}