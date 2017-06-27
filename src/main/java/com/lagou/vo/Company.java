package com.lagou.vo;

public class Company {
    private Integer companyid;

    private String cofullname;

    private String copassword;

    private String cosalt;

    private String coabbrname;

    private String coemail;

    private String cowebsite;

    private String cocity;

    private String coindustryfield;

    private String cocompanysize;

    private String cophase;

    private String cotemptation;

    private String cologo;

    private String coprofile;

    private Integer costate;

    private String cocode;

    private Integer industryfieldid;

    private Integer codelstatus;

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCofullname() {
        return cofullname;
    }

    public void setCofullname(String cofullname) {
        this.cofullname = cofullname == null ? null : cofullname.trim();
    }

    public String getCopassword() {
        return copassword;
    }

    public void setCopassword(String copassword) {
        this.copassword = copassword == null ? null : copassword.trim();
    }

    public String getCosalt() {
        return cosalt;
    }

    public void setCosalt(String cosalt) {
        this.cosalt = cosalt == null ? null : cosalt.trim();
    }

    public String getCoabbrname() {
        return coabbrname;
    }

    public void setCoabbrname(String coabbrname) {
        this.coabbrname = coabbrname == null ? null : coabbrname.trim();
    }

    public String getCoemail() {
        return coemail;
    }

    public void setCoemail(String coemail) {
        this.coemail = coemail == null ? null : coemail.trim();
    }

    public String getCowebsite() {
        return cowebsite;
    }

    public void setCowebsite(String cowebsite) {
        this.cowebsite = cowebsite == null ? null : cowebsite.trim();
    }

    public String getCocity() {
        return cocity;
    }

    public void setCocity(String cocity) {
        this.cocity = cocity == null ? null : cocity.trim();
    }

    public String getCoindustryfield() {
        return coindustryfield;
    }

    public void setCoindustryfield(String coindustryfield) {
        this.coindustryfield = coindustryfield == null ? null : coindustryfield.trim();
    }

    public String getCocompanysize() {
        return cocompanysize;
    }

    public void setCocompanysize(String cocompanysize) {
        this.cocompanysize = cocompanysize == null ? null : cocompanysize.trim();
    }

    public String getCophase() {
        return cophase;
    }

    public void setCophase(String cophase) {
        this.cophase = cophase == null ? null : cophase.trim();
    }

    public String getCotemptation() {
        return cotemptation;
    }

    public void setCotemptation(String cotemptation) {
        this.cotemptation = cotemptation == null ? null : cotemptation.trim();
    }

    public String getCologo() {
        return cologo;
    }

    public void setCologo(String cologo) {
        this.cologo = cologo == null ? null : cologo.trim();
    }

    public String getCoprofile() {
        return coprofile;
    }

    public void setCoprofile(String coprofile) {
        this.coprofile = coprofile == null ? null : coprofile.trim();
    }

    public Integer getCostate() {
        return costate;
    }

    public void setCostate(Integer costate) {
        this.costate = costate;
    }

    public String getCocode() {
        return cocode;
    }

    public void setCocode(String cocode) {
        this.cocode = cocode == null ? null : cocode.trim();
    }

    public Integer getIndustryfieldid() {
        return industryfieldid;
    }

    public void setIndustryfieldid(Integer industryfieldid) {
        this.industryfieldid = industryfieldid;
    }

    public Integer getCodelstatus() {
        return codelstatus;
    }

    public void setCodelstatus(Integer codelstatus) {
        this.codelstatus = codelstatus;
    }
}