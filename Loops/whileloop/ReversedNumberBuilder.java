package whileloop;

public class ReversedNumberBuilder {

    public static void main(String[] args) {

        int number = 12345;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println(reversedNumber);

    }

}
