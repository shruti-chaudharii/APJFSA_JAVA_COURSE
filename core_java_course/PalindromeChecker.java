//3.WAP to find given no is palindrome or not.

package java_programs;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        //Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the input number
        
        // Initialize variables to store the reversed number and the original number
        int reversed = 0, original = number;
        
        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit of the number
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        
        // Check if the original number and the reversed number are the same
        if (original == reversed) {
            System.out.println("The number is a palindrome."); // If they are the same, it's a palindrome
        } else {
            System.out.println("The number is not a palindrome."); // Otherwise, it's not a palindrome
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

//Output:-
//Enter a number: 121
//The number is a palindrome.