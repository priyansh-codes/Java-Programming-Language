package practice.conditionalstatements;

import java.util.Scanner;

public class PositiveNegativeChecker {
    public static void main(String[] args) {

        //Question 1 : Write a Java program to get a number from the user and print whether it is
        //positive or negative.

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter the number:- ");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("It is a positive number");
        } else {
            System.out.println("It is a negative number");
        }

    }
}
