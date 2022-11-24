package com.example.listviewnc;

public class Love {
    private int photoBackground;
    private String title;
    private String tacGia;
    private String content;

    public Love(){

    }

    public Love(int photoBackground, String title, String tacGia, String content) {
        this.photoBackground = photoBackground;
        this.title = title;
        this.tacGia = tacGia;
        this.content = content;
    }

    public int getPhotoBackground() {
        return photoBackground;
    }

    public void setPhotoBackground(int photoBackground) {
        this.photoBackground = photoBackground;
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
