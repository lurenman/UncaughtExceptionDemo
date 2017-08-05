package com.example.administrator.uncaughtexceptiondemo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrashHelper.getInstance().init(this);
        mApplication.getInstance().addActivity(this);
        checkpermission();
        //tv_hello.setText("aaa");
        tv_hello= (TextView) findViewById(R.id.tv_hello);
        tv_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(MainActivity.this,Activityone.class);
                 MainActivity.this.startActivity(intent);
            }
        });

    }
    private void checkpermission()
    {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},10);

        }

    }
}
