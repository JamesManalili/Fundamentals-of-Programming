package fop;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Prompt the user for height in meters
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display the BMI
        System.out.println("Your BMI is: " + bmi);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
