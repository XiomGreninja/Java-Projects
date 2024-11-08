package Interview.Misc_Practice;
import java.util.Scanner;

public class Factorial {
    // 1st Logic **** Iterative Way
    public static int factorial2(int n){
        int result = 1;
        for (int i =1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial...");
        int number = sc.nextInt();
//        System.out.println(STR."Factorial of \{number} is \{factorial(number)}");
        System.out.printf("Factorial of %d is %d.%n",number,factorial(number));
    }
}
