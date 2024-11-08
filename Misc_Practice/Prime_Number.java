package Interview;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        // Prime
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want to enter:-- ");
        int n = sc.nextInt();

        for (int i = 1;i<=n; i++){
            System.out.print(i+"--Enter your number-- ");
            int t = sc.nextInt();

            int count = 0;
            for (int div = 2; div*div <=t; div++){ // div*div = n ; (div)^2 = n; div = squareroot(n)
                if (t % div == 0){
                    count++;
                    break; // There is no need to run the program if you got a count++
                }
            }
            if (count == 0){
                System.out.println("Prime Number.");
            } else {
                System.out.println("Not a Prime Number.");
            }
        }
    }
}
