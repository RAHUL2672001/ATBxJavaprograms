package WrapperClass;

public class Lab066 {
    public static void main(String[] args) {
        A a = new A();
        A a2= new A();
        a.age=12;
        System.out.println(a.discount);
        a.m2();
        A.m1(); //static
        //static does not need object refernce -true

    }


}

class A{
    int age=10;  //Instance variable
    static int discount=199;  //static variable
    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("Instance initialization block B");
    }
    static void m1(){
        System.out.println("m1");
    }
    void m2(){
        System.out.println("m2");
    }
}
