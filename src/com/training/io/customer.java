package com.training.io;

import java.io.Serializable;

public class customer implements Serializable  {

    private String customerId;
    private String customerName;
    private String gender;
    private String city;
    private double balance;

    public customer(String customerId, String customerName,
                    String gender, String city, double balance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.city = city;
        this.balance = balance;
    }

    public customer(String customerId, String customerName,
                    String gender, String city) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.gender = gender;
        this.city = city;
        this.balance = 0;
    }

    public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
    public String toString() {
        return "customer [customerId=" + customerId
                + ", customerName=" + customerName
                + ", gender=" + gender
                + ", city=" + city
                + ", balance=" + balance
                + "]";
    }
}