package Interface;

public class LAB062 {
    public static void main(String[] args) {

    }
}
interface I{}
class A{} //CONCRETE CLASS
class B{}  //CONCRETE CLASS
abstract  class C{} //non concrete class
class test1 extends A{}
class test2 extends B{}
//class test3 extends A,B{}  //Multiple Inheritance not possible
class test0 implements I{}
interface T1{}
interface T2{}
class Test4 implements T1,T2{}  //MULTIPLE INHERITANCE ALLOWED
class Test5 extends A implements T1,T2{}
//class Test6 implements T1 extends A{}
//interface I3 extends A{}
//interface I4 implements A{}
interface I6 extends T1,T2{}
//interface I7 extends C{}


