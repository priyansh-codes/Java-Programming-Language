package forloop;

public class SquarePatternPrinter {
    public static void main(String[] args) {

        System.out.println("Using for loop:-");

        for (int i = 1; i <= 4; i++) {
            System.out.println("* * * *");
        }

        System.out.println();
        System.out.println("Using while loop:- ");

        int line = 1;
        while (line <= 4) {
            System.out.println("* * * *");
            line++;
        }

    }
}
