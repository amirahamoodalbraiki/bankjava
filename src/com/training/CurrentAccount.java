package com.training;

public class CurrentAccount extends Account {

   private double overdraftLimit;

    // Constructor

    public double getOverdraftLimit() {
	return overdraftLimit;
}

   public void setOverdraftLimit(double overdraftLimit) {
	this.overdraftLimit = overdraftLimit;
   }

	CurrentAccount(int accountNumber, String customerName,

                   double balance, double overdraftLimit) {

        super(accountNumber, customerName, balance);

        this.overdraftLimit = overdraftLimit;

    }

    // Display Overdraft Limit

    void displayOverdraft() {

        System.out.println("Overdraft Limit: " + overdraftLimit);

    }
    
    @Override
    public void withdraw(double amount) {
    	if (balance+overdraftLimit>=amount) {
    		balance -=amount;
    		System.out.println("amount withdrawn from current account");
    	}
    	else {
    		System.out.println("Exceeds overdraft");
    	}
    }

}
