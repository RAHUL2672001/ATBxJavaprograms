package GetterSetter;

public class Lab056 {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("Admin","pass1234");
        vwoLogin.password="123";
        System.out.println(vwoLogin.password);

    }
}

class VWOLogin {

    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

