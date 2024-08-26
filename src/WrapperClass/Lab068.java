package WrapperClass;

public class Lab068 {

    //Nested class
    public static void main(String[] args) {
        car c = new car("lambo");
        c.drive();
        System.out.println(c.make);

        //To access the inner the class object creation.
        car.Gearbox CG =c.new Gearbox();
        CG.m2();
    }
}

class car{
    String make;

    public car(String make) {
        this.make = make;
    }
    //method
    void drive(){
        System.out.println("you can drive a car");
    }
    class Gearbox {

        void m2() {
            System.out.println("m2");

        }

        class nutbolt {

        }


    }
    }

