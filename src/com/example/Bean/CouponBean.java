package com.example.Bean;

import java.sql.Date;

import android.R.string;

public class CouponBean {

	private String Imagename;
	private String CouponDescription;
	private String CouponCode;
	private String Couponstartdate;
	private String CouponEnddate;
	private String id;
	private String type;
	private String name;
	
	public CouponBean(String Imagename,String CouponDescription,String CouponCode,String Couponstartdate,String CouponEnddate,String id,String type,String name)
	{
		this.Imagename=Imagename;
		this.CouponCode=CouponCode;
		this.CouponDescription=CouponDescription;
		this.CouponEnddate=CouponEnddate;
		this.Couponstartdate=Couponstartdate;
		this.id=id;
		this.name=name;
		this.type=type;
	}
	public String getImagename() {
		return Imagename;
	}
	public void setImagename(String imagename) {
		Imagename = imagename;
	}
	public String getCouponDescription() {
		return CouponDescription;
	}
	public void setCouponDescription(String couponDescription) {
		CouponDescription = couponDescription;
	}
	public String getCouponCode() {
		return CouponCode;
	}
	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}
	public String getCouponstartdate() {
		return Couponstartdate;
	}
	public void setCouponstartdate(String couponstartdate) {
		Couponstartdate = couponstartdate;
	}
	public String getCouponEnddate() {
		return CouponEnddate;
	}
	public void setCouponEnddate(String couponEnddate) {
		CouponEnddate = couponEnddate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
