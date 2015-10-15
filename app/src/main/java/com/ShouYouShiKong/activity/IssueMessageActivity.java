package com.ShouYouShiKong.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.ShouYouShiKong.R;
import com.ShouYouShiKong.fragment.DynamicFragment;
import com.ShouYouShiKong.fragment.MsgsndFragment;


public class IssueMessageActivity extends FragmentActivity  {
    /**
     * 导航数组名
     */
 private String navs[] = { "", "", "" };
    /**
     * 导航图片数组
     */
    private int navIcons[] = { R.drawable.msgsnd_button,
            R.drawable.dynamic_button,
            R.drawable.data_button,
           };

    /**
     * 导航指向数组
     */
    private Class<?> clzs[] = { MsgsndFragment.class,
            DynamicFragment.class, MsgsndFragment.class };

    private LayoutInflater inflater = null;
    private FragmentTabHost fth = null;

    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        inflater = LayoutInflater.from(this);
        setContentView(R.layout.activity_issue_message);
        initViews();
    }

    /**
     * 初始化控件
     */
    private void initViews() {

        fth = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fth.setup(this, getSupportFragmentManager(),
                R.id.main_fl_realtabcontent);
        fth.getTabWidget().setDividerDrawable(null);
        for (int i = 0; i < navs.length; i++) {
         TabHost.TabSpec spec = fth.newTabSpec(navs[i]).setIndicator(
                  getIndicatorView(i));
            fth.addTab(spec, clzs[i], null);
//        }
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

        View view = inflater.inflate(R.layout.common_nav_item_two, null);

       ImageView iconIv = (ImageView) view
               .findViewById(R.id.common_nav_iv_icon);
       iconIv.setBackgroundResource(navIcons[index]);
        TextView textTv = (TextView) view.findViewById(R.id.common_nav_tv_text);
        textTv.setText(navs[index]);
        return view;
    }
}
