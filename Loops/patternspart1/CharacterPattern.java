package patternspart1;

public class CharacterPattern {
    public static void main(String[] args) {

        /* Print STAR pattern

         A
         B C
         D E F
         G H I J
         K L M N O

         */

        char ch = 'A' ;

        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }

    }
}
