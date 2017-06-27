package com.lagou.vo;

public class Hotsearch {
    private Integer hotsearchid;

    private String hotword;

    private Integer hotsearches;

    public Integer getHotsearchid() {
        return hotsearchid;
    }

    public void setHotsearchid(Integer hotsearchid) {
        this.hotsearchid = hotsearchid;
    }

    public String getHotword() {
        return hotword;
    }

    public void setHotword(String hotword) {
        this.hotword = hotword == null ? null : hotword.trim();
    }

    public Integer getHotsearches() {
        return hotsearches;
    }

    public void setHotsearches(Integer hotsearches) {
        this.hotsearches = hotsearches;
    }
}