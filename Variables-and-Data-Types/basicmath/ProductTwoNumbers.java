package basicmath;

import java.util.Scanner;

public class ProductTwoNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Program to find product of two numbers:- ");
        System.out.println("Enter first number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter second number:- ");
        num2 = sc.nextInt();

        result = num1 * num2;

        System.out.println(result);

    }
}
