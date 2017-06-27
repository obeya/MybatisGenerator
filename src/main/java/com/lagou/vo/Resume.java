package com.lagou.vo;

import java.util.Date;

public class Resume {
    private Integer resumeid;

    private String resumename;

    private Integer resumegender;

    private String resumeexperience;

    private String resumephone;

    private String resumeemail;

    private String resumecurrentstate;

    private String resumeexpectcity;

    private String resumeworkingproperty;

    private String resumeexpectposition;

    private String resumeexpectsalary;

    private String resumecompanyname;

    private String resumepositionname;

    private String resumeworkyearstart;

    private String resumeworkmonthstart;

    private String resumeworkyearend;

    private String resumeworkmonthend;

    private String resumeprojectname;

    private String resumeprojectposition;

    private Date resumeprojectyearstart;

    private Date resumeprojectyearend;

    private Date resumeprojectmonthstart;

    private Date resumeprojectmonthend;

    private String resumeprojectdesc;

    private String resumeschoolname;

    private String resumedegree;

    private String resumeprofessional;

    private Date resumeschoolyearstart;

    private Date resumeschoolyearend;

    private String resumeselfdesc;

    private String resumeworklink;

    private String resumeworkdesc;

    private Date resumelastupdate;

    private Integer userid;

    private Integer resumedelstatus;

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename == null ? null : resumename.trim();
    }

    public Integer getResumegender() {
        return resumegender;
    }

    public void setResumegender(Integer resumegender) {
        this.resumegender = resumegender;
    }

    public String getResumeexperience() {
        return resumeexperience;
    }

    public void setResumeexperience(String resumeexperience) {
        this.resumeexperience = resumeexperience == null ? null : resumeexperience.trim();
    }

    public String getResumephone() {
        return resumephone;
    }

    public void setResumephone(String resumephone) {
        this.resumephone = resumephone == null ? null : resumephone.trim();
    }

    public String getResumeemail() {
        return resumeemail;
    }

    public void setResumeemail(String resumeemail) {
        this.resumeemail = resumeemail == null ? null : resumeemail.trim();
    }

    public String getResumecurrentstate() {
        return resumecurrentstate;
    }

    public void setResumecurrentstate(String resumecurrentstate) {
        this.resumecurrentstate = resumecurrentstate == null ? null : resumecurrentstate.trim();
    }

    public String getResumeexpectcity() {
        return resumeexpectcity;
    }

    public void setResumeexpectcity(String resumeexpectcity) {
        this.resumeexpectcity = resumeexpectcity == null ? null : resumeexpectcity.trim();
    }

    public String getResumeworkingproperty() {
        return resumeworkingproperty;
    }

    public void setResumeworkingproperty(String resumeworkingproperty) {
        this.resumeworkingproperty = resumeworkingproperty == null ? null : resumeworkingproperty.trim();
    }

    public String getResumeexpectposition() {
        return resumeexpectposition;
    }

    public void setResumeexpectposition(String resumeexpectposition) {
        this.resumeexpectposition = resumeexpectposition == null ? null : resumeexpectposition.trim();
    }

    public String getResumeexpectsalary() {
        return resumeexpectsalary;
    }

    public void setResumeexpectsalary(String resumeexpectsalary) {
        this.resumeexpectsalary = resumeexpectsalary == null ? null : resumeexpectsalary.trim();
    }

    public String getResumecompanyname() {
        return resumecompanyname;
    }

    public void setResumecompanyname(String resumecompanyname) {
        this.resumecompanyname = resumecompanyname == null ? null : resumecompanyname.trim();
    }

    public String getResumepositionname() {
        return resumepositionname;
    }

    public void setResumepositionname(String resumepositionname) {
        this.resumepositionname = resumepositionname == null ? null : resumepositionname.trim();
    }

    public String getResumeworkyearstart() {
        return resumeworkyearstart;
    }

    public void setResumeworkyearstart(String resumeworkyearstart) {
        this.resumeworkyearstart = resumeworkyearstart == null ? null : resumeworkyearstart.trim();
    }

    public String getResumeworkmonthstart() {
        return resumeworkmonthstart;
    }

    public void setResumeworkmonthstart(String resumeworkmonthstart) {
        this.resumeworkmonthstart = resumeworkmonthstart == null ? null : resumeworkmonthstart.trim();
    }

    public String getResumeworkyearend() {
        return resumeworkyearend;
    }

    public void setResumeworkyearend(String resumeworkyearend) {
        this.resumeworkyearend = resumeworkyearend == null ? null : resumeworkyearend.trim();
    }

    public String getResumeworkmonthend() {
        return resumeworkmonthend;
    }

    public void setResumeworkmonthend(String resumeworkmonthend) {
        this.resumeworkmonthend = resumeworkmonthend == null ? null : resumeworkmonthend.trim();
    }

    public String getResumeprojectname() {
        return resumeprojectname;
    }

    public void setResumeprojectname(String resumeprojectname) {
        this.resumeprojectname = resumeprojectname == null ? null : resumeprojectname.trim();
    }

    public String getResumeprojectposition() {
        return resumeprojectposition;
    }

    public void setResumeprojectposition(String resumeprojectposition) {
        this.resumeprojectposition = resumeprojectposition == null ? null : resumeprojectposition.trim();
    }

    public Date getResumeprojectyearstart() {
        return resumeprojectyearstart;
    }

    public void setResumeprojectyearstart(Date resumeprojectyearstart) {
        this.resumeprojectyearstart = resumeprojectyearstart;
    }

    public Date getResumeprojectyearend() {
        return resumeprojectyearend;
    }

    public void setResumeprojectyearend(Date resumeprojectyearend) {
        this.resumeprojectyearend = resumeprojectyearend;
    }

    public Date getResumeprojectmonthstart() {
        return resumeprojectmonthstart;
    }

    public void setResumeprojectmonthstart(Date resumeprojectmonthstart) {
        this.resumeprojectmonthstart = resumeprojectmonthstart;
    }

    public Date getResumeprojectmonthend() {
        return resumeprojectmonthend;
    }

    public void setResumeprojectmonthend(Date resumeprojectmonthend) {
        this.resumeprojectmonthend = resumeprojectmonthend;
    }

    public String getResumeprojectdesc() {
        return resumeprojectdesc;
    }

    public void setResumeprojectdesc(String resumeprojectdesc) {
        this.resumeprojectdesc = resumeprojectdesc == null ? null : resumeprojectdesc.trim();
    }

    public String getResumeschoolname() {
        return resumeschoolname;
    }

    public void setResumeschoolname(String resumeschoolname) {
        this.resumeschoolname = resumeschoolname == null ? null : resumeschoolname.trim();
    }

    public String getResumedegree() {
        return resumedegree;
    }

    public void setResumedegree(String resumedegree) {
        this.resumedegree = resumedegree == null ? null : resumedegree.trim();
    }

    public String getResumeprofessional() {
        return resumeprofessional;
    }

    public void setResumeprofessional(String resumeprofessional) {
        this.resumeprofessional = resumeprofessional == null ? null : resumeprofessional.trim();
    }

    public Date getResumeschoolyearstart() {
        return resumeschoolyearstart;
    }

    public void setResumeschoolyearstart(Date resumeschoolyearstart) {
        this.resumeschoolyearstart = resumeschoolyearstart;
    }

    public Date getResumeschoolyearend() {
        return resumeschoolyearend;
    }

    public void setResumeschoolyearend(Date resumeschoolyearend) {
        this.resumeschoolyearend = resumeschoolyearend;
    }

    public String getResumeselfdesc() {
        return resumeselfdesc;
    }

    public void setResumeselfdesc(String resumeselfdesc) {
        this.resumeselfdesc = resumeselfdesc == null ? null : resumeselfdesc.trim();
    }

    public String getResumeworklink() {
        return resumeworklink;
    }

    public void setResumeworklink(String resumeworklink) {
        this.resumeworklink = resumeworklink == null ? null : resumeworklink.trim();
    }

    public String getResumeworkdesc() {
        return resumeworkdesc;
    }

    public void setResumeworkdesc(String resumeworkdesc) {
        this.resumeworkdesc = resumeworkdesc == null ? null : resumeworkdesc.trim();
    }

    public Date getResumelastupdate() {
        return resumelastupdate;
    }

    public void setResumelastupdate(Date resumelastupdate) {
        this.resumelastupdate = resumelastupdate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getResumedelstatus() {
        return resumedelstatus;
    }

    public void setResumedelstatus(Integer resumedelstatus) {
        this.resumedelstatus = resumedelstatus;
    }
}