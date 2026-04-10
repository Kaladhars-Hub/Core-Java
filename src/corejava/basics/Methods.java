package corejava.basics;

public class Methods {

    // Static variable → shared across all objects
    static int currentBalance = 1000;

    // Method 1: No parameter, no return (void) - Static method → no object required
    public static void greetCustomer() {
        System.out.println("Hello, Welcome to the banking application!");
    }

    // Method 2: With parameter, no return - Non-static method → requires object
    public void deposit(int money) {

        // Adding money to current balance
        // Beginner-friendly version:
        currentBalance = currentBalance + money;

        // Short version:
        // currentBalance += money;

        System.out.println("Amount deposited successfully!");
    }

    // Static method → can be called directly
    public static void withdrawal(int money) {

        // Subtracting money
        currentBalance -= money;

        System.out.println("Amount withdrawn successfully!");
    }

    // Method 3: With returning value
    public int getCurrentBalance() {

        // Returning value to caller
        return currentBalance;
    }

    // With parameters + return (extra example)
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Calling static method
        greetCustomer();

        // Creating object to access non-static methods
        Methods bank = new Methods();

        // Checking balance (method returns value)
        System.out.println("Current balance is - " + bank.getCurrentBalance());

        // Depositing money
        bank.deposit(500);            // calling method with parameter

        System.out.println("Current balance is - " + bank.getCurrentBalance());

        // Withdrawing money
        withdrawal(300);

        System.out.println("Current balance is - " + bank.getCurrentBalance());

        // Extra example
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

    }
}