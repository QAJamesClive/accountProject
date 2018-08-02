package code;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class Service {
	
	private Map<Integer,Account> hMapAccounts = new HashMap<>();

	public void addAccount(Account account) {
		hMapAccounts.put(account.getAccountNumber(), account);
	}
	
	public Account retrieveAccount(Integer key) {
		return hMapAccounts.get(key);
	}
	
	public JSONObject displayHashMap() {
		return new JSONObject(hMapAccounts);
	}
	
	public int countSameNameAccounts(String firstName) {
		int count =0;
		for(Map.Entry<Integer, Account> accounts : hMapAccounts.entrySet()){
			if((retrieveAccount(accounts.getKey()).getFirstName()).equals(firstName)) {
				count++;
			}
		}
		return count;
	}
	
}
