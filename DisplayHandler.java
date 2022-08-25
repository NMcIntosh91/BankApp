package bankingapplication;

public class DisplayHandler implements Menu {

	EnglishDisplay englishDisplay = new EnglishDisplay();
	DeutschDisplay germanDisplay = new DeutschDisplay();
	protected Language lang;
	
	public DisplayHandler() {
		
		lang = Language.ENG;
	}
	
	public DisplayHandler(Language newLang) {
			
			lang = newLang;
		}
	
	public static void displayGap() {
		
		System.out.println("\n");
	}
	
	public void displayAccountBalance(Currency currency, double balance) {
		
		if (lang == Language.ENG) englishDisplay.displayAccountBalance(currency, balance);
		if (lang == Language.DEU) germanDisplay.displayAccountBalance(currency, balance);
		displayGap();
	}

	public void displayAccountMenu() {
		
		if (lang == Language.ENG) englishDisplay.displayAccountMenu();
		if (lang == Language.DEU) germanDisplay.displayAccountMenu();
		displayGap();
	}
	
	public void displayAccountNotFoundMessage() {
	
		if (lang == Language.ENG) englishDisplay.displayAccountNotFoundMessage();
		if (lang == Language.DEU) germanDisplay.displayAccountNotFoundMessage();
		displayGap();
		
	}
	
	public void displayAppWelcome(String bankName) {
		
		if (lang == Language.ENG) englishDisplay.displayAppWelcome(bankName);
		if (lang == Language.DEU) germanDisplay.displayAppWelcome(bankName);
		displayGap();
	}
	
	public void displayCreateUsernameMessage() {
		
		if (lang == Language.ENG) englishDisplay.displayCreateUsernameMessage();
		if (lang == Language.DEU) germanDisplay.displayCreateUsernameMessage();
		displayGap();
	}
	
	public void displayLoggedOutMessage(String accountName) {
		
		if (lang == Language.ENG) 	englishDisplay.displayLoggedOutMessage(accountName);
		if (lang == Language.DEU) 	germanDisplay.displayLoggedOutMessage(accountName);
		displayGap();
	}
	
	public void displayLoginMenu() {
		
		if (lang == Language.ENG) {
			
			englishDisplay.displayCurrentLanguage(); 
			displayGap(); 
			englishDisplay.displayLoginMenu();
		}
		if (lang == Language.DEU) {
			
			germanDisplay.displayCurrentLanguage(); 
			displayGap(); 
			germanDisplay.displayLoginMenu();
		}
	}
	
	public void displayQuitAppMessage() {
		
		if (lang == Language.ENG) englishDisplay.displayQuitAppMessage();
		if (lang == Language.DEU) germanDisplay.displayQuitAppMessage();
		
	}
	
	public void displayStartMenu() {
		
		if (lang == Language.ENG) {
			
			englishDisplay.displayCurrentLanguage(); 
			displayGap(); 
			englishDisplay.displayStartMenu();
		}
		
		if (lang == Language.DEU) {
			
			germanDisplay.displayCurrentLanguage(); 
			displayGap(); 
			germanDisplay.displayStartMenu();
		}
	}
	
	public void displaySelectLanguageHeading() {
		
		displayGap();
		if (lang == Language.ENG) englishDisplay.displaySelectLanguageHeading();
		if (lang == Language.DEU) germanDisplay.displaySelectLanguageHeading();
		displayGap();
		
	}
	
	public static void menuBreaker() {
		
		System.out.println("=========");
	}
	
	public void setLanguage(Language newLang) {
		
		this.lang = newLang;
	}

	public void displayWelcomeLoggedCustomer(String accountId, String accountName) {
		
		displayGap();
		if (lang == Language.ENG) englishDisplay.displayWelcomeLoggedCustomer(accountId, accountName);
		if (lang == Language.DEU) germanDisplay.displayWelcomeLoggedCustomer(accountId, accountName);
		displayGap();
		
	}

	public void displayWrongInputMessage() {
			
			if (lang == Language.ENG) englishDisplay.displayWrongInputMessage();
			if (lang == Language.DEU) germanDisplay.displayWrongInputMessage();
			displayGap();
		}


}
