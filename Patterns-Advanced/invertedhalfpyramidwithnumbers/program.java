package invertedhalfpyramidwithnumbers;

public class program {

    public static void printPattern(int input) {

        System.out.println("Approach 1\n");
        int counter = input;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= counter; j++) {
                System.out.print(j + " ");
            }
            counter--;
            System.out.println();

        }

        System.out.println("\nApproach 2\n");

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= input - i + 1; j++) {
                System.out.print(j + " ");
            }
            counter--;
            System.out.println();

        }

    }

    public static void main(String[] args) {

        printPattern(5);

    }
}
