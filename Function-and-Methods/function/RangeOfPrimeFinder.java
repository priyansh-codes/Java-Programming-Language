package function;

import java.util.Scanner;

public class RangeOfPrimeFinder {

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeInRange(int input) {
        for (int i = 1; i <= input; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range;

        System.out.println("Enter range:- ");
        range = sc.nextInt();

        PrimeInRange(range);


    }

}
