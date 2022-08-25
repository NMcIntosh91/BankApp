package bankingapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Database {

	static DisplayHandler display = new DisplayHandler();
	private static HashMap<String, Account> accounts = new HashMap<String, Account>();
	private static int customerCount;
	
	private static void addToCount() {
		
		customerCount++;
	}
	
	public static void createAccount() {
		
		display.displayCreateUsernameMessage();
		String newUsername = InputHandler.recordTextInput();
		//CHECK IF USERNAME ALREADY EXISTS
		addToCount();
		Account newAccount = new Account(newUsername, String.valueOf(customerCount));
		accounts.put(newUsername, newAccount);
	}
	
	public static void exportAccounts() {
		
		Account newAccount;
		String [] customers = {"MarshallLaw", "PaulPhoenix", "SteveFox"};
		
		for(String customer: customers) {
			
			newAccount = new Account(customer, String.valueOf(customerCount));
			accounts.put(customer, newAccount);
			addToCount();
		}
	}

	public static Account getUsernameAccount(String username) {
		
		Account usernameAccount;
		usernameAccount = accounts.get(username);
		return usernameAccount;
	}
	
	public static String[] produceAccountsList() {
		
	 String accountsList [] = new String[accounts.size()];
	 int listCount = 0;
	 
	 for(String username: accounts.keySet()) {
		 
		 accountsList[listCount] = accounts.get(username).getCustomerId() + ": " + username;
		 listCount++;
	 }
		
		return accountsList;
	}
	
	public static LocalDateTime setOpeningDate() {
		
		DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		return now;
	}
}
