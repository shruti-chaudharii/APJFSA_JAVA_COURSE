//1.Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor?

package java_programs;

class BankCustomer {
    // Fields to store account number, account type, and amount
    private int acno;
    private String atype;
    private double amt;

    // Parameterized constructor
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a BankCustomer object with account number, type, and amount
        BankCustomer customer = new BankCustomer(123456, "Savings", 5000.00);
        // Displaying customer details
        customer.displayCustomerDetails();
    }
}

//Output:-
//Account Number: 123456
//Account Type: Savings
//Account Balance: 5000.0