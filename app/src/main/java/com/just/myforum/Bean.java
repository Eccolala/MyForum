package com.just.myforum;

/**
 * Created by woops on 16-7-29.
 */
public class Bean {
    private Integer picThumb;
    private String usrName;
    private String time;
    private String text;

    private Integer imgOne;
    private Integer imgTwo;

    public Bean(Integer picThumb, String usrName, String time, Integer imgOne, String text, Integer imgTwo) {
        this.picThumb = picThumb;
        this.usrName = usrName;
        this.time = time;
        this.imgOne = imgOne;
        this.text = text;
        this.imgTwo = imgTwo;
    }

    public Integer getPicThumb() {
        return picThumb;
    }

    public void setPicThumb(Integer picThumb) {
        this.picThumb = picThumb;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImgOne() {
        return imgOne;
    }

    public void setImgOne(Integer imgOne) {
        this.imgOne = imgOne;
    }

    public Integer getImgTwo() {
        return imgTwo;
    }

    public void setImgTwo(Integer imgTwo) {
        this.imgTwo = imgTwo;
    }
}
