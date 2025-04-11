package floydtriangle;

public class Program {

    public static void printPattern(int input) {

        int counter = 0;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                counter++;
                System.out.print(counter + " ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        printPattern(5);

    }
}
