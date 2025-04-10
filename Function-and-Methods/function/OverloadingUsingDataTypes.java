package function;

public class OverloadingUsingDataTypes {

    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println("Called int sum function:-  "+sum(12,24));
        System.out.println("Called float sum function:-  "+sum(12.23f,91.283f));


    }
}
