package task6;

	
	public class MultipleExceptionsHandling {

	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30};
	        int numerator = 50;
	        int denominator = 0; 
	        int index = 5;      

	        try {
	            int result = numerator / denominator;
	            System.out.println("Division Result: " + result);

	            System.out.println("Array Element: " + numbers[index]);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero. " + e.getMessage());

	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Invalid array index. " + e.getMessage());
	        }

	        System.out.println("Program execution completed.");
	    }
	}



