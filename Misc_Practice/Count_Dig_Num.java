package Interview;

import java.util.Scanner;

// ***** Digits of A Number ******

public class Count_Dig_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dig = 0;

        // So basically we divide the number by 10 to find the reminder which will be taken down by 10 until the number itself hasn't been reduced to 0 and everytime we reduce it we increase the digits count which keeps the count of how many digits it will be

        while (n!= 0){
            n = n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
