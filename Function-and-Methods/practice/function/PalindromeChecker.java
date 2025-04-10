package practice.function;

public class PalindromeChecker {

    //Question 2 : Write a method named isEven that accepts an int argument. The method
    //should return true if the argument is even, or false otherwise.

    public static boolean isPalindrome(int input) {
        int copyInput = input;
        int reversedInput = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            reversedInput = (reversedInput * 10) + lastDigit;
            input = input / 10;
        }

        return copyInput == reversedInput;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1122332211));


    }
}
