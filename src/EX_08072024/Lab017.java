package EX_08072024;

public class Lab017 {
    public static void main(String[] args) {
        //Increment(++) / Decrement (--) Operators
        //Pre and Post
        //Ready

        //pre-increment ++operand
        //Value is incremented first and then stored in result.
        int a=10;
        int b= ++a;  //a=a+1;

        // Exp = 11, a =11
        System.out.println(a);
        System.out.println(b);

        //post-increment ++operand
        //Value is stored in the result first and incremented later.
        int a1=10;
        int b2= a++;  //a=a+1;

        // Exp = 10, a =11
        System.out.println(a1);
        System.out.println(b2);

    }
}
