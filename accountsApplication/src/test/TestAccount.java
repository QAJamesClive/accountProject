package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Account;


public class TestAccount {
	Account a = new Account("James","Clive" , 69);
	
	@Test
	public void testGetFirstName() {
		assertEquals("Error getting firstName","James",a.getFirstName());
	}
	@Test
	public void testSetFirstName() {
		a.setFirstName("Edward");
		assertEquals("Error setting firstName","Edward",a.getFirstName());
	}
	@Test
	public void testGetLastName() {
		assertEquals("Error getting lastName","Clive",a.getLastName());
	}
	@Test
	public void testSetLastName() {
		a.setLastName("Edward");
		assertEquals("Error setting lastName","Edward",a.getLastName());
	}
	@Test
	public void testGetAccountNumber() {
		assertEquals("Error getting lastName",69,a.getAccountNumber());
	}
	@Test
	public void testSetAccountNumber() {
		a.setAccountNumber(117);
		assertEquals("Error setting lastName",117,a.getAccountNumber());
	}
}
