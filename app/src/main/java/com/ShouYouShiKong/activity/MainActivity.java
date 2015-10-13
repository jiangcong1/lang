package com.ShouYouShiKong.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import com.ShouYouShiKong.R;
import com.ShouYouShiKong.fragment.NeswFragment;
import com.ShouYouShiKong.fragment.MeFragment;
import com.ShouYouShiKong.fragment.FindFragment;
import com.ShouYouShiKong.fragment.AppointmentFragment;


public class MainActivity extends FragmentActivity {

    /**
     * 导航数组名
     */
    private String navs[] = { "约吧", "消息", "发现", "我" };
    /**
     * 导航图片数组
     */
    private int navIcons[] = { R.drawable.appointment_button,
            R.drawable.news_button,
            R.drawable.find_button,
            R.drawable.me_button };

    /**
     * 导航指向数组
     */
    private Class<?> clzs[] = { AppointmentFragment.class, NeswFragment.class,
            FindFragment.class, MeFragment.class };

    private LayoutInflater inflater = null;
    private FragmentTabHost fth = null;

    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        inflater = LayoutInflater.from(this);
        setContentView(R.layout.activity_main);
        initViews();
    }

    /**
     * 初始化控件
     */
    private void initViews() {

        fth = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fth.setup(this, getSupportFragmentManager(),
                R.id.main_fl_realtabcontent);
        for (int i = 0; i < navs.length; i++) {
            TabSpec spec = fth.newTabSpec(navs[i]).setIndicator(
                    getIndicatorView(i));
            fth.addTab(spec, clzs[i], null);
        }
    }

    /**
     * 获取导航指示器的View
     *
     * @param index
     *           索引
     * @return View
     */
    private View getIndicatorView(int index) {

        View view = inflater.inflate(R.layout.common_nav_item, null);
        view.setBackgroundResource(R.drawable.common_nav_bg);
        ImageView iconIv = (ImageView) view
                .findViewById(R.id.common_nav_iv_icon);
        iconIv.setBackgroundResource(navIcons[index]);
        TextView textTv = (TextView) view.findViewById(R.id.common_nav_tv_text);
        textTv.setText(navs[index]);
        return view;
    }
}
