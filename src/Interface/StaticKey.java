package Interface;

public class StaticKey {
    //static
    //block
    //data number
    //function
    //class
    public static void main(String[] args) {
        ATB a1 =new ATB("AMIT");
        System.out.println(a1.getName());
        System.out.println(ATB.courseName);
        ATB.DoAssignment();

    }
    static {
        System.out.println("i will execute");
    }
}

class ATB{
    private String name;
    static String courseName="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCourseName() {
        return courseName;
    }

    public static void setCourseName(String courseName) {
        ATB.courseName = courseName;
    }

    public ATB(String name) {
        this.name = name;
    }
    static void DoAssignment(){
        System.out.println("Do Assignment");
    }
}