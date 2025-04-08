package elseif;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double income;
        double tax;

        System.out.println("Enter your income:- ");
        income = sc.nextDouble();

        if (income < 500000) {
            tax = income * 0;
            System.out.println("Tax payable:- " + tax);
        } else if ((income >= 500000) && (income < 1000000)) {
            tax = income * 0.2;
            System.out.println(tax);
        } else {
            tax = income * 0.3;
            System.out.println(tax);

        }

    }
}
