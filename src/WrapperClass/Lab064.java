package WrapperClass;

public class Lab064 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a=10;
        Integer b=a;
        //Integer max value
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);


        //wrapper to primitive
        Integer a2=42;  //Auto Boxing - int -> Integer
        int value=a2;  // UnBoxing - Integer -> int
        System.out.println(a2);
        System.out.println(value);
    }
}
