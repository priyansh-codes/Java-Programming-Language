package practice.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        //Question 4 : Write a program to print the multiplication table of a number N, entered by the user.

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the number:- ");
        input = sc.nextInt();

        for (int i=1; i<=10;i++){
            System.out.println(input+ " x "+i+ " = " +(i*input));
        }

    }
}
