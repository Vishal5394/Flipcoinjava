package core_program;

import java.util.Scanner;

public class Powerof2jav {

	public static void main(String[] args) {
		Scanner PO = new Scanner(System.in);
		System.out.println("enter the power");
		int num1 = PO.nextInt();
		int num=2;
		double poweoftwo = Math.pow(num, num1);
		System.out.println("power of 2^"+ num1 + " = "+ poweoftwo);
		PO.close();

	}

}
