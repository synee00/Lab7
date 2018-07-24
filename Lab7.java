/*Jasmine S. Allen
 * July 23, 2018
 * Program: The program will validate different kinds of input. 
 * 			
 * Build Specs: 1. Write a method that will validate names. Names can only have alphabets,
 * 					they should start with a capital letter, and they have a maximum length of 30. First name.
 * 				2. Write a method that will validate emails. An email should be in the 
 * 					following format:{combination of alphanumeric characters, with a length
 * 					between 5 and 30, and there are no special characters} @ {combination of alphanumeric characters, 
 * 					with a length between 5 and 10, and there are no special characters} . {domain can be combination of alphanumeric
 * 					characters with a length of two or three}
 * 				3. Write a method that will validate phone numbers. A phone number should 
 * 					be in the following format: {area code of 3 digits} - {3 digits} - {4 digits}
 * 				4. Write a method that will validate date based on the following format: 
 * 					(dd/mm/yyyy).
 * 					
 * 	
 *  ***With extended challenges? NO
 */
import java.text.*;
import java.util.*;

public class Lab7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Validate name
		String name = validateName(scan, "Please enter your name: ", "[a-zA-Z\\s\\']{0,30}");
		//Validate email
		String email = validateEmail(scan, "Please enter your email address: ", "^[a-zA-Z0-9]{0,30}@[a-zA-Z0-9]{5,10}\\.[a-zA-Z]{0,3}$");

		//Validate phone number
		String phone = validatePhoneNumber(scan, "Please enter your phone number (###-###-####): ", "[0-9]{3}\\-[0-9]{3}\\-[0-9]{4}");

		//Validate date
		String date = validateDate(scan, "Please enter today's date (dd/mm/yyyy): ", "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$");

	}
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}
	public static String validateName(Scanner scan, String prompt, String regex)
	{
		boolean isValid = false;
		String input;
		do {
			input = getString(scan, prompt);
			
			if (input.matches(regex)) {
				isValid = true;
				System.out.println(input + " is valid");
			}else {
				System.out.println("Sorry, what you have entered is not valid!");
				isValid = false;
			}
			
		} while (!isValid);
		return input;
		
	}
	public static String validateEmail(Scanner scan, String prompt, String regex)
	{
		String input = null;
		boolean isValid = false;
		int index = 0, index2, index3;

		do {
			input = getString(scan, prompt);
			
			
			if (input.matches(regex)) {
				isValid = true;
				System.out.println(input + " is valid");
			} else if (input.length() > 30){
				System.out.println("Sorry, you have entered too many characters.");
				isValid = false;
			}else {
				System.out.println("Sorry, what you have entered is not valid!");
				isValid = false;
			}
			
				
			}while(!isValid);
			return input;
		
	}
	public static String validatePhoneNumber(Scanner scan, String prompt, String regex)
	{
		String input = null;
		boolean isValid = false;

		do {
			input = getString(scan, prompt);
			
			
			if (input.matches(regex)) {
				isValid = true;
				System.out.println(input + " is valid");
			}else {
				System.out.println("Sorry, what you have entered is not valid! Please enter a number according to the format given.");
				isValid = false;
			}
			
				
			}while(!isValid);
		
			return input;
	}
	public static String validateDate(Scanner scan, String prompt, String regex)
	{
		String input = null;
		boolean isValid = false;

		do {
			input = getString(scan, prompt);
			
			
			if (input.matches(regex)) {
				isValid = true;
				System.out.println(input + " is valid");
				
			}else {
				System.out.println("Sorry, what you have entered is not valid! Please enter a date according to the format given.");
				isValid = false;
			}
			
				
			}while(!isValid);
		
		
		return input;

	}
}
