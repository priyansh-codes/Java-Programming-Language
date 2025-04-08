package arithmetic;

public class UnaryOperators {
    public static void main(String[] args) {

        int cups = 5;

        System.out.println("Initial cups: " + cups);

        System.out.println();

        //Pre-increment
        System.out.println("Friend 1 sees (" + (++cups) + ") cups");  //cups = cups +1 , then return -> 6
        System.out.println("Now cups:- " + cups);  // still 6

        System.out.println();

        //Post-increment
        System.out.println("Friend 2 sees (" + (cups++) + ") cups");  //returns current 6, then cups = cups + 1
        System.out.println("Now cups:- " + cups);  // now 7

        System.out.println();

        //Pre-decrement
        System.out.println("Friend 3 sees (" + (--cups) + ") cups");  //cups= cups -1 ,then return -> 6
        System.out.println("Now cups:- " + cups);  // still 6

        System.out.println();

        //Post-decrement
        System.out.println("Friend 4 sees (" + (cups--) + ") cups");  //returns 6 , then cups = cups -1
        System.out.println("Now cups:- " + cups);  // now 5

    }
}
