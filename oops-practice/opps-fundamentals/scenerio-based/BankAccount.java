// 1. Design a BankAccount class with accountNumber, holder, balance. 
// Implement deposit(), withdraw() (with overdraft check), getStatement(). 
// Add a static field to 
// track total accounts created. Create 3 accounts and simulate 5 transactions each.
public class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public String getStatement() {
        return "Account Number: " + accountNumber + ", Holder: " + holder + ", Balance: " + balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Alice", 1000);
        BankAccount account2 = new BankAccount("234567", "Bob", 500);
        BankAccount account3 = new BankAccount("345678", "Charlie", 2000);

        // Simulate transactions for account1
        account1.deposit(200);
        account1.withdraw(150);
        account1.withdraw(1200); // Should show insufficient funds
        account1.deposit(300);
        account1.withdraw(100);

        // Simulate transactions for account2
        account2.deposit(100);
        account2.withdraw(50);
        account2.withdraw(600); // Should show insufficient funds
        account2.deposit(200);
        account2.withdraw(100);

        // Simulate transactions for account3
        account3.deposit(500);
        account3.withdraw(300);
        account3.withdraw(2500); // Should show insufficient funds
        account3.deposit(400);
        account3.withdraw(100);

        // Print statements
        System.out.println(account1.getStatement());
        System.out.println(account2.getStatement());
        System.out.println(account3.getStatement());

        // Print total accounts created
        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
