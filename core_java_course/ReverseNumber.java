//Write a program to reverse 3 digit Number
package java_programs;
import java.util.Scanner;

public class ReverseNumber {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a three-digit number: ");
	        int number = scanner.nextInt();

	        // Ensure the number is 3 digits
	        if (number < 100 || number > 999) {
	            System.out.println("Please enter a valid three-digit number.");
	        } else {
	            int lastDigit = number % 10;                  // Extract the last digit by taking the remainder when divided by 10
	            int middleDigit = (number / 10) % 10;   	  // Extract the middle digit by dividing the number by 10 (removing last digit), and then taking the remainder when divided by 10
	            int firstDigit = number / 100;                // Extract the first digit by dividing the number by 100, removing the last two digits

	            int reversedNumber = (lastDigit * 100) + (middleDigit * 10) + firstDigit;
	            System.out.println("Reversed number: " + reversedNumber);
	        }

	        scanner.close();
	    }
	}


/*output:-
Enter a three-digit number: 123
Reversed number: 321*/