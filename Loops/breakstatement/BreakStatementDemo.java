package breakstatement;

public class BreakStatementDemo {
    public static void main(String[] args) {

        // Run a loop from 1 to 10, but exit the loop if number reaches 3

        System.out.println("Using while loop");
        int number = 1;

        while (number <= 10) {
            System.out.println(number);
            if (number == 3) {
                break;
            }
            number++;
        }

        System.out.println();

        System.out.println("Using for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }

        System.out.println();

        System.out.println("Using do while loop");
        int number1 = 1;
        do {
            System.out.println(number1);
            if (number1 == 3) {
                break;
            }
            number1++;
        } while (number1 <= 10);

        System.out.println("\nNumber reached ! Loop has ended");

    }

}
