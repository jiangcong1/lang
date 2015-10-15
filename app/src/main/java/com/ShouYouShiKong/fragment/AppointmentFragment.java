package com.ShouYouShiKong.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.ShouYouShiKong.R;
import com.ShouYouShiKong.activity.IssueMessageActivity;


public class AppointmentFragment extends BaseFragment implements View.OnClickListener{
	/**
	 * LineGridView是否第一次加载
	 */
	private boolean isFirstLayout = false;
	private Button button1;

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
		button1=(Button)view.findViewById(R.id.button);

		button1.setOnClickListener(this);
	}
	public void onClick(View view) {

switch (view.getId()){
	case R.id.button:
		startActivity(new Intent(getActivity(), IssueMessageActivity.class));
		break;
}
	}

}
