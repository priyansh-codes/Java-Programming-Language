package elseif;

public class ElseIfDemo {
    public static void main(String[] args) {

        int age = 18;

        if (age >= 18) {
            System.out.println("Adult");
        } else if ((age > 13) && (age < 18)) {
            System.out.println("Teenager");
            System.out.println("Child");
        }

    }
}
