package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class Number_is_Positive {

    public static void checkNumbersInFile(String filePath) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        System.out.println("Reading numbers from the file...");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Number found: " + number);

                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            } else {
                scanner.next();
            }
        }
        System.out.println("All numbers in the file are non-positive.");
        scanner.close();
    }

    public static void main(String[] args) {
        String filePath = "numbers.txt"; 

        try {
            checkNumbersInFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (PositiveNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
