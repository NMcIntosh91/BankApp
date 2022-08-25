package bankingapplication;

public class DeutschDisplay implements Menu {

	@Override
	public void displayAccountBalance(Currency currency, double balance) {
		
		System.out.println("Kontostand: " + balance + " " + currency);
	}
	
	@Override
	public void displayAccountMenu() {
	
		System.out.println("KONTO MENÜ");	
		DisplayHandler.menuBreaker();
		System.out.println("1 - Balance Prüfen");
		System.out.println("2 - Einzahlen");
		System.out.println("3 - Abheben");
		System.out.println("4 - Letze Transaktionen anzeigen");
		System.out.println("5 - Sich ausloggen");
	}

	@Override
	public void displayAccountNotFoundMessage() {
		
		System.out.println("Dieses Konto als nicht gefunden.");
	}

	@Override
	public void displayAppWelcome(String bankName) {
		
		System.out.println("Willkommen bei der Bank von " + bankName + ".");
	}
	
	public void displayCreateUsernameMessage() {
		
		System.out.print("Bitte erstellen Sie einen Benutzernamen: ");
	}
	
	public void displayCurrentLanguage() {
		
		System.out.print("Spar: " + Language.DEU + " ");
	}

	@Override
	public void displayLoggedOutMessage(String accountName) {
		
		System.out.println(accountName + " hatte beschlossen, sich auszuloggen.");
	}

	@Override
	public void displayLoginMenu() {
		
		System.out.println("LOGIN MENU");
		DisplayHandler.menuBreaker();
		System.out.print("Sehr geehrter Kunde. Bitte geben Sie Ihren Benutzernamen ein: ");
	}

	@Override
	public void displayQuitAppMessage() {
		
		System.out.print("Sie haben ausgewählt, diese Anwendung zu schließen. Vielen Dank und auf Wiedersehen!");
	}

	@Override
	public void displayStartMenu() {
		
		System.out.println("HAUPTMENÜ");
		DisplayHandler.menuBreaker();
		System.out.println("1 - Login Konto");
		System.out.println("2 - Konto erstellen");
		System.out.println("3 - Kontonamen anzeigen");
		System.out.println("4 - Anwendung beenden");
		System.out.println("5 - Sprache ändern");
		
	}

	@Override
	public void displaySelectLanguageHeading() {
		
		System.out.println("Bitte wählen Sie die gewünschte Sprache:");
		
		int index = 0;
		
		for(Language lang : Language.values()) {
			
			index++;
			System.out.println(index + " - " + lang);
		}
		
	}
	
	@Override
	public void displayWelcomeLoggedCustomer(String cid, String accountName) {
	
		System.out.println("Willkommens-Kunden-ID: " + cid + ". "+ accountName + "!");
	}

	@Override
	public void displayWrongInputMessage() {
		
		System.out.print("Bitte geben Sie die richtige Option ein.");
	}
 
}
