package ternaryoperator;

import java.util.Scanner;

public class PassFailChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.println("Enter the marks obtained:- ");
        marks = sc.nextInt();

        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

    }
}
