package array.linearsearch;

public class LargestElement {

    public static int largestElement(int A[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }
            if (A[i] < smallest) {
                smallest = A[i];
            }
        }
        System.out.println("Smallest is:- " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int A[] = {11, 2, 6, 3, 15};
        System.out.println("Largest is:- " + largestElement(A));

    }
}
