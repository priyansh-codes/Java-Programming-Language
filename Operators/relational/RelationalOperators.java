package relational;

public class RelationalOperators {
    public static void main(String[] args) {

        //Used to compare two values and return a boolean result

        int a = 10;
        int b = 3;
        int c = 10;

        // For primitive data types like int , boolean etc, "==" compares the value directly
        System.out.println(a == b);   //returns false

        System.out.println(a == c);   //returns true

        System.out.println(a != b);  //returns true

        System.out.println(a > b);  //returns true

        System.out.println(a < c);  //returns false

        System.out.println(a >= c);  //returns true


    }
}
