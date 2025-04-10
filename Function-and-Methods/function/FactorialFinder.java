package function;

import java.util.Scanner;

public class FactorialFinder {

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the number:- ");
        input = sc.nextInt();

        System.out.println(calculateFactorial(input));

    }
}
