package practice.conditionalstatements;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        // Question 5 : Write a Java program that takes a year from the user and print whether that
        //year is a leap year or not

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the year to check if it is a leap year or not:- ");
        input = sc.nextInt();

        boolean firstCriteria = (input % 4) == 0;
        boolean secondCriteria = (input % 100) != 0;
        boolean thirdCriteria = (input % 400) == 0;

        if (firstCriteria && (secondCriteria || thirdCriteria)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }

    }
}
