package function;

import java.util.Scanner;

public class ProductFinder {

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter the numbers:- ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int prod = multiply(num1, num2);
        System.out.println(prod);

    }
}
