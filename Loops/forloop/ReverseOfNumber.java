package forloop;

public class ReverseOfNumber {
    public static void main(String[] args) {

        int number = 12345;

        for (int i = 0; number > i; ) {                   //Alternate approach: for (; number > 0 ;)
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number /= 10;                                  //number = number / 10;
        }

    }
}
