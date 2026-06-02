package com.training.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.trainig.bank.Account;

public class AccountTest {
	@Test
	void testDeposit() {
		Account acct = new Account(1000);
		acct.deposit(500);
		assertEquals(1500,acct.displayBalalnce());
		//assertNotEqauls(1300,acct.displayBalalnce());
		
	}
	  @Test
	    void testWithdraw() {
	        Account acct = new Account(1000);
	        acct.withdraw(300);

	        assertEquals(700, acct.displayBalalnce());
	    }
	
	
}
