package triangle01;

public class Program {

    public static void printPattern(int input) {

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }

            }

            System.out.println();

        }

    }


    public static void main(String[] args) {

        printPattern(5);


    }
}
