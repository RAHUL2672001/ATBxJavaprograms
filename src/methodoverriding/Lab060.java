package methodoverriding;

public class Lab060 {
    public static void main(String[] args) {


        class student extends person {

            //is a relation-inheritance


            @Override
            void message() {
                System.out.println("I am student message");
            }

            void display() {
                super.message();

            }

        }

    }
}

class person{
    void message(){
        System.out.println("I am person message");
    }
}