package hollowrectangle;

import java.util.Scanner;

public class Program {

    public static void printStar(int totRows, int totCols) {

        for (int i = 1; i <= totRows; i++) {

            for (int j = 1; j <= totCols; j++) {

                if ((i == 1) || (i == totRows) || (j == 1) || (j == totCols)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputRows;
        int inputCols;

        System.out.println("Enter number of rows:- ");
        inputRows = sc.nextInt();
        System.out.println("Enter number of columns:- ");
        inputCols = sc.nextInt();

        printStar(inputRows, inputCols);


    }
}
