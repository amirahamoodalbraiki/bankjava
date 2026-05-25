package com.training.io;

public class customer {

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