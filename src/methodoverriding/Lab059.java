package methodoverriding;

public class Lab059 {
    //Method overriding | Runtime Poly

    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();

        Dog d1=new Dog();
        d1.bark();

        Dog dog_Ref=new Hound();
        dog_Ref.bark();
    }

}
