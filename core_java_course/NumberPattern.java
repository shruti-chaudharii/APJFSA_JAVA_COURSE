//2.WAP to display following pattern
//
//1
//12
//123
//1234
//12345

package java_programs;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for each number in the row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // New line after each row
        }
    }
}

//Output:-
//1
//12
//123
//1234
//12345
