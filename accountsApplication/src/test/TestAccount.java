package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Account;


public class TestAccount {
	@Test
	public void testGetFirstName() {
		Account a = new Account("James","Clive" , 69);
		assertEquals("Error getting firstName","James",a.getFirstName());
	}
	@Test
	public void testSetFirstName() {
		Account a = new Account("James","Clive" , 69);
		a.setFirstName("Edward");
		assertEquals("Error setting firstName","Edward",a.getFirstName());
	}
	@Test
	public void testGetLastName() {
		Account a = new Account("James","Clive" , 69);
		assertEquals("Error getting lastName","Clive",a.getLastName());
	}
	@Test
	public void testSetLastName() {
		Account a = new Account("James","Clive" , 69);
		a.setLastName("Edward");
		assertEquals("Error setting lastName","Edward",a.getLastName());
	}
	@Test
	public void testGetAccountNumber() {
		Account a = new Account("James","Clive" , 69);
		assertEquals("Error getting lastName",69,a.getAccountNumber());
	}
	@Test
	public void testSetAccountNumber() {
		Account a = new Account("James","Clive" , 69);
		a.setAccountNumber(117);
		assertEquals("Error setting lastName",117,a.getAccountNumber());
	}
}
