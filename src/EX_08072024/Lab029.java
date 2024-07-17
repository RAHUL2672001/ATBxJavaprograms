package EX_08072024;

public class Lab029 {
    public static void main(String[] args) {

        int itemcode = 001;
        switch (itemcode){
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a Desktop");
            case 003,004 -> System.out.println("It is a Mobile Phone");
            default -> System.out.println("no gadget");
        }
    }

}
