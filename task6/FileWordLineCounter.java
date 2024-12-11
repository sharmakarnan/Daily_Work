package task6;

import java.io.*;
import java.util.Scanner;
	

public class FileWordLineCounter {

	public static void main(String[] args) {
		        String fileName = "example.txt";

		        try {
		            FileWriter writer = new FileWriter(fileName);
		            writer.write("Hello World!\n");
		            writer.write("This is a test file.\n");
		            writer.write("It contains multiple lines and words.\n");
		            writer.close();
		            System.out.println("File created and written successfully.");

		            File file = new File(fileName);
		            Scanner scanner = new Scanner(file);

		            int lineCount = 0;
		            int wordCount = 0;

		            while (scanner.hasNextLine()) {
		                String line = scanner.nextLine();
		                lineCount++; 

		                String[] words = line.split("\\s+");
		                wordCount += words.length;
		            }

		            scanner.close();

		            System.out.println("Total Lines: " + lineCount);
		            System.out.println("Total Words: " + wordCount);

		        } catch (IOException e) {
		            System.out.println("An error occurred: " + e.getMessage());
		        }
		    }
		
     }


