package com.uil.administrator.shopping.Activity;


import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.uil.administrator.shopping.Adapter.BaseActivity;
import com.uil.administrator.shopping.Fragment.Fragment_BrandSale;
import com.uil.administrator.shopping.R;

/**
 *  首页
 */
public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    private FrameLayout fl;//主页面中的fragment占位frameLayout
    private RadioGroup rg;//主页面的选择按钮组


    /*
    * 重写contentview方法，用来返回setcontentview（）需要的布局
    * */

    @Override
    protected int contentView() {
        return R.layout.activity_main;
    }

    /*
    * 初始化控件
    * */
    @Override
    protected void initView() {
        //初始化帧布局
        fl= (FrameLayout) findViewById(R.id.fl_main);

        //初始化选择按钮组
        rg= (RadioGroup) findViewById(R.id.rg_main);

        //让第一个radiobutton默认被选中
        rg.getChildAt(0).performClick();

        //设置点击变化监听
        rg.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.home:
                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.fl_main, new HomeFragment())
                        .commit();
                break;
            case R.id.pinpai_main:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_main, new Fragment_BrandSale())
                        .commit();
                break;
            case R.id.jinbi_main:
                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.fl_main,new MassageFragment())
                        .commit();
                break;
            case R.id.diy:
                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.fl_main,new MassageFragment())
                        .commit();
                break;
            case R.id.main:
                getSupportFragmentManager()
                        .beginTransaction()
//                        .replace(R.id.fl_main,new MyselfFragment())
                        .commit();
                break;
        }
    }
}
