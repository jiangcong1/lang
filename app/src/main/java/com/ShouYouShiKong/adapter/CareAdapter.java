//package com.ShouYouShiKong.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.kanglaixin.entity.CareItem;
//import com.medicalcare.kanglaixin.R;
//
//import java.util.ArrayList;
//
//public class CareAdapter extends BaseAdapter {
//
//	/**
//	 * 图片id
//	 */
//	private int[] resIds = { R.drawable.connection_consult_nor,
//			R.drawable.connection_nearby_nor,
//			R.drawable.connection_archives_nor,
//			R.drawable.connection_remote_nor, R.drawable.connection_weather_nor };
//
//	/**
//	 * 选项名
//	 */
//	private String[] names = { "客户咨询", "附近医院", "健康档案", "远程管理", "天气预报" };
//
//	private ArrayList<CareItem> data = new ArrayList<CareItem>();
//
//	private Context context;
//	private LayoutInflater inflater;
//
//	public CareAdapter(Context context) {
//
//		this.context = context;
//		inflater = LayoutInflater.from(context);
//		// 初始化数据+
//		data.clear();
//		for (int i = 0; i < resIds.length; i++) {
//			data.add(new CareItem(names[i], resIds[i]));
//		}
//	}
//
//	@Override
//	public int getCount() {
//		// TODO Auto-generated method stub
//		return data.size();
//	}
//
//	@Override
//	public Object getItem(int position) {
//		// TODO Auto-generated method stub
//		return data.get(position);
//	}
//
//	@Override
//	public long getItemId(int position) {
//		// TODO Auto-generated method stub
//		return position;
//	}
//
//	@Override
//	public View getView(int position, View convertView, ViewGroup parent) {
//		// TODO Auto-generated method stub
//
//		ViewHolder viewHolder;
//		if (convertView == null) {
//			convertView = inflater.inflate(R.layout.care_lv_item, null);
//			viewHolder = new ViewHolder();
//			viewHolder.iconIv = (ImageView) convertView
//					.findViewById(R.id.care_lv_item_iv_icon);
//			viewHolder.nameTv = (TextView) convertView
//					.findViewById(R.id.care_lv_item_tv_name);
//			convertView.setTag(viewHolder);
//		} else {
//			viewHolder = (ViewHolder) convertView.getTag();
//		}
//
//		CareItem careItem = data.get(position);
//		viewHolder.iconIv.setBackgroundResource(careItem.getResId());
//		viewHolder.nameTv.setText(careItem.getName());
//
//		return convertView;
//	}
//
//	class ViewHolder {
//		ImageView iconIv;
//		TextView nameTv;
//	}
//}
