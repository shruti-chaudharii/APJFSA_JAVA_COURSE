//WAP to find whether the given number is Armstrong number or not
package java_programs;
import java.util.*;

public class ArmstrongNumber {

	    public static void main(String args[]) {
	        // Initialize variables
	        int n, temp, sum = 0, r;

	        // The number to be checked
	        n = 153;

	        // Store the original number for comparison later
	        temp = n;

	        // Process each digit of the number
	        while (n > 0) {
	            // Get the last digit
	            r = n % 10;

	            // Add the cube of the digit to sum
	            sum = sum + (r * r * r);

	            // Remove the last digit
	            n = n / 10;
	        }

	        // Reset n to the original number for the final comparison
	        n = temp;

	        // Check if the sum of the cubes of digits equals the original number
	        if (n == sum) {
	            System.out.println("Given number " + temp + " is an Armstrong number.");
	        } else {
	            System.out.println("Given number " + temp + " is not an Armstrong number.");
	        }
	    }
	}



/*output:-
Given number 153 is an Armstrong number.*/
