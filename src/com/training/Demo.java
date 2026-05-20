package com.training;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // While loop condition
        int i = 0;

        while (true) {
        	System.out.println("Enter X to exit pr any other key to continue");
        	String choice =sc.nextLine();
        	if(choice.equalsIgnoreCase("X")) {
        		break;
        	}
            i++;

            System.out.print("Enter customer first name " + i + ": ");
            String customerFirstName = sc.nextLine();

            System.out.print("Enter customer last name " + i + ": ");
            String customerLastName = sc.nextLine();

            System.out.print("Enter customer age " + i + ": ");
            int customerAge = sc.nextInt();

            sc.nextLine();

            System.out.println
            ("Customer Detailss -> Name: "+ customerFirstName + " "+ customerLastName+ ", Age: " + customerAge);

            for(int j=0; j<3;j++) {
            	System.out.println("Number of iteration:" +j+1);
            }
            int k=0;
            do {
            	System.out.println("inside do while loop");
            	k++;
            	
            }while(k<3);
            
            
            
            // if condition
            if (customerAge >= 18) {
                System.out.println("Eligible to open an account");
            } else {
                System.out.println("Not eligible to open an account");
            }
        }

        sc.close();
    }
}

// import shortcut:control+shift+o
// Java is a strongly typed language
// variable is a placeholder pointing to a memory location
// next() -> will take single string without space
//nextInt()-> to input integer values
//now add this take the customer details from user using sacanner
//class and check if the customer is more than 18 then display eligible to open an account
//Create variables that store customer first name,
//customer last name, and customer age,
//then display all details in a single line.
