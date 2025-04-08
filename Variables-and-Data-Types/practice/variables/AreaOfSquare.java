package practice.variables;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {

        //Question 2: In a program, input the side of a square. You have to output the area of the
        //square.

        Scanner sc = new Scanner(System.in);
        int side;
        int area;

        System.out.println("Program to find area of Square:- ");
        System.out.println("Enter the side:- ");
        side=sc.nextInt();

        area = side * side;

        System.out.println("Area of the Square with side "+side+ " unit is:- "+area+ " sq. units");

    }
}
