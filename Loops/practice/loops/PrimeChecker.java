package practice.loops;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
        boolean isPrime = true;

        if (input <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= input / 2; i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }

    }
}
