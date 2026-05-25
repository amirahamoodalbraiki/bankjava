package com.training.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerWriter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        if (balance <= 1000) {
            System.out.println("Balance must be greater than 1000. Customer not saved.");
            sc.close();
            return;
        }

        customer customerObj =
                new customer(customerId, customerName, gender, city, balance);

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("customer_data.csv", true))) {

            bw.write(customerObj.toString());
            bw.newLine();

            System.out.println("Customer saved successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}