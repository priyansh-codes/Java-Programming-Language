package breakstatement;

import java.util.Scanner;

public class TerminateOnMultipleOf10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        int bottleneck = 10;

        do {
            System.out.println("Enter the number:- ");
            input = sc.nextInt();
            if (input % 10 == 0) {
                break;
            }
            System.out.println();
        } while (true);

        System.out.println("\nYou entered a multiple of 10 ! \nProgram ended");

    }
}
