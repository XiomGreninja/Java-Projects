package Interview;

import java.util.Scanner;

public class Dig_of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* This portion is to find the total number of digits we have in this number taken we use the temp variable because we will need the n to be as it is. */
        int nod = 0;
        int temp = n;
        while (temp!= 0){
            temp = temp/10;
            nod++;
        }

//      This portion here is to get the divisor and which will be one power short of the length of nod, and we reduce it while we get the quo which is the digit from the right hand side which will be printed
        int div = (int)Math.pow(10, nod - 1);
        while (div != 0){
            int quo = n/div;
            System.out.print(quo+" ");
            n = n % div; // We're shortening the number by taking out the last digits

            div = div / 10; // We're shortening the divisor itself for so that it can be used again for the new updated number
        }
    }
}
