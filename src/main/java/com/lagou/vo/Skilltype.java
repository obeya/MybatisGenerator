package com.lagou.vo;

public class Skilltype {
    private Integer skilltypeid;

    private String skilltypename;

    public Integer getSkilltypeid() {
        return skilltypeid;
    }

    public void setSkilltypeid(Integer skilltypeid) {
        this.skilltypeid = skilltypeid;
    }

    public String getSkilltypename() {
        return skilltypename;
    }

    public void setSkilltypename(String skilltypename) {
        this.skilltypename = skilltypename == null ? null : skilltypename.trim();
    }
}