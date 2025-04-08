package practice.variables;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {

        //Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
        //these 3 numbers

        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double avg;

        System.out.println("Program to find average of three numbers:- ");
        System.out.println("Enter first number:- ");
        num1 = sc.nextDouble();
        System.out.println("Enter second number:- ");
        num2 = sc.nextDouble();
        System.out.println("Enter third number:- ");
        num3 = sc.nextDouble();

        avg = (num1+num2+num3)/3;

        System.out.println("Average of the three numbers is:- " +avg);

    }
}
