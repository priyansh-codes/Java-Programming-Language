package array.subarrays;

public class PrintSubarrays {

    public static void subArray(int numbers[]){

        for (int i=0;i<numbers.length;i++){

            for (int j=i;j<numbers.length;j++){

                for (int k=i;k<=j;k++){

                    System.out.print(numbers[k]+ " ");

                }
                System.out.println();

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {

        int a[] = {2,4,6,8,10};
        subArray(a);

    }

}
