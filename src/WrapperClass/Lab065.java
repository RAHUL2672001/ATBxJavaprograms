package WrapperClass;

public class Lab065 {
    public static void main(String[] args) {
        String num="10";
        //int a = (int)num;
        Integer a= Integer.valueOf(num);
        System.out.println(a);

        //String to Primitive
        int a2= Integer.parseInt(num);
        System.out.println(a2);

        Double d=3.14; //stored in heap area
        double value=d.doubleValue();//stored in continuous memory
        System.out.println(d);
        System.out.println(value);

        String S1= "Rahul";   //SCP (String constant pool)
        String S2= new String("Rahul");  //Heap Area
    }
}
