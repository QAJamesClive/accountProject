package test;

public class TestHarness {

	public static void main(String[] args) {
		TestAccount tAcc = new TestAccount();
		TestApp tApp = new TestApp();
		TestService tSer = new TestService();
		
		tAcc.testGetAccountNumber();
		tAcc.testGetFirstName();
		tAcc.testGetLastName();
		tAcc.testSetAccountNumber();
		tAcc.testSetFirstName();
		tAcc.testSetLastName();
		
		tApp.testHelloWorld();
		
		tSer.testGetAccount();
	}

}
