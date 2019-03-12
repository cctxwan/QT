package com.cc.qt;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.cc.systembar.StatusBarCompat;
import com.cc.systembar.StatusBarUtil;

/**
 * 财财天气
 */
public class MainActivity extends AppCompatActivity {

    Activity activity = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        StatusBarCompat.setStatusBarColor(activity, ContextCompat.getColor(activity, R.color.peru));
        //修改状态栏字体颜色
        StatusBarUtil.setImmersiveStatusBar(activity, true);
    }
}
