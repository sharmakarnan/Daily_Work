package task5;

import java.util.Scanner;

class OddException extends Exception{
	public OddException(String message){
		super(message);
	}
}

public class Number_is_Odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int a = sc.nextInt();

		try {
			numberIsOdd(a);
		} catch (OddException e) {
			System.out.println("exception caught : " + e);
		}
	}

	private static void numberIsOdd(int a) throws OddException{
		if(a % 2 == 1) {
			throw new OddException("When number is Odd");
		}else {
			System.out.println(a);
		}
		
	}


}
