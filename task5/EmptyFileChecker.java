package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

		class EmptyFileException extends Exception {
		    public EmptyFileException(String message) {
		        super(message);
		    }
		}

		public class EmptyFileChecker {

		    public static void checkIfFileIsEmpty(String filePath) throws FileNotFoundException, EmptyFileException {
		        File file = new File(filePath);
		        Scanner scanner = new Scanner(file);

		        if (!scanner.hasNext()) {
		            scanner.close();
		            throw new EmptyFileException("The file is empty!");
		        }

		        System.out.println("File is not empty. Content is:");
		        while (scanner.hasNextLine()) {
		            System.out.println(scanner.nextLine());
		        }
		        scanner.close();
		    }

		    public static void main(String[] args) {
		        String filePath = " "; 

		        try {
		            checkIfFileIsEmpty(filePath);
		        } catch (FileNotFoundException e) {
		            System.out.println(e);
		        } catch (EmptyFileException e) {
		            System.out.println("Exception: " + e.getMessage());
		        }
		    }
		}


	