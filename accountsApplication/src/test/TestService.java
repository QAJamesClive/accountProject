package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Account;
import code.Service;

public class TestService {
	@Test
	public void testGetAccount() {
		Service s = new Service();
		Account a = new Account("James", "Clive", 69);
		s.addAccount(a);
		assertEquals("Testing the retrive", a,s.retrieveAccount(69));
	}
}
