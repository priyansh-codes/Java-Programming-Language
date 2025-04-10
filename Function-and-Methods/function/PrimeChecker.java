package function;

public class PrimeChecker {

    public static boolean isPrime(int input) {

        if (input == 2) {
            return true;
        } else if (input <= 1) {
            return false;
        }
        boolean isPrime = true;

        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {

        if (isPrime(13)) {
            System.out.println("It is prime");
        } else {
            System.out.println("Not prime ");
        }


    }
}
