package Interview.Misc_Practice;

import java.util.Scanner;

public class Password_Criterion_Copy {
    private String passwordCopy; // A private variable passwordCopy is declared to store the user's passwordCopy.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Object created (PasswordCriterion class and passwordCopy validation)
        // An instance of Password_Criteria is created to access to non-static methods and inner classes.
        Password_Criterion_Copy passwordCriterionCopyApp = new Password_Criterion_Copy();

        // Define passwordCopy Criterion
        // An instance of the inner class PasswordCriterion is created with specific rules for passwordCopy validation, such as minimum length and required character class.
        PasswordCriterion criterion = passwordCriterionCopyApp.new PasswordCriterion(8, true,true,true,true, "!@#$%&*");

        // Prompt the user to set a password
        System.out.println("Please enter a new Password");
        String newPassword = scanner.nextLine();
        
        // Attempt to change the password
        // The changePassword method is called with the user's input and the defined criterion to validate and potentially update the password.
        passwordCriterionCopyApp.changePassword(newPassword, criterion);
        scanner.close();
    }

    // Inner class to define passwordCopy criteria
    // PasswordCriterion is an inner class that encapsulates the rules for passwordCopy criteria validity
    class PasswordCriterion {
        private int minLength; // Minimum length of the passwordCopy
        private boolean requireUppercase; // Whether an uppercase letter is required
        private boolean requireLowercase; // Whether a lowercase letter is required
        private boolean requireDigit; // Whether a digit is required
        private boolean requireSpecialChar; // Whether a special character is required
        private String specialCharacters; // Allowed special characters

        // Constructor to initialize passwordCopy criteria
        public PasswordCriterion(int minLength, boolean requireUppercase, boolean requireLowercase, boolean requireDigit, boolean requireSpecialChar, String specialCharacters){
            this.minLength = minLength;
            this.requireUppercase = requireUppercase;
            this.requireLowercase = requireLowercase;
            this.requireDigit = requireDigit;
            this.requireSpecialChar = requireSpecialChar;
            this.specialCharacters = specialCharacters;
        }

        // Getter methods to access the criteria properties
        public int getMinLength(){
            return minLength;
        }

        public boolean isRequireDigit() {
            return requireDigit;
        }

        public boolean isRequireLowercase() {
            return requireLowercase;
        }

        public boolean isRequireUppercase() {
            return requireUppercase;
        }

        public boolean isRequireSpecialChar() {
            return requireSpecialChar;
        }

        public String getSpecialCharacters() {
            return specialCharacters;
        }
    }

    // Method to validate the passwordCopy against the specified criterion
    // isValidPassword checks if a given passwordCopy meets all the specified criterion
    private boolean isValidPassword(String password, PasswordCriterion criterion){
        // Checks if the passwordCopy meeths the minimum length requriement
        boolean isValidLength = password.length() >= criterion.getMinLength();

        boolean hasUppercase = !criterion.isRequireUppercase()|| !password.equals(password.toLowerCase());
        /*
        !criterion.isRequireUppercase(): This checks if an uppercase letter is not required. If an uppercase letter is not required, it automatically returns true (because the condition for having an uppercase letter is unnecessary).
        !passwordCopy.equals(passwordCopy.toLowerCase()): This checks if the passwordCopy is not all lowercase (i.e., it has at least one uppercase letter). The method passwordCopy.toLowerCase() converts the whole passwordCopy to lowercase. If the original passwordCopy equals its lowercase version, then it means the passwordCopy has no uppercase letters. If they don’t match, it means there’s at least one uppercase letter in the original passwordCopy.
         Breakdown with Example
        Assume:

        Criteria: Uppercase letters are required (isRequireUppercase() returns true).
        Password: "Password123".
        Check if uppercase letters are required:

        criterion.isRequireUppercase() returns true.
        !criterion.isRequireUppercase() becomes false.
        Check if the passwordCopy contains an uppercase letter:

        passwordCopy.toLowerCase() returns "password123".
        passwordCopy.equals(passwordCopy.toLowerCase()) compares "Password123" with "password123", which are not equal.
        Therefore, !passwordCopy.equals(passwordCopy.toLowerCase()) becomes true (because the passwordCopy has at least one uppercase letter).
        Final result of hasUppercase:

        The expression becomes false || true, which results in true. So hasUppercase is true, meaning the passwordCopy has an uppercase letter.
         Another Example (No Uppercase Letter)
        Assume:

        Criteria: Uppercase letters are required (isRequireUppercase() returns true).
        Password: "password123" (all lowercase).
        Check if uppercase letters are required:

        criterion.isRequireUppercase() returns true.
        !criterion.isRequireUppercase() becomes false.
        Check if the passwordCopy contains an uppercase letter:

        passwordCopy.toLowerCase() returns "password123".
        passwordCopy.equals(passwordCopy.toLowerCase()) compares "password123" with "password123", which are equal.
        Therefore, !passwordCopy.equals(passwordCopy.toLowerCase()) becomes false (because the passwordCopy has no uppercase letters).
        Final result of hasUppercase:

        The expression becomes false || false, which results in false. So hasUppercase is false, meaning the passwordCopy doesn’t meet the uppercase letter requirement.
        */

        // Same goes for the lowercase validity process as well
        boolean hasLowercase = !criterion.isRequireLowercase() || !password.equals(password.toUpperCase());

        // Check if the passwordCopy contains a digit if required
        boolean hasDigit = !criterion.isRequireDigit() || password.matches(".*\\d.*");
                 /*
                The regular expression explained: " .*\\d.* "
        Regular expressions (regex) are patterns used to match text. Let’s break down this specific pattern " .*\\d.* ":

        . (dot): Matches any character except for line breaks.
        * (asterisk): Means "zero or more occurrences" of the preceding character. So, .* means "zero or more of any characters."
        \\d: Represents a digit (0–9). In Java, we use two backslashes (\\) because one backslash is an escape character in Java strings. So, \\d in regex means "any digit."
        .* (again): After finding the digit, it allows any characters after it.
        What " .*\\d.* " does:
        .*\\d.*: This entire pattern means:
        "Any number of characters (.*) before a digit (\\d), followed by any number of characters (.*) after the digit."
        In simple terms, this pattern looks for at least one digit anywhere in the string.
                 */

        // Check if the passwordCopy contains a special character if required
        boolean hasSpecialChar = !criterion.isRequireSpecialChar() || password.matches(".*[" + criterion.getSpecialCharacters() + "].*");
                /*
                passwordCopy.matches(".*[" + criterion.getSpecialCharacters() + "].*"):

        This checks if the passwordCopy contains at least one of the allowed special characters. Here's how:
        passwordCopy.matches(...) uses a regular expression (regex) to check if the passwordCopy matches a specific pattern.
        "[" + criterion.getSpecialCharacters() + "]" builds a character class from the allowed special characters. If the allowed special characters are "!@#$%&*", then this part creates a regex pattern like "[!@#$%&*]".
        The regex .*[!@#$%&*].* works as follows:
        .* matches any sequence of characters (or none).
        [!@#$%&*] matches one special character from the set !@#$%&*.
        So, .*[!@#$%&*].* means: "the passwordCopy can have any characters before and after, but it must contain at least one special character from the allowed set."
                 */

        // Return true if all criterion are met, otherwise false
        return isValidLength && hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    // Method to change the passwordCopy if it meets the criterion
    // ChangePassword attempts to update the passwordCopy if it passes the validation
    public void changePassword(String newPassword, PasswordCriterion criterion){
        // Validate the new passwordCopy
        // Calls isValidPassword to ensure the new passwordCopy meets all criterion
        if (isValidPassword(newPassword, criterion)){
            this.passwordCopy = newPassword; // Updates the passwordCopy, if valid, updates the passwordCopy and print a success message; otherwise, informs the user of failure.
            System.out.println("Password Changed Successfully!");
        } else {
            System.out.println("Password doesn't match the criterion!");
        }
    }
}
