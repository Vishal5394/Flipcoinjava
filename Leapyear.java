package core_program;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner LP = new Scanner(System.in);
		System.out.println("Enter the Year in 4 digit");
		int n=LP.nextInt();
		if ( n % 4 == 0 && n > 999)
			System.out.println(n+" is leap year");
		else if(n % 4 != 0 && n > 999)
			System.out.println(n+ " is not leap year");
		else
			System.out.println("error! please enter 4 digit no");
	}

}
