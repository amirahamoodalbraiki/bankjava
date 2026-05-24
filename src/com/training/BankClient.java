package com.training;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<SavingAccount> savingAccounts = new ArrayList<>();
        ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();

        System.out.println("Enter 3 Saving Accounts:");

        for (int i = 0; i < 3; i++) {

            System.out.println("\n Saving Account " + (i + 1));

            int accNo = readInt(sc, "Enter Account Number: ");
            System.out.print("Enter Customer Name: ");
            String name = sc.next();

            double balance = readDouble(sc, "Enter Balance: ");
            float interest = readFloat(sc, "Enter Interest Rate: ");

            SavingAccount sa = new SavingAccount(accNo, name, balance, interest);
            savingAccounts.add(sa);
        }

        System.out.println("\nEnter 3 Current Accounts:");

        for (int i = 0; i < 3; i++) {

            System.out.println("\n Current Account " + (i + 1));

            int accNo = readInt(sc, "Enter Account Number: ");
            System.out.print("Enter Customer Name: ");
            String name = sc.next();

            double balance = readDouble(sc, "Enter Balance: ");
            double overdraft = readDouble(sc, "Enter Overdraft Limit: ");

            CurrentAccount ca = new CurrentAccount(accNo, name, balance, overdraft);
            currentAccounts.add(ca);
        }

        System.out.println("\n SAVING ACCOUNTS ");
        for (SavingAccount s : savingAccounts) {
            System.out.println(s.getAccountNumber() + " | " +
                               s.getCustomerName() + " | " +
                               s.getBalance());
        }

        System.out.println("\n CURRENT ACCOUNTS ");
        for (CurrentAccount c : currentAccounts) {
            System.out.println(c.getAccountNumber() + " | " +
                               c.getCustomerName() + " | " +
                               c.getBalance());
        }

        sc.close();
    }


    public static int readInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter integer value.");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter decimal value.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter float value.");
                sc.nextLine();
            }
        }
    }
}