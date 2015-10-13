package com.ShouYouShiKong.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.ShouYouShiKong.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

/**
 * Created by jiang on 2015/10/12.
 */
public class CauseActivity extends Activity {
    @ViewInject(R.id.clause)
    private WebView clause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cause);
        ViewUtils.inject(this); //注入view和事件
        clause.getSettings().setJavaScriptEnabled(true);
        clause.loadUrl("file:///android_asset/first.html");
    }
}
