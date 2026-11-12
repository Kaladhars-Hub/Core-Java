package basics.Methods;

public class BankAccount {

    // Global variable: Holds the shared money pool
    static int currentBalance = 1000;

    // 1. STATIC METHOD (No parameters, no return value)
    // Runs automatically without an object to welcome the user.
    public static void greetCustomer() {
        System.out.println("Hello, Welcome to the banking application!");
    }

    // 2. NON-STATIC METHOD (Has an input parameter, no return value)
    // Requires an object card. It takes 'money' from outside and adds it to the balance.
    public void deposit(int money) {
        currentBalance = currentBalance + money;
        System.out.println("Amount deposited successfully!");
    }

    // 3. STATIC METHOD (Has an input parameter, no return value)
    // Can be called directly without an object. It subtracts money from the pool.
    public static void withdrawal(int money) {
        currentBalance = currentBalance - money;
        System.out.println("Amount withdrawn successfully!");
    }

    // 4. NON-STATIC RETURNING METHOD (No parameters, returns an Integer)
    // Requires an object card. It grabs the current balance number and hands it back to us.
    public int getCurrentBalance() {
        return currentBalance;
    }

    // 🔑 THE ENGINE KEY: The program execution starts here line-by-line
    public static void main(String[] args) {

        // Step A: Call the static welcome sign directly
        greetCustomer();

        // Step B: Build the physical object card ("account") so we can use non-static methods
        BankAccount account = new BankAccount();

        // Step C: Check initial balance (Using the object because getCurrentBalance is non-static)
        System.out.println("Starting Balance: " + account.getCurrentBalance()); // Prints 1000

        // Step D: Feed 500 into the deposit input parameter slot (Using the object)
        account.deposit(500);

        // Step E: Check balance again to see the added money
        System.out.println("Balance after Deposit: " + account.getCurrentBalance()); // Prints 1500

        // Step F: Call withdrawal directly (No object needed because it is static)
        withdrawal(300);

        // Step G: Final check to see the remaining balance
        System.out.println("Final Balance: " + account.getCurrentBalance()); // Prints 1200
    }
}