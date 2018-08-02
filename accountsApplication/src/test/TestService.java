package test;

import static org.junit.Assert.*;

import java.util.Map;

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
	@Test
	public void testDisplayHashMap() {
		Service s = new Service();
		Account a = new Account("James", "Clive", 69);
		s.addAccount(a);
		boolean b = s.displayHashMap().toString().equalsIgnoreCase("{\"69\":{\"lastName\":\"Clive\",\"firstName\":\"James\",\"accountNumber\":69}}");
		b = b || s.displayHashMap().toString().equalsIgnoreCase("{\"69\":{\"firstName\":\"James\",\"lastName\":\"Clive\",\"accountNumber\":69}}");
		assertTrue("Testing the hashmap to Json function",b);

	}
	@Test
	public void testCountSameNameAccounts() {
		Service s = new Service();
		Account a = new Account("James", "Clive", 69);
		s.addAccount(a);
		assertEquals("Testing the retrive", 1,s.countSameNameAccounts("James"));
	}
}
