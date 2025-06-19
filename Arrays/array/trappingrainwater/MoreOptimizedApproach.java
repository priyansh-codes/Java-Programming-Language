package array.trappingrainwater;

public class MoreOptimizedApproach {

    public static int TrappingRainwater(int a[]) {

        int result = 0;
        int leftPointer = 0;
        int rightPointer = a.length - 1;
        int leftBoundary = a[leftPointer];
        int rightBoundary = a[rightPointer];


        while (leftPointer <= rightPointer) {

            if (leftBoundary <= rightBoundary) {

                if (a[leftPointer] > leftBoundary) {
                    leftBoundary = a[leftPointer];
                } else {
                    result += (leftBoundary - a[leftPointer]);
                }
                leftPointer++;

            } else {

                if (a[rightPointer] >= rightBoundary) {
                    rightBoundary = a[rightPointer];
                } else {
                    result += rightBoundary - a[rightPointer];
                }
                rightPointer--;

            }

        }
        return result;

    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrappingRainwater(height));

    }

}
