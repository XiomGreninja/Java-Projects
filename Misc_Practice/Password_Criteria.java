package Interview.Misc_Practice;

import java.util.Scanner;

// Main class to handle password criteria and validation
public class Password_Criteria {
    private String password; // A private variable password is declared to store the user's password.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Object Created (PasswordCriterion class and password validation)
        // An instance of Password_Criteria is created to access non-static methods and inner classes.
        Password_Criteria passwordCriteriaApp = new Password_Criteria();

        // Define password criteria
        // An instance of the inner class PasswordCriterion is created with specific rules for password validation, such as minimum length and required character types.
        PasswordCriteria criteria = passwordCriteriaApp.new PasswordCriteria(
                8, // Minimum length of 8 characters
                true, // Require at least one uppercase letter
                true, // Require at least one lowercase letter
                true, // Require at least one digit
                true, // Require at least one special character
                "!@#$%&*" // Allowed special characters
        );

        // Prompt the user to set a password
        System.out.println("Please enter a new password:");
        String newPassword = scanner.nextLine();

        // Attempt to change the password
        // The changePassword method is called with the user's input and the defined criteria to validate and potentially update the password.
        passwordCriteriaApp.changePassword(newPassword, criteria);

        scanner.close(); // Close the scanner
    }

    // Inner class to define password criteria
    // PasswordCriterion is an inner class that encapsulates the rules for password validation.
    class PasswordCriteria {
        private int minLength; // Minimum length of the password
        private boolean requireUppercase; // Whether an uppercase letter is required
        private boolean requireLowercase; // Whether a lowercase letter is required
        private boolean requireDigit; // Whether a digit is required
        private boolean requireSpecialChar; // Whether a special character is required
        private String specialCharacters; // Allowed special characters

        // Constructor to initialize password criteria
        public PasswordCriteria(int minLength, boolean requireUppercase, boolean requireLowercase,
                                boolean requireDigit, boolean requireSpecialChar, String specialCharacters) {
            this.minLength = minLength;
            this.requireUppercase = requireUppercase;
            this.requireLowercase = requireLowercase;
            this.requireDigit = requireDigit;
            this.requireSpecialChar = requireSpecialChar;
            this.specialCharacters = specialCharacters;
        }

        // Getter methods to access the criteria properties
        public int getMinLength() { return minLength; }
        public boolean isRequireUppercase() { return requireUppercase; }
        public boolean isRequireLowercase() { return requireLowercase; }
        public boolean isRequireDigit() { return requireDigit; }
        public boolean isRequireSpecialChar() { return requireSpecialChar; }
        public String getSpecialCharacters() { return specialCharacters; }
    }

    // Method to validate the password against the specified criteria
    // isValidPassword checks if a given password meets all the specified criteria.
    private boolean isValidPassword(String password, PasswordCriteria criteria) {
        // Check if the password meets the minimum length requirement
        boolean isValidLength = password.length() >= criteria.getMinLength();

        // Check if the password contains an uppercase letter if required
        boolean hasUppercase = !criteria.isRequireUppercase() || !password.equals(password.toLowerCase());

        // Check if the password contains a lowercase letter if required
        boolean hasLowercase = !criteria.isRequireLowercase() || !password.equals(password.toUpperCase());

        // Check if the password contains a digit if required
        boolean hasDigit = !criteria.isRequireDigit() || password.matches(".*\\d.*");

        // Check if the password contains a special character if required
        boolean hasSpecialChar = !criteria.isRequireSpecialChar() || password.matches(".*[" + criteria.getSpecialCharacters() + "].*");

        // Return true if all criteria are met, otherwise false
        return isValidLength && hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    // Method to change the password if it meets the criteria
    // changePassword attempts to update the password if it passes validation.
    public void changePassword(String newPassword, PasswordCriteria criteria) {
        // Validate the new password
        // Calls isValidPassword to ensure the new password meets all criteria.
        if (isValidPassword(newPassword, criteria)) {
            this.password = newPassword; // Update the password
            // If valid, updates the password and prints a success message; otherwise, informs the user of failure.
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Password does not meet the criteria.");
        }
    }
}
