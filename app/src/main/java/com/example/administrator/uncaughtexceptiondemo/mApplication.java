package com.example.administrator.uncaughtexceptiondemo;

import android.app.Activity;
import android.app.Application;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

public class mApplication extends Application {
    private List<Activity> activityList = new LinkedList<Activity>();
    private static mApplication instance;
    private int i=1;
    @Override
    public void onCreate() {
        super.onCreate();
        //如果注册在这里app会重启2次（华为的是这样的）
        //CrashHelper.getInstance().init(this)
        i++;
        Logger.e("ccccccccccccccccccccccc","-----"+i+"");

        //CrashHelper.getInstance().init(this);

    }
    // 单例模式中获取唯一的mApplication 实例
    public static mApplication getInstance() {
        if (null == instance) {
            instance = new mApplication();
        }
        return instance;

    }

    // 添加Activity 到容器中
    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    // 遍历所有Activity 并finish
    public void exit() {
        for (Activity activity : activityList) {
            activity.finish();
        }
        System.exit(0);
    }

}
