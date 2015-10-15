package com.ShouYouShiKong.entity;

public class CareItem {

	private String name;
	private int resId;

	public CareItem(String name, int resId) {
		super();
		this.name = name;
		this.resId = resId;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CareItem [resId=" + resId + ", name=" + name + "]";
	}

}
