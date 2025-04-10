package function;

public class OverloadingUsingParameters {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("Using two parameters:- "+sum(2, 6));
        System.out.println("Using three parameters:- "+sum(2, 4, 2));


    }
}
