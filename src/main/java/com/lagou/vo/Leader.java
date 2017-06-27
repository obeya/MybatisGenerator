package com.lagou.vo;

public class Leader {
    private Integer leaderid;

    private String leadername;

    private String leaderportrait;

    private String leanderposition;

    private String leaderweibo;

    private String leaderremark;

    private Integer companyid;

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    public String getLeadername() {
        return leadername;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername == null ? null : leadername.trim();
    }

    public String getLeaderportrait() {
        return leaderportrait;
    }

    public void setLeaderportrait(String leaderportrait) {
        this.leaderportrait = leaderportrait == null ? null : leaderportrait.trim();
    }

    public String getLeanderposition() {
        return leanderposition;
    }

    public void setLeanderposition(String leanderposition) {
        this.leanderposition = leanderposition == null ? null : leanderposition.trim();
    }

    public String getLeaderweibo() {
        return leaderweibo;
    }

    public void setLeaderweibo(String leaderweibo) {
        this.leaderweibo = leaderweibo == null ? null : leaderweibo.trim();
    }

    public String getLeaderremark() {
        return leaderremark;
    }

    public void setLeaderremark(String leaderremark) {
        this.leaderremark = leaderremark == null ? null : leaderremark.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}