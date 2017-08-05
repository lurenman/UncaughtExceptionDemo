package com.example.administrator.uncaughtexceptiondemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/3.
 */

public class Activitytwo extends Activity
{
    private TextView tv_ceshi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        mApplication.getInstance().addActivity(this);
        tv_ceshi.setText("111111111111");

    }
}
