package array.reversal;

public class ReverseArray {

    public static void reverse(int a[]) {

        int first = 0, last = a.length - 1;

        while (first < last) {

            int temp = a[last];
            a[last] = a[first];
            a[first] = temp;

            first++;
            last--;

        }

    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        reverse(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
