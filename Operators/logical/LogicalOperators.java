package logical;

public class LogicalOperators {
    public static void main(String[] args) {

        /*Logical operators (&&, ||, and !) are used to evaluate boolean expressions,
        combining or negating conditions to produce a boolean result (true or false) */

        //Logical AND (&&)
        System.out.println((3 > 1) && 2 < 3);   //Returns true only if both operands are true

        //Logical OR (||)
        System.out.println((3 > 1) || (2 < 1));  //Returns true if at least one operand is true, returns false only if both operands are false

        //Logical NOT (!)
        System.out.println((12 > 21));  //returns false , logically correct
        System.out.println(!(12 > 21)); //Reverses the boolean value, if the operand is true, it returns false, and vice versa.

    }
}
