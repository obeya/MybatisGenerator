package com.lagou.vo;

public class Investor {
    private Integer investorid;

    private String investname;

    private String investphase;

    private Integer companyid;

    public Integer getInvestorid() {
        return investorid;
    }

    public void setInvestorid(Integer investorid) {
        this.investorid = investorid;
    }

    public String getInvestname() {
        return investname;
    }

    public void setInvestname(String investname) {
        this.investname = investname == null ? null : investname.trim();
    }

    public String getInvestphase() {
        return investphase;
    }

    public void setInvestphase(String investphase) {
        this.investphase = investphase == null ? null : investphase.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }
}