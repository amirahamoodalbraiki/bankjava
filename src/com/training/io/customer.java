package com.training.io;

public class customer {
	
	private String customerId;
	private String customerName;
	private String gender;
	private String city;
	
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	public customer(String customerId, String customerName, String gender, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.city = city;
	}


}
