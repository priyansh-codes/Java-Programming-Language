package switchstatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int input;

        System.out.println("Enter first number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter second number:- ");
        num2 = sc.nextInt();

        System.out.println();

        System.out.println("Select Operation to perform:- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("Sum is:- " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference is:- " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product is:- " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error ! Division by zero is not allowed");
                } else {
                    System.out.println("Answer is:- " + (num1 / num2));
                }
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("Error ! Division by zero is not allowed");
                } else {
                    System.out.println("Remainder is:- " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid input !");
        }

    }
}
