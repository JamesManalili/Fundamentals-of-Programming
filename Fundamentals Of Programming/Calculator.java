package fop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculation based on the operator
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Result: " + result);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
