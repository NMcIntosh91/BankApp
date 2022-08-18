package bankingapplication;

import java.util.Scanner;

public class InputHandler {

	static Scanner scanner;
	private static DisplayHandler warningDisplay = new DisplayHandler(); 
	static int userInput = 0;
	
	public static int menuSelector(int limit) {
		
		int userInput = 0;
		
		while (userInput <= 0 || userInput > limit) {
			
			try {
				
				scanner = new Scanner(System.in);
				userInput = scanner.nextInt();
				
				if (userInput <= 0 || userInput > limit) {
					
					 warningDisplay.displayWrongInputMessage();
					
					}
				
			} catch (Exception e) {
				
				 warningDisplay.displayWrongInputMessage();
			}

		}
			
		return userInput;
	}
	
	public static String recordTextInput() {
		
		scanner = new Scanner(System.in);
		String userInput = null;
		userInput = scanner.nextLine();
		
		return userInput;
		
	}
}
