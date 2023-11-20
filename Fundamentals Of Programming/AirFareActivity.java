package Javaactivity;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AirFareActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");

		//Declare input variables
		char custCode;
		String customer = "";
		double fare = 0.0, discRate = 0.0, business = 0.0, netFare = 0.0, discount = 0.0;
		String add = "";
		// Accepts the inputs of the program

		System.out.print("Enter fare amount: ");
		fare = input.nextDouble();

		System.out.print("Enter customer " + "code [O=Ordinary, S=Student, C=Senior Citizen]:");
		custCode = input.next().charAt(0);
		custCode = Character.toUpperCase(custCode);
		switch (custCode) {
		case 'O':
			customer = "ordinary";
			business = 1000;
			discRate = 0.0;
			System.out.print("Travelling in business class?[Y/N]:");
			custCode = input.next().charAt(0);
			switch (custCode) {
			case 'N':
				add = "No";
				business = 0;
			}
			break;

		case 'S':
			customer = "student";
			business = 700;
			discRate = 0.05;
			System.out.print("Travelling in business class?[Y/N]:");
			custCode = input.next().charAt(0);
			switch (custCode) {
			case 'N':
				add = "No";
				business = 0;
			}
			break;

		case 'C':
			customer = "senior citizen";
			business = 500;
			discRate = 0.1;
			System.out.print("Travelling in business class?[Y/N]:");
			custCode = input.next().charAt(0);
			switch (custCode) {
			case 'N':
				add = "No";
				business = 0;
			}
			break;

		default:
			System.out.println("\nInvalid Costumer code");
			return;
		}
		{
//Compute discount and net fare8
			discount = fare * discRate;
			netFare = fare - discount + business;
			System.out.println("\nDiscount is " + df.format(discount) + " dollars");
			System.out.println("Business class charge: " + df.format(business));
			System.out.println("Net fare is " + df.format(netFare) + " dollars");
		}
	}
}