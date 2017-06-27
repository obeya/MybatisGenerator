package com.lagou.vo;

public class Authenticate {
    private Integer authid;

    private String authcharter;

    private String authcowebsite;

    private String authconame;

    private String authcologo;

    private Integer companyid;

    private Integer authstate;

    public Integer getAuthid() {
        return authid;
    }

    public void setAuthid(Integer authid) {
        this.authid = authid;
    }

    public String getAuthcharter() {
        return authcharter;
    }

    public void setAuthcharter(String authcharter) {
        this.authcharter = authcharter == null ? null : authcharter.trim();
    }

    public String getAuthcowebsite() {
        return authcowebsite;
    }

    public void setAuthcowebsite(String authcowebsite) {
        this.authcowebsite = authcowebsite == null ? null : authcowebsite.trim();
    }

    public String getAuthconame() {
        return authconame;
    }

    public void setAuthconame(String authconame) {
        this.authconame = authconame == null ? null : authconame.trim();
    }

    public String getAuthcologo() {
        return authcologo;
    }

    public void setAuthcologo(String authcologo) {
        this.authcologo = authcologo == null ? null : authcologo.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getAuthstate() {
        return authstate;
    }

    public void setAuthstate(Integer authstate) {
        this.authstate = authstate;
    }
}