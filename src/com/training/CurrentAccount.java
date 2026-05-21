package com.training;

public class CurrentAccount extends Account {

    double overdraftLimit;

    // Constructor

    CurrentAccount(int accountNumber, String customerName,

                   double balance, double overdraftLimit) {

        super(accountNumber, customerName, balance);

        this.overdraftLimit = overdraftLimit;

    }

    // Display Overdraft Limit

    void displayOverdraft() {

        System.out.println("Overdraft Limit: " + overdraftLimit);

    }

}
