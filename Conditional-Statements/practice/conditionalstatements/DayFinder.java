package practice.conditionalstatements;

import java.util.Scanner;

public class DayFinder {
    public static void main(String[] args) {

        //Question 3 : Write a Java program to input week number(1-7) and print day of week name
        //using switch case.

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the week number for finding day of week name:- ");
        input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Oops ! Invalid input");
                break;
        }

    }
}
