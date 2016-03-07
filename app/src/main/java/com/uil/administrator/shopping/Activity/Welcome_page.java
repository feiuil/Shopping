package com.uil.administrator.shopping.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.uil.administrator.shopping.Adapter.BaseActivity;
import com.uil.administrator.shopping.R;
import java.util.ArrayList;
import java.util.List;

/**
 *  首次打开的介绍（Viewpager）页面
 */
public class Welcome_page extends BaseActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {


    private ViewPager viewPager;
    private List<ImageView> listImage;
    private MyViewPagerAdapter adapter;

    private LinearLayout ll_nav;
    private LinearLayout.LayoutParams layoutParams;//定义一个布局参数，用于设置控件中的布局属性
    /**
     * 是否可以跳转
     */
    private boolean canJump;


    @Override
    protected int contentView() {
        return R.layout.activity_welcome_page;
    }

    /**
     *  初始化方法
     */
    @Override
    protected void initView() {
        viewPager = (ViewPager) findViewById(R.id.vp_welcome);
        viewPager.addOnPageChangeListener(this);

        ll_nav = (LinearLayout) findViewById(R.id.ll_nav);
        ll_nav.setGravity(Gravity.CENTER);

        layoutParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        layoutParams.leftMargin = 10;
        layoutParams.rightMargin = 10;
    }

    /**
     *  加载数据
     */
    @Override
    protected void dataLoad() {

        // 自定义ImageView保存图片到list中
        listImage = new ArrayList<>();
        for (int i = 1 ; i <= 4 ; i++){
            int imageId = getResources().getIdentifier("y_guide_"+i,"drawable",getPackageName());
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imageId);
            listImage.add(imageView);
        }


        // 设置适配器
        adapter = new MyViewPagerAdapter();
        viewPager.setAdapter(adapter);
      /*  for(int i = 0; i < listImage.size(); i++){
            TextView tv = new TextView(this);
            tv.setTag(i);
            tv.setOnClickListener(this);
            tv.setTextColor(Color.GREEN);
            if(i == 0){
                tv.setText("现在就购");
            } else if(i == 1){
                tv.setText("现在就抢");
            }
            else if(i == 2){
                tv.setText("现在就定");
            }
            else if(i == 3){
                tv.setText("现在开启");
            }
            ll_nav.addView(tv, layoutParams);
        }
*/
    }

    /**
     *  ViewPager的监听器
     * @param position  位置
     * @param positionOffset  偏移量
     * @param positionOffsetPixels  偏移的像素
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        if ( position==(listImage.size()-1) && positionOffset == 0 && positionOffsetPixels == 0) {
            if (canJump) {//表示可以到最后一页，可以跳转
                startActivity(new Intent(Welcome_page.this, MainActivity.class));
                // 事件执行一次后进行重置,避免事件多次触发
                canJump = false;
            }
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == ViewPager.SCROLL_STATE_DRAGGING) {
            // Log.d(TAG, "onPageScrollStateChanged: "+lastIndex);
            canJump = true;
        } else {
            canJump = false;
        }

    }

    @Override
    public void onClick(View v) {
        int index = (Integer)v.getTag();
        viewPager.setCurrentItem(index);
    }

    /**
     *  ViewPager的适配器
     */
    public class MyViewPagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return listImage.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(listImage.get(position));
            return listImage.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(listImage.get(position));
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
