package array.trappingrainwater;

public class OptimizedApproach {

    public static int TrappingRainwater(int a[]) {

        int result = 0;

        int leftBoundary[] = new int[a.length];
        int rightBoundary[] = new int[a.length];

        leftBoundary[0] = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            leftBoundary[i] = Math.max(a[i], leftBoundary[i - 1]);
        }

        rightBoundary[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rightBoundary[i] = Math.max(a[i], rightBoundary[i + 1]);
        }

        for (int i = 1; i < a.length - 1; i++) {

            int waterLevel;

            if (leftBoundary[i] > rightBoundary[i]) {
                waterLevel = rightBoundary[i];
            } else {
                waterLevel = leftBoundary[i];
            }

            int trappedWater = waterLevel - a[i];
            result += trappedWater;

        }

        return result;

    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrappingRainwater(height));

    }

}
