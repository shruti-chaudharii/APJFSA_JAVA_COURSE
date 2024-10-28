//Write a program for even odd by using conditional  operators. 
package java_programs;
import java.util.Scanner;

public class EvenOddCheck {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Using conditional (ternary) operator to check even or odd
	        String result = (number % 2 == 0) ? "Even" : "Odd";

	        System.out.println("The number is " + result + ".");
	    }
}



//Output:-
//Enter a number: 9
//The number is Odd.

