package com.example.listviewnc;

public class Music {
    private String Name;
    private String tacGia;
    private int photo;

    public Music() {
    }

    public Music(String name, String tacGia, int photo) {
        Name = name;
        this.tacGia = tacGia;
        this.photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
