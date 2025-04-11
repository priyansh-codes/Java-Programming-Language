package invertedrotatedhalfpyramid;

public class Program {

    public static void printPattern(int totRows) {

        for (int i = 1; i <= totRows; i++) {

            //print spaces
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }

            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printPattern(4);


    }
}
