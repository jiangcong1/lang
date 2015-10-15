package com.ShouYouShiKong.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;


import com.ShouYouShiKong.R;
import com.ShouYouShiKong.adapter.FindAdapter;
import com.ShouYouShiKong.view.LineGridView;


public class FindFragment extends BaseFragment implements View.OnClickListener {

	private LineGridView gv = null;
	private boolean isFirstLayout = false;
	private int[] resIds = { R.drawable.fatecircle,
			R.drawable.game, R.drawable.nearby,
			R.drawable.phtot, R.drawable.rio,
	};



	private String[] names = {"有缘人", "缘分圈", "搜附近", "千里约", "娱乐园",
	};
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
		return R.layout.fragment_find;
	}

	@Override
	protected void initViews(View view) {
		// TODO Auto-generated method stub
		gv = (LineGridView) view.findViewById(R.id.gridview);
		// 监听第一次加载，为了得到gv的实际高传入adapter进行高度适配
		ViewTreeObserver observer = gv.getViewTreeObserver();
		observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

			@Override
			public void onGlobalLayout() {
				// TODO Auto-generated method stub

				if (!isFirstLayout) {
					isFirstLayout = true;
				ListAdapter adapter=new FindAdapter(activity,gv.getHeight()/2,resIds,names);
					gv.setAdapter(adapter);

				}
			}
		});

	}



	public void onClick(View view) {

	}
}