package elseif;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("Enter first number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter second number:- ");
        num2 = sc.nextInt();
        System.out.println("Enter third number:- ");
        num3 = sc.nextInt();

        if ((num1 >= num2) && (num1 >= num3)) {
            System.out.println("Num1 is largest");
        } else if (num2 >= num3) {
            System.out.println("Num2 is largest");
        } else {
            System.out.println("Num3 is largest");
        }


    }
}
