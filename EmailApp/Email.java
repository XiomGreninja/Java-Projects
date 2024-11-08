package Interview.EmailApp;

import java.util.Scanner;

public class Email {
    // Private variables to store user information
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "skyroot.com"; // Company domain
    private String alternateEmail;
    private int mailboxCapacity = 500; // Default mailbox capacity

    // Constructor to initialize first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // Set the department by calling a method
        this.department = setDepartment();

        // Generate a random password
        this.password = randomPassword(8); // Password length is 8
        System.out.println("Your password is: " + this.password);

        // Generate email by combining elements
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    // Method to ask for the department and return it
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Marketing\n0 for Nothing\nEnter the department code:");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Marketing";
        } else {
            return "None";
        }
    }

    // Method to generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&*"; // Characters allowed in password
        char[] password = new char[length]; // Array to hold password characters
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length()); // Generate random index
            password[i] = passwordSet.charAt(rand); // Select character from passwordSet
        }
        return new String(password); // Convert character array to String
    }

    // Method to set an alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Method to set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Method to change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // Getter for mailbox capacity
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    // Getter for alternate email
    public String getAlternateEmail() {
        return alternateEmail;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Method to display user information
    public String showInfo() {
        return "DISPLAY_NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email;
    }
}
