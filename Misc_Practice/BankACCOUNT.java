package Interview.Misc_Practice;

public class BankACCOUNT {
    public static void main(String[] args) {

        // Creating an instance of SavingsAccount with account number "SAV123"
        SavingsAccount savings = new SavingsAccount("SAV123");

        // Creating an instance of CurrentAccount with account number "CUR456"
        CurrentAccount current = new CurrentAccount("CUR456");

        // Demonstrating encapsulation:
        // Only accessing balance through deposit and addInterest methods (no direct access to balance)
        savings.deposit(1000);  // Depositing 1000 into the savings account
        savings.addInterest();  // Adding interest to the savings account balance

        current.deposit(500);   // Depositing 500 into the current account
        current.addInterest();  // Attempting to add interest, but no interest is added for CurrentAccount
    }
}

// Abstract class representing a generic Bank Account
abstract class BankAccount {
    // ***** This Portion is for Encapsulation ***** using Getters and Setters *****

    private String accountNumber; // Unique identifier for the account, encapsulated as private
    private double balance;       // Account balance, encapsulated as private to restrict direct access

    // Constructor to initialize the account with an account number
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance is set to 0.0
    }

    // Getter method for account number, allowing read access to account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance, allowing read access to balance
    public double getBalance() {
        return balance;
    }

    // Abstract method for adding interest, to be implemented by specific account types
    abstract void addInterest();

    // Method to deposit an amount into the account, increases balance
    public void deposit(double amount) {
        if (amount > 0) {  // Check to ensure deposit amount is positive
            balance += amount; // Increase balance by deposit amount
            System.out.println("Deposited: " + amount + " in your Account - " + accountNumber);
        }
    }

    // Method to withdraw an amount from the account, decreases balance if sufficient funds
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // Check for valid and available amount
            balance -= amount; // Decrease balance by withdrawal amount
            System.out.println("Withdrawn: " + amount + " in your Account - " + accountNumber);
        }
    }

    // Protected method to update balance internally (not accessible outside package)
    protected void updateBalance(double amount) {
        this.balance = amount; // Sets balance to a specific amount, used in addInterest implementations
    }
}

// Subclass of BankAccount representing a Savings Account, which earns interest
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.05; // Fixed interest rate of 5%

    // Constructor to initialize SavingsAccount with an account number
    public SavingsAccount(String accountNumber) {
        super(accountNumber); // Calls the constructor of the superclass (BankAccount)
    }

    // Implementation of abstract addInterest method for SavingsAccount
    @Override
    void addInterest() {
        double interest = getBalance() * INTEREST_RATE; // Calculate interest based on balance
        updateBalance(getBalance() + interest);         // Add interest to balance
        System.out.println("Interest added to Savings Account. New Balance: " + getBalance());
    }
}

// Subclass of BankAccount representing a Current Account, which does not earn interest
class CurrentAccount extends BankAccount {
    // Constructor to initialize CurrentAccount with an account number
    public CurrentAccount(String accountNumber) {
        super(accountNumber); // Calls the constructor of the superclass (BankAccount)
    }

    // Implementation of abstract addInterest method for CurrentAccount
    // No interest is added in this type of account
    @Override
    void addInterest() {
        System.out.println("No interest for Current Account."); // Message indicating no interest is added
    }
}

