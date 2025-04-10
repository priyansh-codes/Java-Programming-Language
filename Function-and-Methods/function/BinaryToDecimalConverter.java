package function;

public class BinaryToDecimalConverter {

    public static void toDecimal(int input) {

        int storeInput = input;
        int pow = 0;
        int decNum = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            input = input / 10;
        }

        System.out.println("Decimal of binary number " + storeInput + " is " + decNum);

    }

    public static void main(String[] args) {

        toDecimal(101);


    }
}
