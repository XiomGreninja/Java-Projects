package Interview;

import java.util.ArrayList;
import java.util.Scanner;

class inv {
    public static int inver(int n){

        int temp=n;
        int count=0;
        while(n>0){

            int dig=n%10;

            count++;

            n=n/10;}

        int inv=0;
        int p=1;
        for(int i=1;i<=count;i++){

            int dig=temp%10;
            inv=inv+p*(int)Math.pow(10,dig-1);

            temp=temp/10;

            p++;
        }
        return inv;
    }

//    public static int inverse(int n) {
//        int inverse = 0; // To hold the final inverted number
//        int position = 1; // To keep track of the original digit's position
//
//        // While there are digits left in n
//        while (n != 0) {
//            int originalDigit = n % 10; // Get the last digit of n
//            n = n / 10; // Remove the last digit from n
//
//            // If the original digit is valid (greater than 0)
//            if (originalDigit > 0) {
//                // Place the current position in the place of the original digit
//                inverse += position * (int) Math.pow(10, originalDigit - 1);
//            }
//
//            position++; // Move to the next position
//        }
//
//        return inverse; // Return the final inverse number
//    }
}

//class inv {
//    public static int inverse(int n) {
//            int inverse = 0;
//            int Original_Position = 1;
//
//            while (n != 0){
//                int Original_Digit = n % 10;
//                int Inverted_Digit = Original_Position;
//                // int InvertedPosition = Original_Digit;
//
//                // Make change to inverse using Inverted_Position and Inverted_Digit
//
//                inverse = inverse + Inverted_Digit * (int)Math.pow(10, Original_Digit - 1);
//
////                inverse = inverse + Inverted_Digit * (int)Math.pow(10, Original_Digit - 1);
//
//                n = n / 10;
//                Original_Position++;
//        }
//        return inverse;
//    }
//}

public class Inverse_a_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(inv.inverse(n));
        System.out.println(inv.inver(n));

//        ArrayList<Integer> num = new ArrayList<>();
//
//        int nod = 0;
//        int temp = n;
//        while (temp!= 0){
//            temp = temp/10;
//            nod++;
//        }
//
//        int div = (int)Math.pow(10, nod - 1);
//        while (div != 0){
//            int quo = n/div;
////            System.out.print(quo+" ");
//
//            n = n % div; // We're shortening the number by taking out the last digits
//
//            div = div / 10; // We're shortening the divisor itself for so that it can be used again for the new updated number
//            num.add(quo);
//        }
//
//        System.out.println("\n"+num);
    }
}
