package methodoverriding;

public class super_funcn {

    //super()
    //1.use super with variable
    //2.use super with Methods
    //3.use super with Constructor

    //super keyword in java is a refrence variable that allows a subclass- child class

    //to refer to its parent class
    public static void main(String[] args) {
        car s = new car();
        s.display();
    }
    }



    class car extends vehicle {
        public int maxspeed = 281;
        car(){

            super(10);  //constructor chaining
            System.out.println("DC car");
        }

        public void display() {
            System.out.println("car speed is->" + this.maxspeed);
            System.out.println("vehicle speed is->" + super.maxSpeed);
            super.Message();
            this.Message();
        }
@Override
        void Message() {
            System.out.println("hello vehicle");
        }
    }

        class vehicle {
            public int maxSpeed = 180;
            vehicle(){
                System.out.println("DC vehicle");

            }
            vehicle(int a){
                System.out.println("PC vehicle");
            }

            void Message() {
                System.out.println("hello vehicle");
            }
        }
