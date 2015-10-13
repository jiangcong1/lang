package com.ShouYouShiKong.fragment;

import android.os.Bundle;
import android.view.View;

import com.ShouYouShiKong.R;


public class MeFragment extends BaseFragment {

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
		return "个人中心";
	}

	@Override
	protected int getContentLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_me
				;
	}

	@Override
	protected void initViews(View view) {
		// TODO Auto-generated method stub

	}

}
