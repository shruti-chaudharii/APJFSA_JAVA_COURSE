//Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//1)WAP by using a third variable

package java_programs;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        // Display the values of 'a' and 'b' before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping the values of 'a' and 'b' using a third variable 'temp'
        int temp = a; // Store the value of 'a' in 'temp' temporarily
        a = b;        // Assign the value of 'b' to 'a'
        b = temp;     // Assign the value of 'temp' (original 'a') to 'b'

        // Display the values of 'a' and 'b' after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


//Output:-
//Before swapping: a = 6, b = 8
//After swapping: a = 8, b = 6