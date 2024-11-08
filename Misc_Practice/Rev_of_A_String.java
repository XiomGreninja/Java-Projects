package Interview.Misc_Practice;

import java.util.Scanner;

public class Rev_of_A_String {
    // Write a function that returns the reverse of a string
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse: ");
        String inputStr = sc.nextLine();

        String reversedString = revString(inputStr);
        System.out.println(reversedString);
    }

    // Function
    public static String revString(String inputStr){
        if (inputStr == null){
            return null;
        }
        // Logic
        StringBuilder reverse = new StringBuilder(); // Emp

        // Iterate all the elements in reverse order
        // In programming, string indexing starts at 0. That means:
        //
        //For "Animal", the characters are indexed like this:
        //'A' is at index 0
        //'n' is at index 1
        //'i' is at index 2
        //'m' is at index 3
        //'a' is at index 4
        //'l' is at index 5
        for ( int i = inputStr.length() - 1 ; i>=0; i-- ){
            reverse.append ( inputStr.charAt(i) );
        }
        return reverse.toString();
    }
}
