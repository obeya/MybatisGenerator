package com.lagou.vo;

public class Industryfield {
    private Integer industryfieldid;

    private String industryname;

    public Integer getIndustryfieldid() {
        return industryfieldid;
    }

    public void setIndustryfieldid(Integer industryfieldid) {
        this.industryfieldid = industryfieldid;
    }

    public String getIndustryname() {
        return industryname;
    }

    public void setIndustryname(String industryname) {
        this.industryname = industryname == null ? null : industryname.trim();
    }
}