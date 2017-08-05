package com.example.administrator.uncaughtexceptiondemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/8/3.
 */

public class Activityone extends Activity
{
    private TextView tv_click;
    private TextView tv_ceshi;

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
//        super.onCreate(savedInstanceState, persistentState);
//
//    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        mApplication.getInstance().addActivity(this);
        tv_ceshi.setText("1111111");
        tv_click= (TextView) findViewById(R.id.tv_click);
        tv_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activityone.this,Activitytwo.class);
                startActivity(intent);
            }
        });
    }
}
