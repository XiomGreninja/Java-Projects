package Interview;

import java.util.Scanner;

public class Fibonacci_Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nth Fibonacci? ");
        int n = sc.nextInt();

        int fir = 0;
        int sec = 1;
        for (int i = 0; i < n; i++){
            System.out.print(fir+"\t");
            int sum = fir + sec;
            fir = sec;
            sec = sum;
        }
    }
}
