package com.ShouYouShiKong.fragment;

import android.os.Bundle;
import android.view.View;

import com.ShouYouShiKong.R;


public class AppointmentFragment extends BaseFragment {
	/**
	 * LineGridView是否第一次加载
	 */
	private boolean isFirstLayout = false;

	@Override
	protected Bundle initLeftBtn() {
		// TODO Auto-generated method stub

		Bundle bundle = new Bundle();
		bundle.putBoolean(KEY_TITLE_BTN_IS_SHOW, true);
//		bundle.putInt(KEY_TITLE_BTN_RES_ID, R.drawable.common_title_menu_bg);
		return bundle;
	}



	@Override
	protected String getTile() {
		// TODO Auto-generated method stub
		return "约吧";
	}

	@Override
	protected int getContentLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_appointment;
	}

	@Override
	protected void initViews(View view) {
		// TODO Auto-generated method stub


	}

}
