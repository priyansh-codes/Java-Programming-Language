package whileloop;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumber;
        int counter = 1;
        int sum = 0;

        System.out.println("Enter the count till which you want the sum of natural numbers:- ");
        inputNumber = sc.nextInt();

        while (inputNumber >= counter) {          //Alternate approach:  while (counter<=inputNumber)
            sum += counter;                       // sum = sum + counter
            counter++;
        }

        System.out.println("Sum is: " + sum);


    }
}
