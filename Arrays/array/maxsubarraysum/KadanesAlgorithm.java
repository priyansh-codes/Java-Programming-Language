package array.maxsubarraysum;

public class KadanesAlgorithm {

    public static void KadanesAlgorithm(int a[]) {

        int maxSum = a[0];
        int sum = a[0];

        for (int i = 1; i < a.length; i++) {

            if (sum >= 0) {
                sum += a[i];
            } else {
                sum = a[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }

            System.out.println("Sum- " + sum);
            System.out.println("Max- " + maxSum);
            System.out.println();

        }

        System.out.println("Maximum sum is : " + maxSum);

    }

    public static void main(String[] args) {

        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadanesAlgorithm(a);

    }

}
