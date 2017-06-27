package com.lagou.vo;

public class Companynews {
    private Integer conewsid;

    private String conewstitle;

    private String conewslink;

    private Integer companyid;

    public Integer getConewsid() {
        return conewsid;
    }

    public void setConewsid(Integer conewsid) {
        this.conewsid = conewsid;
    }

    public String getConewstitle() {
        return conewstitle;
    }

    public void setConewstitle(String conewstitle) {
        this.conewstitle = conewstitle == null ? null : conewstitle.trim();
    }

    public String getConewslink() {
        return conewslink;
    }

    public void setConewslink(String conewslink) {
        this.conewslink = conewslink == null ? null : conewslink.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}