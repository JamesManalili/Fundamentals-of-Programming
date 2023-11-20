package Javaactivity;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MetricConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		// Declaration of variables
		double kilo = 1, grams = 1, kilo_pounds = 2.205, pounds_kilo = 0.454, ounces_grams = 28.35;
		double grams_ounces = 0.035, value;
		String name = "";
		String convertion = "";
		System.out.print("Hi! What is your name: \n");
		name = input.nextLine();
		System.out.println("\n====Metric Conversion====");
		System.out.println("Alright " + (name) + " , choose the letter of coversion: " + "\n[a] kg to pounds"
				+ "\n[b] pounds to kg" + "\n[c] ounces to grams" + "\n[d] grams to ounces");
		System.out.print("\nInput for Convertion: ");
		convertion = input.next();
		// computing the converion, formula, method or process
		if (convertion.equals("a")) {
			convertion = "kg to pounds";
			System.out.println("You have chosen " + convertion);
			System.out.print("\nInput the Value: ");
			value = input.nextDouble();
			kilo = value * pounds_kilo;
			System.out.println("The " + df.format(value) + " kg is " + df.format(kilo) + " in pounds");
		} else if (convertion.equals("b")) {
			System.out.println("You have chosen " + convertion);
			System.out.print("\nInput the Value: ");
			value = input.nextDouble();
			System.out.println("The " + df.format(value) + " pounds is" + df.format(pounds_kilo) + "in kilo");
		} else if (convertion.equals("c")) {
			System.out.println("You have chosen " + convertion);
			System.out.print("\nInput the Value: ");
			value = input.nextDouble();
			System.out.println("The " + df.format(value) + "ounces is " + df.format(ounces_grams) + " in grams");
		} else if (convertion.equals("d")) {
			System.out.println("You have chosen " + convertion);
			System.out.print("\nInput the Value: ");
			value = input.nextDouble();
			System.out.println("The " + df.format(value) + "grams is " + df.format(grams_ounces) + "in ounces");
		} else {
			System.out.println("Invalid type of conversion,Try Again");
		}
	}
}
