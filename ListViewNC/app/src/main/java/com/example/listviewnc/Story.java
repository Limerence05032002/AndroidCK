package com.example.listviewnc;

public class Story {

    private int imgBackground;
    private String title;
    private String tacGia;
    private String content;

    public Story() {

    }

    public Story(int imgBackground, String title, String tacGia, String content) {
        this.imgBackground = imgBackground;
        this.title = title;
        this.tacGia = tacGia;
        this.content = content;
    }

    public int getImgBackground() {
        return imgBackground;
    }

    public void setImgBackground(int imgBackground) {
        this.imgBackground = imgBackground;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
