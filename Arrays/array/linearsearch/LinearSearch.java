package array.linearsearch;

public class LinearSearch {

    public static int linearSearch(int A[], int key) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 10, 42, 32, 54, 6, 13, 65};
        int key = 54;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key found at index:- " + index);
        }

    }
}
