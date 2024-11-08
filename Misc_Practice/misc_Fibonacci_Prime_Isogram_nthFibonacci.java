package Interview.Misc_Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class misc_Fibonacci_Prime_Isogram_nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:--");
        int n = sc.nextInt();
        sc.nextLine();

        // nth Fibonacci Number
//        System.out.println(fib(n));
 
        // Isogram Question
//        System.out.println("Enter the String to check whether it is a Isogram:--");
//        String iso = sc.nextLine();
//        System.out.println(isIsogram(iso));

        // Fibonacci Series
        //Write a Java program to print the Fibonacci series up to a given number.
//        int a = 0;
//        int b = 1;
//        for (int i = 0; i<n;i++){
//            System.out.println(a);
//            int sum = a+b;
//            a = b;
//            b = sum;
//        }

        // Prime Number Check
        //Write a Java program to check if a given number is a prime number.
//        int count = 0;
//        if (n==1 || n==0){
//            System.out.println("Not possible");
//        return;
//        }
//        for (int i = 2; i*i<=n;i++){
//            if (n%i==0){
//                count++;
//                break;
//            }
//        }
//        if (count==0){
//            System.out.println("Prime");
//        } else {
//            System.out.println("Nah!!");
//        }

        // Array Sorting
        //Write a Java program to sort an array of integers using the bubble sort algorithm.
//        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        bubbleSort(arr);
//
//        System.out.println("Sorted array:");
//        for (int num : arr) System.out.println(num + " ");

       
    }
//    public static void bubbleSort(int[] arr){
//        int n = arr.length;
//        boolean swapped;
//        for (int i = 0; i<n-1; i++){
//            swapped = false;
//            for (int j = 0; j<n-1-i; j++){
//                if (arr[j] > arr[j+1]){
//                    // Swap arr[j] and arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    swapped = true;
//                }
//            }
            // If no two elements were swapped by inner loop,then break
//            if (!swapped)break;
//        }
//    }

    // Is a String an Isogram(Contain's Non-repitative characters /  An isogram is a word where no letter repeats, meaning each character in the string is unique.
//    static boolean isIsogram(String s){ // meaning it belongs to the class (not an instance of the class)
//
//        boolean isogram = true; //  This initializes a variable isogram to true. It assumes that the string is an isogram until proven otherwise.
//
//        char[] ch = s.toCharArray(); // The method converts the input string s into a character array ch using the toCharArray() method. This allows us to iterate over each character of the string.
//
//        Set<Character> chSet = new HashSet<Character>(); // A HashSet is used to store characters of the string. A Set is chosen because it automatically ensures that elements (characters in this case) are unique. If a character is already in the set, it means that character is repeating.
//
//        for (Character c : ch){ // This loop iterates over each character c in the character array ch.
//
//            if (chSet.contains(c)){ // Inside the loop, the method checks if the current character c is already present in the chSet (which stores the unique characters encountered so far).
//
//                isogram = false; // If it is present, it means the character repeats, and the string is not an isogram. The isogram variable is set to false.
//
//            } else {
//                chSet.add(c); // chSet.add(c); adds the character to the HashSet, marking it as encountered for the first time.
//            }
//        }
//        return isogram; // Finally, after the loop ends, the method returns the value of isogram.
//      // If no repeating characters were found, isogram remains       true, indicating the string is an isogram.If a repeating     character was found, isogram is false.
//    }

    // nth Fibonacci Number using recursion
//    public static int fib(int n){
//        if (n<=1){
//            return n; // If the nth place being asked for is less than or equal to 1 it will be returning the value of n itself
//
//        } else {
//            return fib(n-1) + fib(n-2); // this is a formulae to calculate the fibonacci number itself
//        }
//    }


}
