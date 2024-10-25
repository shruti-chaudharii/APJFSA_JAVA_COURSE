//WAP to find largest number among numbers
package java_programs;
import java.util.Scanner;

public class LargestDigit {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Variable to store the largest number
        int largest;

        // Check if num1 is greater than or equal to both num2 and num3
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        }
        // If num1 is not the largest, check if num2 is greater than or equal to both num1 and num3
        else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        }
        // If neither num1 nor num2 is the largest, then num3 must be the largest
        else {
            largest = num3;
        }

        // Print the largest number among the three
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}


/*output:-
Enter the first number: 234
Enter the second number: 456
Enter the third number: 23
The largest number is: 456*/
