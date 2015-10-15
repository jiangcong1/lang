package com.ShouYouShiKong.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

import com.ShouYouShiKong.R;
import com.ShouYouShiKong.adapter.MeAdapter;
import com.ShouYouShiKong.view.LineGridView;


public class MeFragment extends BaseFragment {
	private LineGridView gv = null;
	private boolean isFirstLayout = false;
	private int[] resIds = { R.drawable.me_ta,
			R.drawable.me_data, R.drawable.me_gift,
			R.drawable.me_credit, R.drawable.me_member,R.drawable.me_member
	};



	private String[] names = {"TA", "资料", "礼物", "信誉", "会员","设置"
	};
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
		gv = (LineGridView) view.findViewById(R.id.me_grid);
		// 监听第一次加载，为了得到gv的实际高传入adapter进行高度适配
		ViewTreeObserver observer = gv.getViewTreeObserver();
		observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

			@Override
			public void onGlobalLayout() {
				// TODO Auto-generated method stub

				if (!isFirstLayout) {
					isFirstLayout = true;
					ListAdapter adapter=new MeAdapter(activity,gv.getHeight()/2,resIds,names);
					gv.setAdapter(adapter);

				}
			}
		});

	}

}
