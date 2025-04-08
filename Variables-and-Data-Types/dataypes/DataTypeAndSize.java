package dataypes;

public class DataTypeAndSize {
    public static void main(String[] args) {

        int a = 10;
        char C = 'c';             //"int" & char are the data types , "a" & "C" are variables , "10" & 'c' are literals

        byte b = 1;  //1 byte
        short s = 2; //2 bytes
        char c = 'C'; //2 bytes
        boolean bool = true;  //1 byte
        int i = 4; //4 bytes
        long l = 123456789; //8 bytes
        float f = 11.11f; // 4 bytes
        double d = 8123456789012345678901234567890d; //8 bytes

        System.out.println(a);
        System.out.println(C);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);


    }
}
