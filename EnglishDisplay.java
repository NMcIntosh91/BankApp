package bankingapplication;

import java.util.Scanner;

public class EnglishDisplay implements Menu {

	static Scanner customerInput = new Scanner(System.in);
	
	public static void displayAccountBalance(Currency currency, double balance) {
		
		System.out.println("Account Balance: " + balance + " " + currency);
	}
	
	public void displayAccountMenu() {
		
		System.out.println("ACCOUNT MENU");	
		DisplayHandler.menuBreaker();
		System.out.println("1 - Check Balance");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println("4 - Display Last Transcations");
		System.out.println("5 - Log Out");
	}
	
	public void displayAccountNotFoundMessage() {
			
		System.out.println("This account was not found.");
	}
	
	public void displayAppWelcome(String bankname) {
		
		System.out.println("Welcome to the Bank of " + bankname + "!");
		
	}
	
	public static void displayCurrentLanugage() {
			
			System.out.print("Lang: " + Language.ENG + " ");
	}
	
	public static void displayLanguageChoice() {
		
		System.out.println("You have selected English!");
		DisplayHandler.displayGap();
		//System.out.println("Sie haben Deutsch gewählt!");
	}

	public void displayLoggedOutMessage(String accountName) {
		System.out.println(accountName + " has decided to log out. Good Bye");
		
	}
	
	public void displayLoginMenu() {
		
		System.out.println("LOGIN MENU");
		DisplayHandler.menuBreaker();
		System.out.print("Dear Customer. Please enter your Username: ");
	}
	
	public void displayQuitAppMessage() {
		
		System.out.print("You have selected close this Application. Thank you and Goodbye!");
	}
	
	public void displaySelectLanguageHeading() {
		
		System.out.println("Please select your desired Language:");
		
		int index = 0;
		
		for(Language lang : Language.values()) {
			
			index++;
			System.out.println(index + " - " + lang);
		}
	}

	public void displayStartMenu() {
			
			System.out.println("MAIN MENU");
			DisplayHandler.menuBreaker();
			System.out.println("1 - Login Account");
			System.out.println("2 - Create Account");
			System.out.println("3 - Display Account Names");
			System.out.println("4 - Quit Application");
			System.out.println("5 - Change Language");
		}
	
	public void displayWrongInputMessage() {
		
		System.out.print("Please enter a correct option.");
	}

	public void displayWelcomeLoggedCustomer(String cid, String name) {
	
		System.out.println("Welcome Customer ID: " + cid + ". "+ name + "!");
	
	}	
}
