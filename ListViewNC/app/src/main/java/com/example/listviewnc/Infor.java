package com.example.listviewnc;

public class Infor {
    private int resourceId;
    private String tv_title;
    private String tip;
    private String content;

    public Infor() {
    }

    public Infor(int resourceId, String tv_title, String tip, String content) {
        this.resourceId = resourceId;
        this.tv_title = tv_title;
        this.tip = tip;
        this.content = content;

    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTv_title() {
        return tv_title;
    }

    public void setTv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
