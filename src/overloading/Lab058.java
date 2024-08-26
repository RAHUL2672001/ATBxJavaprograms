package overloading;

public class Lab058 {
    public static void main(String[] args) {
        mathoperations math=new mathoperations();
        int Result =math.add(2,5);
        System.out.println(Result);

        double Result2=math.add_double(3.6,6.3);
        System.out.println(Result2);


        String Result3= math.Add("rahul","negi");
        System.out.println(Result3);

    }
}
