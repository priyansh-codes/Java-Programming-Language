package patternspart1;

public class InvertedStarPattern {
    public static void main(String[] args) {

        /* Print STAR pattern

         * * * * *
         * * * *
         * * *
         * *
         *

         */

        for (int line = 1; line <= 5; line++) {
            for (int star = 5; star >= line; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
