package Interview;

import java.util.Scanner;

public class Reverse_a_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n = 200

        while (n > 0){
            int dig = n % 10;
            /* 200 % 10 = 0
            20 % 10 = 0
            2 % 10 = 2
             */
            n = n / 10;
            /* 200 / 10 = 20
            20 / 10 = 2
            2 / 10 = 0
             */
            System.out.print(dig);
        }
    }
}
