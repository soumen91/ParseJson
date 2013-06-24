package com.example.view;

import com.example.Interface.IRetailer;
import com.example.Presenter.RetailerPresenter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.ListView;

public class RetailerView extends Activity /*implements IRetailer*/{
	private ListView list;	
	private RetailerPresenter mPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list = (ListView) findViewById(R.id.listView1);	
		mPresenter = new RetailerPresenter(this);

	}

	
	public Activity getActivity() {
		return this;
	}

	
	public Context getContext() {
		return this;
	}

	
	public ListView getList() {
		return list;
	}

}
