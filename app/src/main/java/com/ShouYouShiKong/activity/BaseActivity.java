package com.ShouYouShiKong.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ShouYouShiKong.R;

/**
 * Created by jiang on 2015/10/12.
 */
public class BaseActivity  extends Activity{
    private TextView mTitleTx;
    private View mBack;
    private LinearLayout contentLayout;
    // 内容区域的布局
    private View contentView;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        initContentView();
        initTitleBar();

    }
    public void  initTitleBar(){
        mTitleTx = (TextView)findViewById(R.id.headline);

    }

    private    void initContentView() {
        ViewGroup content = (ViewGroup) findViewById(android.R.id.content);
        content.removeAllViews();
        contentLayout=new LinearLayout(this);
        contentLayout.setOrientation(LinearLayout.VERTICAL);
        content.addView(contentLayout);
        LayoutInflater.from(this).inflate(R.layout.activity_headline, contentLayout, true);
    }

    @Override
    public void setContentView(int layoutResID) {
        //View customContentView = LayoutInflater.from(this).inflate(layoutResID,null);
        /*this is the same result with
         View customContentView = LayoutInflater.from(this).inflate(layoutResID,contentLayout, false);
         */

        //contentLayout.addView(customContentView,LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        LayoutInflater.from(this).inflate(layoutResID, contentLayout, true);

    }
    @Override
    public void setContentView(View customContentView) {
        contentLayout.addView(customContentView);

    }
    @Override
    public void setTitle(CharSequence title) {
        mTitleTx.setText(title);
    }
}


