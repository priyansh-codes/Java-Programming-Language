package practice.function;

import java.util.Scanner;

public class SumOfDigits {

//    Question 5 : Write a Java method to compute the sum of the digits in an integer

    public static int addDigits(int input) {
        int sum = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            sum = sum + lastDigit;
            input = input / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the digits:- ");
        input = sc.nextInt();

        System.out.println("Sum of the digits is:- " + addDigits(input));

    }
}
