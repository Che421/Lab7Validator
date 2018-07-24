import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userName;
		String phoNum = null;
		String eMail = null;
		String date = null;

		do {
			System.out.println("Please enter a name for validation: ");
			userName = input.nextLine();

			validateName(userName);

		} while (userName.matches("[a-zA-Z]"));

		System.out.println("Please enter an email for validation: ");
		eMail = input.nextLine();

		emailVal(eMail);

		System.out.println("Please enter an phone number for validation: ");
		phoNum = input.nextLine();
		phoValid(phoNum);
		
		
		System.out.println("Please enter a date for validation");
		date = input.nextLine();
		dateVal(date);
		
		System.out.println("Thank you for using Validator!");
		input.close();
	}

	private static void dateVal(String date) {
		if(date.matches("[0-9]{1,2}(/|-)[0-9]{1,2}(/|-)[0-9]{4}"))   {
			System.out.println(date + " is a valid date");
		}else   {
			System.out.println("Invalid date");
		}
	}	

	private static void emailVal(String eMail) {
			if(!eMail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			System.out.println("Invalid e-mail");
				}else {
					System.out.println(eMail + " is a valid email");
				}
	}

	private static void phoValid(String phoNum) {
		if(!phoNum.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
			System.out.println("Invalid phone number");
					}else {
						System.out.println("Valid phone number");
					}
	}

	private static void validateName(String userName) {
		if (userName.length() <= 30 && Character.isUpperCase(userName.charAt(0))) {
			System.out.println(userName + " is a valid name");
		} else {
			System.out.println("Invalid name");
		}

	}

}
