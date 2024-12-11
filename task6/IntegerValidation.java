package task6;

import java.util.Scanner;

	public class IntegerValidation {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        try {
	            int number = Integer.parseInt(userInput);
	            System.out.println("The entered string is a valid integer: " + number);

	        } catch (NumberFormatException e) {
	            System.out.println("Error: The entered string is not a valid integer.");
	        }

	        scanner.close();
	    }
	}


