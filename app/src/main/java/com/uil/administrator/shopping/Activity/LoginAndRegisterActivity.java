package com.uil.administrator.shopping.Activity;



import android.view.View;
import android.widget.Button;

import com.uil.administrator.shopping.Adapter.BaseActivity;
import com.uil.administrator.shopping.R;

/**
 * Created by Administrator on 2016/3/7.
 * 注册/登陆页面
 */
public class LoginAndRegisterActivity extends BaseActivity implements View.OnClickListener {
    //返回按钮
    private Button back;



    @Override
    protected int contentView() {
        return R.layout.activity_loginandregister;
    }


    @Override
    protected void initView() {
        //返回按钮
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(this);
    }

    /**
     * 点击左上角返回按钮，跳回到我的页面
     * @param v
     */
    @Override
    public void onClick(View v) {
        finish();
    }
}
