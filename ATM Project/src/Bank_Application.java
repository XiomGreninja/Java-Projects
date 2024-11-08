import java.util.Scanner;

// Main class for the Bank Application
public class Bank_Application {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter the Customer Name:- ");
        String cname1 = scanner.next(); // Read the customer's name

        // Prompt the user to enter their ID
        System.out.println("Enter the Customer ID:- ");
        String cid1 = scanner.next(); // Read the customer's ID

        // Create a new BankAccount object with the provided name and ID
        BankAccount obj = new BankAccount(cname1, cid1);

        // Display the menu for the bank account operations
        obj.showMenu();
    }
}

// Class representing a bank account
class BankAccount {
    int balance; // Variable to store the current balance
    int previousTransaction; // Variable to store the last transaction amount
    String customerName; // Variable to store the customer's name
    String customerID; // Variable to store the customer's ID

    // Constructor to initialize a new BankAccount with a name and ID
    BankAccount(String cname, String cID) {
        customerName = cname;
        customerID = cID;
    }

    // Method to deposit an amount into the account
    void deposit(int amount) {
        if (amount != 0) { // Check if the deposit amount is not zero
            balance = balance + amount; // Add the amount to the balance
            previousTransaction = amount; // Record the transaction
        }
    }

    // Method to withdraw an amount from the account
    void withdraw(int amount) {
        if (amount != 0) { // Check if the withdrawal amount is not zero
            balance = balance - amount; // Subtract the amount from the balance
            previousTransaction = -amount; // Record the transaction as negative
        }
    }

    // Method to display the previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposit: " + previousTransaction); // Display deposit amount
        } else if (previousTransaction < 0) {
            System.out.println("Withdraw: " + Math.abs(previousTransaction)); // Display withdrawal amount
        } else {
            System.out.println("No transaction occurred!"); // No transaction to display
        }
    }

    // Method to display the menu and handle user input
    void showMenu() {
        char option; // Variable to store the user's menu choice
        Scanner sc = new Scanner(System.in); // Scanner for reading user input

        // Display a welcome message with the customer's name and ID
        System.out.println("Welcome! " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println("\n");

        // Loop to display the menu and process user choices
        do {
            // Display the menu options
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");
            System.out.println("====================================================================================");
            System.out.println("Enter an option");
            System.out.println("====================================================================================");

            // Read the user's choice
            option = sc.next().charAt(0);

            // Process the user's choice using a switch statement
            switch (option) {
                case 'A':
                    // Display the current balance
                    System.out.println("--------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("--------------------------------");
                    break;

                case 'B':
                    // Prompt the user to enter an amount to deposit
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount to Deposit");
                    System.out.println("--------------------------------");
                    int amount = sc.nextInt(); // Read the deposit amount
                    deposit(amount); // Call the deposit method
                    break;

                case 'C':
                    // Prompt the user to enter an amount to withdraw
                    System.out.println("--------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = sc.nextInt(); // Read the withdrawal amount
                    withdraw(amount2); // Call the withdraw method
                    break;

                case 'D':
                    // Display the previous transaction
                    System.out.println("--------------------------------");
                    getPreviousTransaction(); // Call the method to display the previous transaction
                    System.out.println("--------------------------------");
                    break;

                case 'E':
                    // Exit the menu
                    System.out.println("--------------------------------");
                    break;

                default:
                    // Handle invalid input
                    System.out.println("Invalid Option! Please enter again -- ");
                    break;
            }
        } while (option != 'E'); // Continue until the user chooses to exit

        // Display a Thank You message
        System.out.println("Thank You for using our Services \n Come Back Again!");
    }
}
