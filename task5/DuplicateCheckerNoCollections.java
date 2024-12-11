package task5;
import java.util.Scanner;
	class DuplicateNumberException extends Exception {
	    public DuplicateNumberException(String message) {
	        super(message);
	    }
	}
	public class DuplicateCheckerNoCollections {
	    public static void checkForDuplicates(int[] numbers, int count, int newNumber) throws DuplicateNumberException {
	        for (int i = 0; i < count; i++) {
	            if (numbers[i] == newNumber) {
	                throw new DuplicateNumberException("Duplicate number found: " + newNumber);
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] numbers = new int[100]; 
	        int count = 0;
	        System.out.println("Enter integers (type 'done' to finish):");
	        try {
	            while (true) {
	                String input = scanner.nextLine();
	                if (input.equalsIgnoreCase("done")) {
	                    break; 
	                }
	                try {
	                    int number = Integer.parseInt(input);

	                    checkForDuplicates(numbers, count, number);

	                    numbers[count] = number;
	                    count++;
	                } catch (DuplicateNumberException e) {
	                    System.out.println("Exception: " + e.getMessage());
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input. Please enter an integer.");
	                }
	            }
	            System.out.println("Numbers entered: ");
	            for (int i = 0; i < count; i++) {
	                System.out.print(numbers[i] + " ");
	            }
	        } finally {
	            scanner.close();
	        }
	    }
	}


