package bankingapplication;

public class Application {

	Account currentAccount;
	DisplayHandler display = new DisplayHandler();
	private Language displayLanguage;
	private int menuOption = 0;
	final static String BankName = "Flamez Bank";
	//Display All Accounts in the Database
	public void displayAllAccounts() {
		
		DisplayHandler.displayGap();
		
		for(String accountDetails: Database.produceAccountsList()) {
			
			System.out.println(accountDetails);
		}
		
		DisplayHandler.displayGap();
	}
	//Get Display Language
	public Language getDisplayLanguage() {
			
			return this.displayLanguage;
		} 
	//Login to Customer Account
	public void loginAccount() {
		
		display.displayWelcomeLoggedCustomer(currentAccount.getCustomerId(), currentAccount.getUsername());
	}
	//Select Display Language
	public void selectLanguage() {
		
		display.displaySelectLanguageHeading();
		int langOption = InputHandler.menuSelector(2);
		
		switch (langOption) {
		
		case 1:
			displayLanguage = Language.ENG;
			EnglishDisplay.displayLanguageChoice();
			display.setLanguage(displayLanguage);
			break;
			
		case 2:
			displayLanguage = Language.DEU;
			display.setLanguage(displayLanguage);
			System.out.println("Sie haben Deutsch gewählt!");
			break;
			
			}
		}
	//Start Account Menu	
	private void startAccountMenu() {
		
		display.displayAccountMenu();
		menuOption = InputHandler.menuSelector(5);
		
		switch(menuOption) {
		
		case 1: 
			display.displayAccountBalance(currentAccount.getRefCurrency(), currentAccount.getBalance());
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			display.displayLoggedOutMessage(currentAccount.getUsername());
			currentAccount = null;
			break;
		}
	}
	//Start Login Process
	public void startLoginProcess() {
	
		String username;
		display.displayLoginMenu();
		username = InputHandler.recordTextInput();
		currentAccount = Database.getUsernameAccount(username);
		
		if (currentAccount == null) {
			display.displayAccountNotFoundMessage();
		} else {
			this.loginAccount();
			this.startAccountMenu();
		}				
	}
	//Start Main Menu
	public void startMainMenu() {
		
		boolean hasQuit = false;
		
		while (!hasQuit) {
			
			display.displayStartMenu();
				
			menuOption = InputHandler.menuSelector(5);
			
			switch(menuOption) {
			
			case 1:
				this.startLoginProcess();			
				break;
				
			case 2:
				break;
				
			case 3:
				this.displayAllAccounts();
				break;
				
			case 4:
				hasQuit = true;
				display.displayQuitAppMessage();
				break;
			case 5:
				this.selectLanguage();
			}
			
			menuOption = 0;
		}
		
	}
	//Start Application Methods
	public void startUpApplication() {
		
		Database.exportAccounts();
		display.displayAppWelcome(BankName);
		this.selectLanguage();
		this.startMainMenu();
	}
	
	public static void main(String[] args) {
	
		Application app = new Application();
		app.startUpApplication();
	}

}
