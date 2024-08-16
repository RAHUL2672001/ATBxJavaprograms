package GetterSetter;

public class Lab057 {
    public static void main(String[] args) {
        iciciBank Amit=new iciciBank("amit",100);
        //set the balance
        //admin
        Amit.setBal(100000,false);
        System.out.println(Amit.getBal());
        System.out.println(Amit.getBal());

        iciciBank admin=new iciciBank("admin",10000);
        admin.setBal(50000,true);
        System.out.println(admin.getBal());
        System.out.println(admin.getName());



    }
}
