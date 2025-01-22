package studio1;

import java.util.Scanner;

public class LeapYear_class {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter year.");
		int n1 = in.nextInt();
		int LeapYear = n1 % 4;
		int divisible = n1 % 100;
		int exception = n1 % 400;
		boolean TrueFalse = LeapYear == 0 && divisible != 0 || exception == 0;
		System.out.println (n1 + " is a leap year:" + TrueFalse);
		// TODO Auto-generated method stub

	}

}
