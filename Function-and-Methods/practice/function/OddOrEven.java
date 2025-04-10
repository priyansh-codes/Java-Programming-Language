package practice.function;

import java.util.Scanner;

public class OddOrEven {

//    Question 2 : Write a method named isEven that accepts an int argument. The method should
//    return true if the argument is even, or false otherwise.

    public static boolean isEven(int input){

        boolean answer = true;
        if (input%2==0){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Enter the number:- (true is even , false is odd)");
        input = sc.nextInt();

        System.out.println(isEven(input));

    }
}
