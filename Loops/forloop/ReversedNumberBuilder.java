package forloop;

public class ReversedNumberBuilder {
    public static void main(String[] args) {

        int number = 123456;
        int reversedNumber = 0;

        for (; number > 0; ) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        System.out.println(reversedNumber);

    }
}
