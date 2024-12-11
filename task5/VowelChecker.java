package task5;


	class NoVowelException extends Exception {
	    public NoVowelException(String message) {
	        super(message);
	    }
	}

	public class VowelChecker {

	    public static void checkForVowels(String input) throws NoVowelException {
	        String lowerCaseInput = input.toLowerCase();

	        if (!(lowerCaseInput.contains("a") || lowerCaseInput.contains("e") ||
	              lowerCaseInput.contains("i") || lowerCaseInput.contains("o") ||
	              lowerCaseInput.contains("u"))) {
	            throw new NoVowelException("The string does not contain any vowels.");
	        }
	    }

	    public static void main(String[] args) {
	        String[] testInputs = {"Hello", "Sky", "Try", "Beautiful"};

	        for (String input : testInputs) {
	            try {
	                System.out.println("Checking string: " + input);
	                checkForVowels(input); 
	                System.out.println("The string contains vowels.\n");
	            } catch (NoVowelException e) {
	                System.out.println("Exception: " + e.getMessage() + "\n");
	            }
	        }
	    }
	}


