package com.just.myforum;

import android.net.Uri;

/**
 * Created by woops on 16-7-29.
 */
public class Bean {
    public Integer picThumb;
    public String usrName;
    public String time;
    public String text;

    public Uri imgOne;
    public Uri imgTwo;



    public Bean() {
    }

    public Bean(Integer picThumb, String usrName, String time, Uri imgOne, String text, Uri imgTwo) {
        this.picThumb = picThumb;
        this.usrName = usrName;
        this.time = time;
        this.imgOne = imgOne;
        this.text = text;
        this.imgTwo = imgTwo;
    }


}
