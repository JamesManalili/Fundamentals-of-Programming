package Javaactivity;

import java.util.Scanner;

public class CheckPositiveOrNegative {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		System.out.print("Enter Number: ");
		number = input.nextInt();
		if (number > 0) {
			System.out.println(number + " is a Positive Number");
		} else {
			System.out.println(number + " is Negative Number");
		}

	}

}
