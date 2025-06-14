package array.maxsubarraysum;

public class BruteForce {

    public static void MaxSubArray(int a[]) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {

                int currentSum = 0;

                for (int k = i; k <= j; k++) {

                    currentSum += a[k];

                }

                if (currentSum > max) {
                    max = currentSum;
                }

                System.out.println(currentSum);

            }
            System.out.println();
        }
        System.out.println("Max is " + max);

    }

    public static void main(String[] args) {

        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArray(a);

    }

}
