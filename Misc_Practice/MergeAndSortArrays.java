package Interview.Misc_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSortArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size for the first array
        System.out.println("How long do you want the first(1) array to be: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        // Input size for the second array
        System.out.println("How long do you want the second(2) array to be: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        // Input values for array 1
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the value for array1 at index " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        // Input values for array 2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the value for array2 at index " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        // Call the method to merge and sort the arrays after input
        int[] mergedArray = mergeAndSortArrays(arr1, arr2);

        // Print the merged and sorted array
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }

    // This method merges two arrays and sorts the result
    public static int[] mergeAndSortArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        // Create a new array that can hold both input arrays
        int[] mergedArray = new int[len1 + len2];

        // Copy elements from arr1 to mergedArray
        for (int i = 0; i < len1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copy elements from arr2 to mergedArray, starting after arr1's elements
        for (int i = 0; i < len2; i++) {
            mergedArray[len1 + i] = arr2[i];  // Fix the index to correctly place arr2 elements
        }

        // Sort the merged array
        Arrays.sort(mergedArray);

        // Return the sorted merged array
        return mergedArray;
    }
}
