package com.ShouYouShiKong.fragment;


import android.content.Intent;

import android.os.Bundle;

import android.view.View;



import com.ShouYouShiKong.R;
import com.ShouYouShiKong.activity.ConditionActivity;

public class NeswFragment extends BaseFragment  {



	@Override
	protected Bundle initLeftBtn() {
		// TODO Auto-generated method stub

		Bundle bundle = new Bundle();
		bundle.putBoolean(KEY_TITLE_BTN_IS_SHOW, false);

		return bundle;
	}




	@Override
	protected String getTile() {
		// TODO Auto-generated method stub
		return "消息";
	}

	@Override
	protected int getContentLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_news;
	}

	@Override
	public void initViews(View view) {

    }


    }



