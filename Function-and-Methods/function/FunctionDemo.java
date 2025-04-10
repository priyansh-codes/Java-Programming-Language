package function;

public class FunctionDemo {

    public static void HelloWorldPrinter() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;                                        //returning nothing as return type is void, thus not necessary
    }

    public static void main(String[] args) {

        HelloWorldPrinter();                          //Function call

    }
}
