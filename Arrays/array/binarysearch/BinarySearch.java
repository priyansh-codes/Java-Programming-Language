package array.binarysearch;

public class BinarySearch {

    public static int binarySearch(int A[], int key) {

        int start = 0, end = A.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (A[mid] == key) {
                return mid;
            }

            if (A[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int index = binarySearch(numbers, 13);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }

    }
}
