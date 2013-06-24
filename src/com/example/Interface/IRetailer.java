package com.example.Interface;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.widget.ListView;

import com.example.Bean.CouponBean;

public interface IRetailer {
	public interface Presenter{
		public void getValueFromServer();
		public void setListAdapter();
	}
	
	public Activity getActivity();
	public Context getContext();
	public ListView getList();

}
