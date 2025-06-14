package array.trappingrainwater;

public class NaiveApproach {

    public static int TrappingRainwater(int a[]) {

        int result = 0;
        for (int i = 1; i < a.length - 1; i++) {

            //Step 1 : Find Left and Right boundary
            int leftBoundary = a[i];

            for (int j = 0; j < i; j++) {
                if (a[j] > leftBoundary) {
                    leftBoundary = a[j];
                }
            }

            int rightBoundary = a[i];

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > rightBoundary) {
                    rightBoundary = a[j];
                }
            }

            //Step 2: Find water level i.e. minimum of left and right boundary
            int waterLevel;
            if (rightBoundary > leftBoundary) {
                waterLevel = leftBoundary;
            } else {
                waterLevel = rightBoundary;
            }

            //Step 3: Find trapped water i.e. ( waterLevel - current height )
            int trappedWater = waterLevel - a[i];


            //Step 4: Add trappedWater to result
            result += trappedWater;

        }

        return result;

    }

    public static void main(String[] args) {

        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrappingRainwater(height));

    }

}
