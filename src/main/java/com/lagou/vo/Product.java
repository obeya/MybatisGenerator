package com.lagou.vo;

public class Product {
    private Integer productid;

    private String productname;

    private String producturl;

    private String productprofile;

    private String productposter;

    private Integer companyid;

    private Integer productdelstatus;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProducturl() {
        return producturl;
    }

    public void setProducturl(String producturl) {
        this.producturl = producturl == null ? null : producturl.trim();
    }

    public String getProductprofile() {
        return productprofile;
    }

    public void setProductprofile(String productprofile) {
        this.productprofile = productprofile == null ? null : productprofile.trim();
    }

    public String getProductposter() {
        return productposter;
    }

    public void setProductposter(String productposter) {
        this.productposter = productposter == null ? null : productposter.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getProductdelstatus() {
        return productdelstatus;
    }

    public void setProductdelstatus(Integer productdelstatus) {
        this.productdelstatus = productdelstatus;
    }
}