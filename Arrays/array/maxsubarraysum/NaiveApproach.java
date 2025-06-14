package array.maxsubarraysum;

public class NaiveApproach {

    public static void MaxSubArray(int a[]){

        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){

            int currentSum = 0;

            for (int j=i;j<a.length;j++){

                currentSum += a[j];
                System.out.println(currentSum);

                if (currentSum>maxSum){
                    maxSum = currentSum;
                }

            }
            System.out.println();

        }

        System.out.println("Max sum is: " +maxSum);

    }

    public static void main(String[] args) {

        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaxSubArray(a);

    }

}
