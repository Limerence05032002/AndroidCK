package com.example.listviewnc;

public class Question {
    private String tv_question_title;
    private int photoBackground;

    public Question() {
    }

    public Question(String tv_question_title, int photoBackground) {
        this.tv_question_title = tv_question_title;
        this.photoBackground = photoBackground;
    }

    public String getTv_question_title() {
        return tv_question_title;
    }

    public void setTv_question_title(String tv_question_title) {
        this.tv_question_title = tv_question_title;
    }


    public int getPhotoBackground() {
        return photoBackground;
    }

    public void setPhotoBackground(int photoBackground) {
        this.photoBackground = photoBackground;
    }
}
