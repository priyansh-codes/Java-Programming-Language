package basicmath;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double radius;
        double area;

        System.out.println("Program to find area of Circle:- ");
        System.out.println("Enter radius of the circle:- ");
        radius= sc.nextInt();

        area = Math.PI * radius * radius;

        System.out.println(area);

    }
}
