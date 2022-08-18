package bankingapplication;

import java.time.LocalDateTime;

public class Account {

	private String username;
	private String customerId;
	private LocalDateTime openingDate;
	private double balance;
	private Currency refCurrency;
	private Language chosenLanguage;
	
	
	public Account(String name, String cId) {
		
		this.username = name;
		this.customerId = cId;
		this.openingDate = Database.setOpeningDate();
		this.balance = 0.00;
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public Language getChosenLanguage() {
	
		return chosenLanguage;
	}

	public String getCustomerId() {
	
		return customerId;
	}
	
	public LocalDateTime getOpeningDate() {
		
		return openingDate;
	}
	
	public Currency getRefCurrency() {
		
		return refCurrency;
	}


	public String getUsername() {
		
		return username;
	}
	
	
}
