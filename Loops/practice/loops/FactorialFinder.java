package practice.loops;

import java.util.Scanner;

public class FactorialFinder {
    public static void main(String[] args) {

        //Question 3 : Write a program to find the factorial of any number entered by the user.

        Scanner sc = new Scanner(System.in);
        int input;
        int factorial = 1;

        System.out.println("Enter the number:- ");
        input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }

        System.out.println("Factorial is:- " + factorial);


    }
}
