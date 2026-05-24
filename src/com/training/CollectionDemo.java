package com.training;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CollectionDemo {

	public static void main(String[] args) {
		Set<String> names =new HashSet<>();
		names.add("Zara");
		names.add("Tina");
		names.add("Sayeed");
	//	names.add(23);
		Iterator it = names.iterator();
		while (it.hasNext()) {
			String name = (String)it.next();
		System.out.println(name);
		


	}
		
		
		Set<User>userSet = new HashSet<>();
		User user1 = new User("A101","Gaith","abc@maol.com");
		User user2 = new User("A102","Anwar","sdf@maol.com");
		User user3 = new User("A103","Ayuub","gjf@maol.com");
		User user4 = new User("A104","Rohan","rho@maol.com");
		User user5 = new User("A104","Rohan","rho@maol.com");

		userSet.add(user1);
		userSet.add(user2);
		userSet.add(user3);
		userSet.add(user4);
		userSet.add(user5);

		
		
		for(User user:userSet) {
			System.out.println(user);
		}


		
		
		

		
		
		
		
		
	}
}
