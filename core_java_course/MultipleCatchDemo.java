//2.Write a program demonstrating multiple catch statements and finally block.

package java_programs;

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user for input
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            // Perform division
            int result = number / divisor;
            System.out.println("Result: " + result);

            // Simulate an array operation
            int[] numbers = {1, 2, 3};
            System.out.println("Array element: " + numbers[5]); // Will cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            // Catch division by zero
            System.out.println("Error: Division by zero is not allowed!");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch invalid array access
            System.out.println("Error: Array index is out of bounds!");
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        } finally {
            // The finally block always executes
            System.out.println("The program is completed here");
            scanner.close(); // Close the scanner
        }
    }
}

//Output:-
//Enter a number: 15
//Enter a divisor: 3
//Result: 5
//Error: Array index is out of bounds!
//The program is completed here
