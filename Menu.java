package bankingapplication;

public interface Menu {

	public void displayAccountMenu();
	public void displayAccountNotFoundMessage();
	public void displayAppWelcome(String bankName);
	public void displayLoggedOutMessage(String accountId);
	public void displayLoginMenu();
	public void displayQuitAppMessage();
	public void displayStartMenu();
	public void displaySelectLanguageHeading();
	public void displayWrongInputMessage();
	
}
