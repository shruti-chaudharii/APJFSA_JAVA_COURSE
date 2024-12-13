//3.Write a program using exception handling to handle array index out of bounds.

package java_programs;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Initialize an array with 5 elements
            int[] numbers = {10, 20, 30, 40, 50};

            // Ask the user to input an index
            System.out.print("Enter the index you want to access: ");
            int index = scanner.nextInt();

            // Access the array element at the given index
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Error: The index you entered is out of bounds! Please try again with a valid index.");
        } finally {
            // Close the scanner
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}

//Output:-
//Enter the index you want to access: 3
//Element at index 3: 40
//Program execution completed.