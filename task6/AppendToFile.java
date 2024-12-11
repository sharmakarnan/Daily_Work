package task6;

	
import java.io.*;

	public class AppendToFile {

	    public static void main(String[] args) {
	        String fileName = "data.txt";
	        String contentToAppend = "Java Programming is versatile!";

	        try (FileWriter fileWriter = new FileWriter(fileName, true);
	             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
	            
	            bufferedWriter.newLine(); 
	            bufferedWriter.write(contentToAppend);
	            System.out.println("Content appended successfully to " + fileName);

	        } catch (IOException e) {
	            System.out.println("An error occurred while appending to the file: " + e.getMessage());
	        }
	    }
	}



