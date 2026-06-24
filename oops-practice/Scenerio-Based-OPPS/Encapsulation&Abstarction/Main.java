
class BankAccount {
    // Private fields - data encapsulation
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        setBalance(initialBalance); // Using setter for validation
    }
    // Public getter for accountNumber

    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to deposit money with encapsulation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money with encapsulation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }
    // Method to display account information

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new bank account with initial balance
        BankAccount account = new BankAccount("123456789", 500.0);
        // Display account information
        account.displayAccountInfo();
        // Deposit money
        account.deposit(150.0);
        account.displayAccountInfo();
        // Withdraw money
        account.withdraw(100.0);
        account.displayAccountInfo();
        // Try to set an invalid balance directly (will not compile)
        // account.balance = -100; // Error: balance has private access in
        // BankAccount
        // Try to set an invalid balance using setter
        account.setBalance(-100); // Prints: Balance cannot be negative.
        // Try to deposit a negative amount
        account.deposit(-50); // Prints: Deposit amount must be positive.

        // Try to withdraw more than the balance
        account.withdraw(1000); // Prints: Invalid withdraw amount.
    }
}
