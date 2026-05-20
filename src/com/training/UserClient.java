package com.training;

import java.util.Scanner;

public class UserClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input
        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User Email: ");
        String email = sc.nextLine();

        // creating object
        User user1 = new User(id, name, email);

        // static variable
        User.organizationName = "OAB";

        // displaying output
        System.out.println("\nUser Details");
        System.out.println("User ID: " + user1.getUserId());
        System.out.println("User Name: " + user1.getUserName());
        System.out.println("User Email: " + user1.getUseEmail());
        System.out.println("Organization: " + User.organizationName);

        sc.close();
    }
}