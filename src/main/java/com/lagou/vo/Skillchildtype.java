package com.lagou.vo;

public class Skillchildtype {
    private Integer skillchildtypeid;

    private String skillchildtypename;

    private Integer skilltypeid;

    public Integer getSkillchildtypeid() {
        return skillchildtypeid;
    }

    public void setSkillchildtypeid(Integer skillchildtypeid) {
        this.skillchildtypeid = skillchildtypeid;
    }

    public String getSkillchildtypename() {
        return skillchildtypename;
    }

    public void setSkillchildtypename(String skillchildtypename) {
        this.skillchildtypename = skillchildtypename == null ? null : skillchildtypename.trim();
    }

    public Integer getSkilltypeid() {
        return skilltypeid;
    }

    public void setSkilltypeid(Integer skilltypeid) {
        this.skilltypeid = skilltypeid;
    }
}