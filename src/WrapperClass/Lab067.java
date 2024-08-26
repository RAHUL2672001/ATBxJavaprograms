package WrapperClass;

public class Lab067 {
    //anonymous class
    public static void main(String[] args) {
        ABC a=new ABC() {
            @Override
            public void m1() {

            }

            @Override
            public void m2() {

            }
        };
        BCA A1=new BCA() {
            @Override
            void m3() {

            }
        };
    }
}


interface ABC{
    void m1();
    void m2();

}
abstract class BCA{
    abstract void m3();
}