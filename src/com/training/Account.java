package com.training;

class Account {


  protected  int accountNumber;

  protected String customerName;

  protected double balance;

    // Constructor

    Account(int accountNumber, String customerName, double balance) {

        this.accountNumber = accountNumber;

        this.customerName = customerName;

        this.balance = balance;

    }
    

    public int getAccountNumber() {
  		return accountNumber;
  	}

  	public void setAccountNumber(int accountNumber) {
  		this.accountNumber = accountNumber;
  	}

  	public String getCustomerName() {
  		return customerName;
  	}

  	public void setCustomerName(String customerName) {
  		this.customerName = customerName;
  	}

  	public double getBalance() {
  		return balance;
  	}

  	public void setBalance(double balance) {
  		this.balance = balance;
  	}

    // Deposit Method

    void deposit(double amount) {

        balance += amount;

        System.out.println(amount + " deposited successfully.");

    }

    // Withdraw Method

    void withdraw(double amount) {

        if (amount <= balance) {

            balance -= amount;

            System.out.println(amount + " withdrawn successfully.");

        } else {

            System.out.println("Insufficient Balance.");

        }

    }

    // Display Balance

  public double displayBalance() {

      //  System.out.println("Account Number: " + accountNumber);

       // System.out.println("Customer Name: " + customerName);

     //   System.out.println("Balance: " + balance);
		return accountNumber;

    }

}