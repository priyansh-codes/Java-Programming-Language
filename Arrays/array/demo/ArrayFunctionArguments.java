package array.demo;

public class ArrayFunctionArguments {

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {

        int A[] = {89, 95, 99};
        update(A);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }


        //Arrays are passed as "Pass by reference"


    }
}
