package patternspart1;

public class HalfPyramidPattern {
    public static void main(String[] args) {

        /* Print STAR pattern

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

    }
}
