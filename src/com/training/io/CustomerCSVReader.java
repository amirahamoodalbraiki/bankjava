package com.training.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerCSVReader {
	public static void main(String[] args) throws IOException {
		FileReader file = null;
		BufferedReader br = null;
		FileWriter filew= null;
		BufferedWriter bw = null;
		try {
		
		file = new FileReader("customer.csv");
		br = new BufferedReader(file);
		filew = new FileWriter("male_customer.csv");
		bw = new BufferedWriter(filew);
		bw.write("customer_id, customer_name, gender, city");
		bw.newLine();
		br.readLine();
		String line;
		while((line =br.readLine())!=null) {
			//line="C101,Sara,Female,Muscat";
			String[] data = line.split(",");
			customer Customer = new customer(data[0],data[1],data[2],data[3]);
			System.out.println(Customer);
		}
		br.readLine();
	}
	
	catch(FileNotFoundException e) {
		System.out.println("File is not available or incorrect");
		e.printStackTrace();
	}
		
	finally {
		file.close();
		br.close();
			}
		
	}
}