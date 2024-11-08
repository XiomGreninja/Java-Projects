package Interview.Misc_Practice;
import java.util.Scanner;

public class Happy_Interview_Java_10_Problems2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long do you want the array to be: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for the array " + i + ": ");
            arr[i] = sc.nextInt();

            int num = arr[i];
            if (largest < num){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println("The second largest : " + secondLargest);
    }
}
