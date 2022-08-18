package bankingapplication;

public class DisplayHandler implements Menu {

	EnglishDisplay englishDisplay = new EnglishDisplay();
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
		
		if (lang == Language.ENG) EnglishDisplay.displayAccountBalance(currency, balance);
		displayGap();
	}

	public void displayAccountMenu() {
		
		if (lang == Language.ENG) englishDisplay.displayAccountMenu();
		displayGap();
	}
	
	public void displayAccountNotFoundMessage() {
	
		if (lang == Language.ENG) englishDisplay.displayAccountNotFoundMessage();
		displayGap();
		
	}
	
	public void displayAppWelcome(String bankName) {
		
		if (lang == Language.ENG) 	englishDisplay.displayAppWelcome(bankName);
		displayGap();
	}
	
	public void displayLoggedOutMessage(String accountName) {
		
		if (lang == Language.ENG) 	englishDisplay.displayLoggedOutMessage(accountName);
		displayGap();
	}
	
	public void displayLoginMenu() {
		
		if (lang == Language.ENG) EnglishDisplay.displayCurrentLanugage();
		displayGap();
		if (lang == Language.ENG) 	englishDisplay.displayLoginMenu();
		displayGap();
	}
	
	public void displayQuitAppMessage() {
		
		if (lang == Language.ENG) englishDisplay.displayQuitAppMessage();
		
	}
	
	public void displayStartMenu() {
		
		if (lang == Language.ENG) EnglishDisplay.displayCurrentLanugage();
		displayGap();
		if (lang == Language.ENG) 	englishDisplay.displayStartMenu();
		displayGap();
	}
	
	public void displaySelectLanguageHeading() {
		
		if (lang == Language.ENG) 	englishDisplay.displaySelectLanguageHeading();
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
		if (lang == Language.ENG) 	englishDisplay.displayWelcomeLoggedCustomer(accountId, accountName);
		displayGap();
		
	}

	public void displayWrongInputMessage() {
			
			if (lang == Language.ENG) 	englishDisplay.displayWrongInputMessage();
			displayGap();
		}


}
