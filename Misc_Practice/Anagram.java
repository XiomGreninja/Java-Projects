package Interview.Misc_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st String: ");
        String str1 = sc.nextLine();
//        str1=str1.toLowerCase();

        System.out.println("Enter the 2nd String: ");
        String str2 = sc.nextLine();
//        str2=str2.toLowerCase();
        

        if (areAnagrams(str1, str2)){
            System.out.println("Great! It is an Anagram!");
        } else {
            System.out.println("False Not an Anagram!");
        }
    }

    public static boolean areAnagrams(String str1, String str2){
        // Converting string into character and storing in the array and sorting them
        char[] chararr1 = str1.toLowerCase().toCharArray();
        char[] chararr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chararr1);
        Arrays.sort(chararr2);

        return Arrays.equals(chararr1,chararr2);
    }
}
