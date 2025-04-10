package function;

import java.util.Scanner;

public class FunctionWithParameters {

    public static int calculateSum(int a, int b) {                    //parameters or formal parameters
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:- ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Sum is:- " + calculateSum(num1, num2));     //arguments or actual parameters


    }
}
