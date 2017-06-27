package com.lagou.vo;

public class Activity {
    private Integer actid;

    private String actimgpath;

    private Integer actstate;

    public Integer getActid() {
        return actid;
    }

    public void setActid(Integer actid) {
        this.actid = actid;
    }

    public String getActimgpath() {
        return actimgpath;
    }

    public void setActimgpath(String actimgpath) {
        this.actimgpath = actimgpath == null ? null : actimgpath.trim();
    }

    public Integer getActstate() {
        return actstate;
    }

    public void setActstate(Integer actstate) {
        this.actstate = actstate;
    }
}