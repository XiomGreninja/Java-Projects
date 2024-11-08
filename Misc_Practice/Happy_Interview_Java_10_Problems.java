package Interview.Misc_Practice;
import java.util.*;

public class Happy_Interview_Java_10_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long do you want the array to be: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        // Sum of variables inside an Array
            int largest = 0;
//        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Enter the value for the array " + i + ": ");
            arr[i] = sc.nextInt();
            largest = arr[0];

//            sum = arr[i] + sum;
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("The largest: " + largest);

//        System.out.println(sum);
//        int largest = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
//        System.out.println(largest);

//        List<Integer> arrList = Arrays.asList(arr);
//        int largest = Collections.max(arrList);
//        System.out.println("The largest number is: " + largest);


//        int largest = findLargestNumber(arr);
//        System.out.println("The largest number is: " + largest);
    }
    // Largest Number in an array
//    public static int findLargestNumber(int[] arr){
//        int largest = Integer.MIN_VALUE;
//        for (int arrNumbers : arr){
//            if (arrNumbers > largest){
//                largest = arrNumbers;
//            }
//        }
//        return largest;
//    }


}
