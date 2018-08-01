package code;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer,Account> hMapAccounts = new HashMap<>();

	public void addAccount(Account account) {
		hMapAccounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount(Integer key) {
		return hMapAccounts.get(key);
	}
}
