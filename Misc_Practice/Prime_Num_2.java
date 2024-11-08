package Interview;
import java.util.Scanner;

class Pri{
    public void clic(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which you want to find prime numbers: ");
        int limit = sc.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            int count = 0;

            for (int div = 2; div * div <= i; div++) {
                if (i % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

public class Prime_Num_2 {

    public static void main(String[] args) {
        Pri pi = new Pri();
        pi.clic();


            // ******Different Approach *******

//        System.out.print("Prime till Number: ");
//        int limit = sc.nextInt();
//
//        for (int i=2; i<=limit;i++){
//            if (isPrime(i)){
//                System.out.print(i+" ");
//            }
//        }
//    }
//
//    public static boolean isPrime(int number){
//        if (number <= 1){
//            return false;
//        }
//        if (number <=3){
//            return true;
//        }
//        if (number % 2 == 0 || number % 3 == 0){
//            return false;
//        }
//        for (int i = 5; i*i <=number; i+= 6){
//            if (number % i == 0 || number%(i+2)==0){
//                return false;
//            }
//        }
//        return true;
    }
}
