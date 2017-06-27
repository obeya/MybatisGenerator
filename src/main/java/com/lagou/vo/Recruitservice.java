package com.lagou.vo;

public class Recruitservice {
    private Integer recruitid;

    private String recruittel;

    private String recruitemail;

    private String recruitcofullname;

    private Integer companyid;

    private Integer rcrtservstate;

    public Integer getRecruitid() {
        return recruitid;
    }

    public void setRecruitid(Integer recruitid) {
        this.recruitid = recruitid;
    }

    public String getRecruittel() {
        return recruittel;
    }

    public void setRecruittel(String recruittel) {
        this.recruittel = recruittel == null ? null : recruittel.trim();
    }

    public String getRecruitemail() {
        return recruitemail;
    }

    public void setRecruitemail(String recruitemail) {
        this.recruitemail = recruitemail == null ? null : recruitemail.trim();
    }

    public String getRecruitcofullname() {
        return recruitcofullname;
    }

    public void setRecruitcofullname(String recruitcofullname) {
        this.recruitcofullname = recruitcofullname == null ? null : recruitcofullname.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getRcrtservstate() {
        return rcrtservstate;
    }

    public void setRcrtservstate(Integer rcrtservstate) {
        this.rcrtservstate = rcrtservstate;
    }
}