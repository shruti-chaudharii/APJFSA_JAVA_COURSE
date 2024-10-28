//Suppose the values of variables 'a' and 'b' are 6 and 8 respectively, write two programs to swap the values of the two variables.
//2) WAP without using any third variable

package java_programs;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        
        int a = 6;
        int b = 8;

        // Display the values of 'a' and 'b' before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping the values of 'a' and 'b' without using a third variable
        a = a + b; // Step 1: Add 'a' and 'b' and assign the result to 'a' (a becomes 14)
        b = a - b; // Step 2: Subtract the new 'a' (14) by 'b' (8) to get the original value of 'a' (6), and assign it to 'b'
        a = a - b; // Step 3: Subtract the new 'b' (6) from the new 'a' (14) to get the original value of 'b' (8), and assign it to 'a'

        // Display the values of 'a' and 'b' after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}


//output:-
//Before swapping: a = 6, b = 8
//After swapping: a = 8, b = 6