package EXCEPTION;

public class Lab075 {
    public static void main(String[] args) {
        System.out.println("start of program");
        String ip=args[0]; //arrayindexout of bound exception
        int a = Integer.parseInt(ip); //number format exception
        int b = 10/a; //Arithmetic Exception
        System.out.println(b);
    }
}
