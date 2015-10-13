package com.ShouYouShiKong.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ShouYouShiKong.R;
import com.ShouYouShiKong.activity.ConditionActivity;


public class FindFragment extends BaseFragment implements View.OnClickListener{
	Button button;

	@Override
	protected Bundle initLeftBtn() {
		// TODO Auto-generated method stub

		Bundle bundle = new Bundle();
		bundle.putBoolean(KEY_TITLE_BTN_IS_SHOW, false);
//		bundle.putInt(KEY_TITLE_BTN_RES_ID, R.drawable.common_title_menu_bg);
		return bundle;
	}


	@Override
	protected String getTile() {
		// TODO Auto-generated method stub
		return "发现";
	}

	@Override
	protected int getContentLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_news;
	}

	@Override
	protected void initViews(View view) {
		// TODO Auto-generated method stub
		button = (Button) view.findViewById(R.id.button);
		button.setOnClickListener(this);
	}

	public void onClick(View view) {
		switch (view.getId()) {
			case R.id.button:
				startActivity(new Intent(getActivity(), ConditionActivity.class));
		}
	}
}