package practice.loops;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

//        Question 2 : Write a program that reads a set of integers, and then prints the sum of the
//        even and odd integers.

        Scanner sc = new Scanner(System.in);
        int input;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter the number:- ");
            input = sc.nextInt();

            if (input % 2 == 0) {
                evenSum += input;
            } else {
                oddSum += input;
            }

            do {
                System.out.println("Do you wish to continue ? (Enter 0 for no and 1 for yes)");
                choice = sc.nextInt();

                if ((choice > 1) || (choice < 0)) {
                    System.out.println("Invalid input !");
                }

            } while ((choice > 1) || (choice < 0));


        } while (choice == 1);


        System.out.println("\nEven sum is:- " + evenSum);
        System.out.println("Odd sum is:- " + oddSum);
        System.out.println("\nProgram ended !");
    }
}
