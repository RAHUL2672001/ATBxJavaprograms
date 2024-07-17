package EX_08072024;

public class Lab016 {
    public static void main(String[] args) {

        //type casting - source and destination conversion

        //Widening-Implicit , Explicit - lossless
        //Narrowing-Implicit, Explicit(with data type),loss

        //Widening
        byte b=10;
        int a=b;                      //VALID-Implicit Casting - JVM
        int a1=(int)b;               //VALID - Explicit Casting

        //Narrowing
        int val=300;
       // byte b1=val;             //invalid - Implicit casting-JVM
        byte b1 =(byte)val;             //invalid-Explicit casting
        System.out.println(b1);

        //some more examples
        int course=100;
        float GST= 18.45F;

        float total_price= course+GST;   // EXPLICIT NARROWING
        System.out.println(total_price);

    }
}
