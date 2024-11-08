package Interview.Misc_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSortArrays_2_Repeat_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First Array creation and filling
        System.out.println("How long the first array(1) be: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0;i<array1.length; i++){
            System.out.println(STR."Value for the element in array(1) -- \{i}");
            array1[i] = sc.nextInt();
        }

        // Second Array creation and filling
        System.out.println("How long the first array(2) be: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0;i<array2.length; i++){
            System.out.println("Value for the element in array(2) -- " + i);
            array2[i] = sc.nextInt();
        }
        // call the method
//        int[] mergedArray = mergeAndsort(array1,array2);
//        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));

        System.out.println("Merged and sorted array: " + Arrays.toString(mergeAndsort(array1,array2)));

    }
    // Create the method where the adding and sorting will take place
    public static int[] mergeAndsort(int[] array1, int[] array2){
        // Find the length of the arrays and add them to create the length of the new array
        int len1 = array1.length;
        int len2 = array2.length;
        int[] mergeandSortedArray =new int[len1 + len2];

        // Placing the values in the array1
        for (int i=0; i<len1;i++){
            mergeandSortedArray[i] = array1[i];
        }

        // Placing the values in the array2
        for (int i=0; i<len2;i++){
            mergeandSortedArray[i+i] = array2[i];
        }

        // Sorting the main array
        Arrays.sort(mergeandSortedArray);

        // Ofcourse now returning it back
        return mergeandSortedArray;
    }
}
