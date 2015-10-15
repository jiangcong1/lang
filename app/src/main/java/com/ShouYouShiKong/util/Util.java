package com.ShouYouShiKong.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Util {

	/**
	 *
	 * 获取屏幕分辨率
	 *
	 * @return 屏幕分辨率的数组。屏幕宽int[0]；屏幕高int[1]
	 */
	public static int[] getResolution(Context context) {

		int[] resolution = new int[2];

		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(outMetrics);
		resolution[0] = outMetrics.widthPixels;
		resolution[1] = outMetrics.heightPixels;

		return resolution;
	}
}
