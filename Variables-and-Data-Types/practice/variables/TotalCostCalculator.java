package practice.variables;

import java.util.Scanner;

public class TotalCostCalculator {
    public static void main(String[] args) {

        //Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
        //an eraser. You have to output the total cost of the items back to the user as their bill.
        //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        Scanner sc = new Scanner(System.in);
        float item1;
        float item2;
        float item3;
        float sum;
        float totalBill;

        System.out.println("Enter price of the pencil:- ");
        item1 = sc.nextFloat();

        System.out.println("Enter price of the pen:- ");
        item2 = sc.nextFloat();

        System.out.println("Enter PRice of the eraser:- ");
        item3 = sc.nextFloat();

        sum = item1 + item2 + item3;
        totalBill = sum + (0.18f * sum);

        System.out.println("The total cost of the items is " + sum + " Rupees which with 18% GST gives a total bill as " + totalBill + " Rupees.");

    }
}
