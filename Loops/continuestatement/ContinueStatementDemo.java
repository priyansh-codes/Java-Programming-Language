package continuestatement;

public class ContinueStatementDemo {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("Program has ended.");

    }
}
