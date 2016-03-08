package com.uil.administrator.shopping.Fragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


import com.uil.administrator.shopping.Activity.AboutShoppingActivity;
import com.uil.administrator.shopping.Activity.FeedbackActivity;
import com.uil.administrator.shopping.Activity.LoginAndRegisterActivity;
import com.uil.administrator.shopping.Activity.SystemSettingsActivity;
import com.uil.administrator.shopping.Adapter.BaseFragment;
import com.uil.administrator.shopping.R;

/**
 * Created by Administrator on 2016/3/7.
 * 我页面
 */
public class Fragment_Mine extends BaseFragment {
    private Button loginAndRegister;
    private Button feedback;
    private Button systemSettings;
    private Button aboutshopping;

    /**
     * 布局
     * @return
     */
    @Override
    protected int contentResid() {

        return R.layout.fragment_mine;
    }

    /**
     * 初始化
     * @param view
     */
    @Override
    protected void initView(View view) {
        //注册控件
        loginAndRegister = (Button) view.findViewById(R.id.loginAndRegister);
        //设置控件监听
        loginAndRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到登陆注册页面
                startActivity(new Intent(getActivity(), LoginAndRegisterActivity.class));
            }
        });


        //注册控件
        feedback = (Button) view.findViewById(R.id.feedback);
        //设置控件监听
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到反馈意见页面
                startActivityForResult(new Intent(getActivity(), FeedbackActivity.class),1);


            }
        });


        //注册控件
        systemSettings = (Button) view.findViewById(R.id.systemSettings);
        //设置控件监听
        systemSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到系统设置页面
                startActivity(new Intent(getActivity(), SystemSettingsActivity.class));
            }
        });


        //注册控件
        aboutshopping = (Button) view.findViewById(R.id.aboutshopping);
        //设置控件监听
        aboutshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到关于购物潮页面
                startActivity(new Intent(getActivity(), AboutShoppingActivity.class));
            }
        });
    }


}
