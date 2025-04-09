package whileloop;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int initialNumber = 1;
        int inputNumber;

        System.out.println("Enter the count till which numbers must be printed starting from 1:- ");
        inputNumber = sc.nextInt();

        while (initialNumber <= inputNumber) {
            System.out.println(initialNumber);
            initialNumber++;
        }

        System.out.println();

        System.out.println("Program has ended !");

    }
}
