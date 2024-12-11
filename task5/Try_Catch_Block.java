package task5;

import java.util.Scanner;


public class Try_Catch_Block {

		public static void main(String[] args) {
			
			Scanner s =  new Scanner(System.in);
			System.out.println("enter a :");
			int a = s.nextInt();
			System.out.println("enter b :");
			int b = s.nextInt();
			
			try {
				int num = a/b;
				System.out.println(num);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
}
