package com.uil.administrator.shopping.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;


import com.uil.administrator.shopping.Adapter.BaseActivity;
import com.uil.administrator.shopping.R;

import java.util.Random;

public class Welcome_Image extends BaseActivity {

    private static final String TAG ="print" ;
    private ImageView iv;
    private Handler handler;

    @Override
    protected int contentView() {
        return R.layout.activity_welcome_image;
    }

    /**
     *  初始化方法
     */
    @Override
    protected void initView() {

        iv = (ImageView) findViewById(R.id.welcome_iv);
        handler = new Handler();
    }

    /**
     *  加载数据
     */
    @Override
    protected void dataLoad() {

        // 添加随机数用于展示随机图片
        Random ra =new Random();
        int imageId = getResources().getIdentifier("iv_guide_"+ra.nextInt(3),"drawable",getPackageName());
             iv.setImageResource(imageId);
        /**
         *通过SharedPreferences判断是否是第一次启动
         */
        SharedPreferences sp = getSharedPreferences("data", MODE_PRIVATE);
        boolean isFirst = sp.getBoolean("isFirst", true);
        if (isFirst == true) {
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("isFirst", false);
            //4.提交
            editor.commit();
            //应用首次启动
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Welcome_Image.this, Welcome_page.class));
                   finish();
                }
            }, 3000); // 等待3秒后执行跳转
        } else{
            //二次启动
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(Welcome_Image.this, MainActivity.class));
                    finish();
                }
            }, 3000);
        }
    }
}

