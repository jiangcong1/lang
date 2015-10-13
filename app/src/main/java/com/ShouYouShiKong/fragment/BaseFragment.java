package com.ShouYouShiKong.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ShouYouShiKong.R;


public abstract class BaseFragment extends Fragment implements OnClickListener {

	/**
	 * 标题栏按钮图片的id
	 */
	protected final String KEY_TITLE_BTN_RES_ID = "resid";
	/**
	 * 标题栏按钮是否显示
	 */
	protected final String KEY_TITLE_BTN_IS_SHOW = "isshow";

	protected Activity activity = null;

	/**
	 * 由于切换fragment时onCreateView会重复调用，所以用rootView来缓存
	 */
	private View rootView = null;
	/**
	 * 内容的父控件
	 */
	private FrameLayout contentFl = null;
	/**
	 * 标题栏左边的按钮
	 */
	private TextView leftBtn = null;

	/**
	 * 标题栏的title
	 */
	private TextView titleTv = null;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);

		this.activity = activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		// 如果rootView为null则进行初始化操作，如果不为null说明fragment的父控件已经添加过此rootView，需要先移除该rootView后系统会再次添加
		if (rootView == null) {
			rootView = inflater.inflate(R.layout.fragment_base, null);
			contentFl = (FrameLayout) rootView
					.findViewById(R.id.fragment_base_fl_content);
			if (getContentLayoutId() > 0) {
				View contentView = inflater.inflate(getContentLayoutId(), null);
				contentFl.removeAllViews();
				contentFl.addView(contentView);
			}
			leftBtn = (TextView) rootView
					.findViewById(R.id.common_titlebar_ib_left);
			leftBtn.setOnClickListener(this);
			Bundle bundle = initLeftBtn();
			if (bundle != null) {
				if (bundle.getBoolean(KEY_TITLE_BTN_IS_SHOW)) {
					leftBtn.setVisibility(View.VISIBLE);
					int resid = bundle.getInt(KEY_TITLE_BTN_RES_ID);
					if (resid > 0) {
						leftBtn.setBackgroundResource(resid);
					}
				} else {
					leftBtn.setVisibility(View.INVISIBLE);
				}
			}

			if (bundle != null) {
				if (bundle.getBoolean(KEY_TITLE_BTN_IS_SHOW)) {

					int resid = bundle.getInt(KEY_TITLE_BTN_RES_ID);

				}
			}
			titleTv = (TextView) rootView
					.findViewById(R.id.common_titlebar_tv_title);
			if (!TextUtils.isEmpty(getTile())) {
				titleTv.setText(getTile());
			} else {
				titleTv.setText("");
			}
			initViews(rootView);
		} else {
			ViewGroup parent = (ViewGroup) rootView.getParent();
			if (parent != null) {
				parent.removeView(rootView);
			}
		}
		return rootView;
	}

	/**
	 * 初始化标题栏左边的按钮，返回拥有这两个KEY的Bundle进行配置：KEY_TITLE_BTN_RES_ID、
	 * KEY_TITLE_BTN_IS_SHOW
	 *
	 * @return
	 */
	protected abstract Bundle initLeftBtn();

	/**
	 * 初始化标题栏右边的按钮，返回拥有这两个KEY的Bundle进行配置：KEY_TITLE_BTN_RES_ID、
	 * KEY_TITLE_BTN_IS_SHOW
	 *
	 * @return
	 */


	/**
	 * 标题栏按钮点击回调事件
	 *
	 * @param isLeft
	 *            true：左按钮；false：右按钮
	 * @param view
	 *            被点击的View
	 */


	/**
	 * 获取标题内容
	 *
	 * @return
	 */
	protected abstract String getTile();

	/**
	 * 获取内容布局的资源ID
	 *
	 * @return
	 */
	protected abstract int getContentLayoutId();

	/**
	 * 初始化View回调
	 *
	 * @param parentView
	 *            父控件
	 */
	protected abstract void initViews(View parentView);

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub



	}

}
