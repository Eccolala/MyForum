package com.just.myforum;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by woops on 16-7-30.
 */
public class MyApplication extends Application {
    public List<Bean> mList ;

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        mList = new ArrayList<>();
    }
}
