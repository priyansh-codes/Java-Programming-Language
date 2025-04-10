package function;

public class BinomialCoefficientFinder {

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateBinomialCoefficient(int n , int r){
        int a = calculateFactorial(n);
        int d = calculateFactorial(r);
        int c = calculateFactorial(n-r);

        int result = a/(d*c);
        return result;
    }

    public static void main(String[] args) {

        int a = 5 , b = 2;
        System.out.println(calculateBinomialCoefficient(a,b));

    }
}
