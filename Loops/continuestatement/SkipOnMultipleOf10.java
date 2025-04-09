package continuestatement;

import java.util.Scanner;

public class SkipOnMultipleOf10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Enter the number:- ");
            input = sc.nextInt();
            if (input%10==0){
                continue;
            }
            System.out.println("Your input was "+input);
        } while (true);

    }
}
