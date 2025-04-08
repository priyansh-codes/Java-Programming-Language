package ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {

        //variable = condition ? statement1 : statement2;
        //compiler checks the condition: if true , statement 1 is executed; else statement 2 (result is stored in variable)

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Enter first number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter second number:- ");
        num2 = sc.nextInt();

        int larger = (num1 > num2) ? num1 : num2;
        System.out.println("Larger number is:- " + larger);

        String type = (larger % 2 == 0) ? "Even" : "Odd";
        System.out.println("It is also an " + type + " number");
    }
}
