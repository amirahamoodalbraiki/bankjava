package com.trainig.bank;

public class Account {
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    public void deposit(double amount) {
    	balance +=amount;
    	
    }
    public double displayBalalnce() {
		return balance;
    	
    }
 	public void withdraw(double amount) {

 		if (amount <= 0) {
 			System.out.println("Invalid amount");
 			return;
 		}

 		if (amount > balance) {
 			System.out.println("Insufficient balance");
 			return;
 		}

 		balance -= amount;
 	}
}
