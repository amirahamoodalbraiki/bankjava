package com.training;


public class SavingsAccount extends Account {

    double interestRate;

    // Constructor

    SavingsAccount(int accountNumber, String customerName,

                   double balance, double interestRate) {

        super(accountNumber, customerName, balance);

        this.interestRate = interestRate;

    }


    void displayInterest() {

        System.out.println("Interest Rate: " + interestRate + "%");

    }

}
