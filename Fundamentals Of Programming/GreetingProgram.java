package fop;

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print a greeting along with the age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
