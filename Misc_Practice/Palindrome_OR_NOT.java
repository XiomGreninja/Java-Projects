package Interview.Misc_Practice;
import java.util.Scanner;

class MycstmException extends Exception{
    public MycstmException(String words){
        super(words);
    }
}

public class Palindrome_OR_NOT {
    public static void main() throws MycstmException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse: ");
        String testString = sc.nextLine();
//        if (testString == null){ // Not the custom Exception
//            throw new IllegalArgumentException("ERROR!!\nEnter something!\nDumbass!!!!");
//        }

        if (testString == null){
            throw new MycstmException("ERROR!!\nEnter something!\nDumbass!!!!");
        }

        boolean result = isPalindrom(testString);
        if (isPalindrom(testString) == true){
            System.out.println(result + " - It is a palindrome!");
        } else {
            System.out.println(result + " - It is not a palindrome!");
        }
    }

    public static boolean isPalindrom(String testString){


        StringBuilder resultcase = new StringBuilder();

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
        for ( int i = testString.length() - 1 ; i>=0; i-- ){
            resultcase.append ( testString.charAt(i) );
        }
        if (testString.equals(resultcase.toString())){
            return true;
        } else {
            return false;
        }
    }
}
