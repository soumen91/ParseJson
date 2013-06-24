package com.example.adapter;

import java.util.ArrayList;

import com.example.Bean.CouponBean;
import com.example.view.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CouponAdapter  extends ArrayAdapter<CouponBean>{
	private Context mCtx;
	private ArrayList<CouponBean> mItems = new ArrayList<CouponBean>();
	private ViewHolder mHolder;
	
	

	public CouponAdapter(Context context, int textViewResourceId,	ArrayList<CouponBean> items) {
		super(context, textViewResourceId, items);
		this.mCtx = context;
		this.mItems = items;
		
	
	}		  

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}


	@Override
	public View getView( final int position,  View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) mCtx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.newrow, null);

			mHolder = new ViewHolder();
			v.setTag(mHolder);
			
			mHolder.Imagename = (ImageView)v.findViewById(R.id.img1);
			mHolder.retailername = (TextView)v.findViewById(R.id.txtv1);
			
		}
		else {
			mHolder =  (ViewHolder) v.getTag();
		}			
		
		final CouponBean userBean = mItems.get(position);
		
		if(userBean != null){
			byte[] decodedString = Base64.decode(userBean.getImagename(), Base64.DEFAULT);
			Bitmap decodedByte = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length); 
			mHolder.Imagename.setImageBitmap(decodedByte);
			mHolder.retailername.setText(userBean.getName());
			mHolder.retailername.setTextColor(Color.BLACK);
			
		}		
		return v;
	}

	

	class ViewHolder {
	
		public ImageView Imagename;
		public TextView retailername;
		
		
	}
}
	
