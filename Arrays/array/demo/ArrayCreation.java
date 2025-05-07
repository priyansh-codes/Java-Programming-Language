package array.demo;

public class ArrayCreation {

    public static void main(String[] args) {

        int marks[] = new int[50];

        String basket[] = {"Apple", "Orange", "Banana"};

        int A[] = new int[3];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;

        System.out.println(basket[0]);
        System.out.println(basket[1]);
        System.out.println(basket[2]);

        System.out.println(A[0]);
        System.out.println(A[1]);
        System.out.println(A[2]);

        System.out.println("Length of basket[] is: " + basket.length);

    }

}
