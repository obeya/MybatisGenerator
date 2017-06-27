package com.lagou.vo;

import java.util.Date;

public class Job {
    private Integer jobid;

    private String jobname;

    private String jobdepartment;

    private String jobworkingproperty;

    private Integer jobminsalary;

    private Integer jobmaxsalary;

    private String jobworkcity;

    private String jobexperience;

    private String jobdegreerequired;

    private String jobtempt;

    private String jobdescribe;

    private String jobaddress;

    private String jobemail;

    private Date jobtime;

    private Integer jobclick;

    private Integer jobstate;

    private Integer skillid;

    private Integer companyid;

    private Integer jobdelstatus;

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getJobdepartment() {
        return jobdepartment;
    }

    public void setJobdepartment(String jobdepartment) {
        this.jobdepartment = jobdepartment == null ? null : jobdepartment.trim();
    }

    public String getJobworkingproperty() {
        return jobworkingproperty;
    }

    public void setJobworkingproperty(String jobworkingproperty) {
        this.jobworkingproperty = jobworkingproperty == null ? null : jobworkingproperty.trim();
    }

    public Integer getJobminsalary() {
        return jobminsalary;
    }

    public void setJobminsalary(Integer jobminsalary) {
        this.jobminsalary = jobminsalary;
    }

    public Integer getJobmaxsalary() {
        return jobmaxsalary;
    }

    public void setJobmaxsalary(Integer jobmaxsalary) {
        this.jobmaxsalary = jobmaxsalary;
    }

    public String getJobworkcity() {
        return jobworkcity;
    }

    public void setJobworkcity(String jobworkcity) {
        this.jobworkcity = jobworkcity == null ? null : jobworkcity.trim();
    }

    public String getJobexperience() {
        return jobexperience;
    }

    public void setJobexperience(String jobexperience) {
        this.jobexperience = jobexperience == null ? null : jobexperience.trim();
    }

    public String getJobdegreerequired() {
        return jobdegreerequired;
    }

    public void setJobdegreerequired(String jobdegreerequired) {
        this.jobdegreerequired = jobdegreerequired == null ? null : jobdegreerequired.trim();
    }

    public String getJobtempt() {
        return jobtempt;
    }

    public void setJobtempt(String jobtempt) {
        this.jobtempt = jobtempt == null ? null : jobtempt.trim();
    }

    public String getJobdescribe() {
        return jobdescribe;
    }

    public void setJobdescribe(String jobdescribe) {
        this.jobdescribe = jobdescribe == null ? null : jobdescribe.trim();
    }

    public String getJobaddress() {
        return jobaddress;
    }

    public void setJobaddress(String jobaddress) {
        this.jobaddress = jobaddress == null ? null : jobaddress.trim();
    }

    public String getJobemail() {
        return jobemail;
    }

    public void setJobemail(String jobemail) {
        this.jobemail = jobemail == null ? null : jobemail.trim();
    }

    public Date getJobtime() {
        return jobtime;
    }

    public void setJobtime(Date jobtime) {
        this.jobtime = jobtime;
    }

    public Integer getJobclick() {
        return jobclick;
    }

    public void setJobclick(Integer jobclick) {
        this.jobclick = jobclick;
    }

    public Integer getJobstate() {
        return jobstate;
    }

    public void setJobstate(Integer jobstate) {
        this.jobstate = jobstate;
    }

    public Integer getSkillid() {
        return skillid;
    }

    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getJobdelstatus() {
        return jobdelstatus;
    }

    public void setJobdelstatus(Integer jobdelstatus) {
        this.jobdelstatus = jobdelstatus;
    }
}