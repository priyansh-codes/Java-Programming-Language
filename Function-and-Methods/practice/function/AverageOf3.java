package practice.function;

import java.util.Scanner;

public class AverageOf3 {

//    Question 1 : Write a Java method to compute the average of three numbers..

    public static float calculateAvg(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float input1, input2, input3;

        System.out.println("Enter three numbers to find average:- ");
        input1 = sc.nextFloat();
        input2 = sc.nextFloat();
        input3 = sc.nextFloat();

        System.out.println("The average is:- " + calculateAvg(input1, input2, input3));

    }
}
