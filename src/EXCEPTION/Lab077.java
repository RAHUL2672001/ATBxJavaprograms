package EXCEPTION;

public class Lab077 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i = new Integer[2];
            System.out.println(i[3]); //unchecked - ArrayIndexOutBoundsException
        } catch ( Exception e) {
            System.out.println("ArrayIndexOutOfBound");

        } finally {
            //File.close,sc.close,sqlconnection.close
            System.out.println("End of program");
        }
    }
}
