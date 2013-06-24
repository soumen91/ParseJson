package com.example.Presenter;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.Bean.CouponBean;
import com.example.Interface.IRetailer;
import com.example.Utility.Util;
import com.example.adapter.CouponAdapter;
import com.example.view.R;
import com.example.view.RetailerView;

public class RetailerPresenter implements IRetailer.Presenter{
	private RetailerView mRetailerView;
	private ArrayList<CouponBean> arr = new ArrayList<CouponBean>();
	private CouponAdapter Myadpter;
	
	public RetailerPresenter(RetailerView mRetailerView){
		this.mRetailerView = mRetailerView;
		getValueFromServer();
		setListAdapter();
	}

	public void getValueFromServer() {
		String st = Util.readXMLinString("coupon_list_for_customer_json.txt", mRetailerView.getContext());

		try {
			JSONObject json = new JSONObject(st);
			JSONObject couponatics = json.getJSONObject("COUPONATICS");
			JSONObject customer = couponatics.getJSONObject("CUSTOMER");
			String customer_id = customer.getString("CUSTOMER_ID");
			String customer_name = customer.getString("CUSTOMER_NAME");
			JSONObject coupons = customer.getJSONObject("COUPONS");
			JSONArray coupon = coupons.getJSONArray("COUPON");
			for (int i = 0; i < coupon.length(); i++) {
				JSONObject c = coupon.getJSONObject(i);
				
				JSONObject retailer = c.getJSONObject("RETAILER");
					String id = retailer.getString("ID");
					String type = retailer.getString("TYPE");
					String name = retailer.getString("NAME");
				
				
				String image = c.getString("image").toString();
				String COUPON_DESCRIPTION = c.getString("COUPON_DESCRIPTION");
				String COUPON_CODE = c.getString("COUPON_CODE");
				String COUPON_START_DATE = c.getString("COUPON_START_DATE");
				String COUPON_EXPIRY_DATE = c.getString("COUPON_EXPIRY_DATE");
				
				arr.add(new CouponBean(image, COUPON_DESCRIPTION, COUPON_CODE,COUPON_START_DATE, COUPON_EXPIRY_DATE, id, type, name));

			}

		} catch (JSONException e) {
			e.printStackTrace();
		}
		//return arr;
	}

	public void setListAdapter() {
		Myadpter = new CouponAdapter(mRetailerView.getContext(), R.layout.newrow,arr);
		mRetailerView.getList().setAdapter(Myadpter);
		
	}

}
