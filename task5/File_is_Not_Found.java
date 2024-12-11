package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_is_Not_Found {

	public static void main(String[] args) {
		String filepath = "example.txt";
		
		try {
			fileIsNotFound(filepath);
		} catch(FileNotFoundException e) {
			System.out.println(e + "When file is not found");
		}
		
		
	}

	private static void fileIsNotFound(String filepath) throws FileNotFoundException{
           File file = new File(filepath);
   		  Scanner sc = new Scanner(file);
   		  
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}
