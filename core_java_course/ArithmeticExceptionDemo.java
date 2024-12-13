//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package java_programs;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Try to divide
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Handle division by zero
            System.out.println("Error: You cannot divide by zero!");
        }
        scanner.close(); // Close the scanner
    }
}

//Output:-
//Enter the numerator: 10
//Enter the denominator: 2
//Result: 5
