package ifelse;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the number to check if it's even or odd:- ");
        input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println(input + " is even");
        } else {
            System.out.println(input + " is odd");
        }

    }
}
