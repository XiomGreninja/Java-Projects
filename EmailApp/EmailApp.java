package Interview.EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input
        System.out.println("Enter the FirstName:--");
        String fir = sc.next(); // Read first name
        System.out.println("Enter the LastName:--");
        String las = sc.next(); // Read last name

        // Create an Email object with the provided first and last name
        Email email = new Email(fir, las);

        // Display basic information using the showInfo method
        System.out.println(email.showInfo());

        // Set an alternate email and change the password
        // Set an alternate email
        System.out.println("\nDo you wish to set an alternate E-mail:\ntype YES/NO to proceed...");
        String response = sc.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the alternate E-mail:");
            String setAltEmail = sc.next();
            email.setAlternateEmail(setAltEmail.toLowerCase());
        } else {
            System.out.println("You decided not to set an Alternate Email.");
        }
        // Ask if the user wants to change the password
        System.out.println("\nDo you wish to change the password:\ntype YES/NO to proceed...");
        response = sc.next();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter the new password:");
            String newPassword = sc.next();
            email.changePassword(newPassword);
        } else {
            System.out.println("You decided not to change the password.");
        }

        // Use getter methods to display additional information
        System.out.println("Alternate Email: " + email.getAlternateEmail());
        System.out.println("New Password: " + email.getPassword());
        System.out.println("Mailbox Capacity: " + email.getMailboxCapacity() + "mb");
    }
}
