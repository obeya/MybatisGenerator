package com.lagou.vo;

public class Skill {
    private Integer skillid;

    private String skillname;

    private Integer skillclick;

    private Integer skillshortcut;

    private Integer skillchildtypeid;

    public Integer getSkillid() {
        return skillid;
    }

    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    public String getSkillname() {
        return skillname;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname == null ? null : skillname.trim();
    }

    public Integer getSkillclick() {
        return skillclick;
    }

    public void setSkillclick(Integer skillclick) {
        this.skillclick = skillclick;
    }

    public Integer getSkillshortcut() {
        return skillshortcut;
    }

    public void setSkillshortcut(Integer skillshortcut) {
        this.skillshortcut = skillshortcut;
    }

    public Integer getSkillchildtypeid() {
        return skillchildtypeid;
    }

    public void setSkillchildtypeid(Integer skillchildtypeid) {
        this.skillchildtypeid = skillchildtypeid;
    }
}