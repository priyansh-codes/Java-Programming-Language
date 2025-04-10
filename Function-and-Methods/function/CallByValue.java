package function;

public class CallByValue {

    public static int swap(int formalInput) {               // 'formalInput' is a copy of 'actualInput'.
        formalInput = 10;                                  //Changing 'formalInput' here only affects this local method.
        return formalInput;
    }

    /*
    The method receives a copy of the actual parameter. Any changes made to the parameter inside the method
    are only reflected within the method's stack frame. Once the method finishes, its stack frame is destroyed,
    and the original variable (actualInput) remains unchanged in the main method.
    That’s why printing actualInput still gives 5.


     */

    public static void main(String[] args) {
        int actualInput = 5;
        swap(actualInput);
        System.out.println(actualInput);
    }
}
