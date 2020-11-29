package com.example.videoviewpagerfirebase;

public class vModel {
    String desc,title,url;
    //empty constructor for firebase
    public vModel(){}

    public vModel(String desc, String title, String url) {
        this.desc = desc;
        this.title = title;
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
