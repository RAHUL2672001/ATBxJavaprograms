package GetterSetter;


//FIXED Encapsulation;

public class fixedInCap056 {


    public static void main(String[] args) {
        VWOLogin1 vwoLogin= new VWOLogin1("AMIT","2323");
        System.out.println(vwoLogin.getUsername());
        System.out.println(vwoLogin.getPassword());
        vwoLogin.setUsername("Rahul");
        System.out.println(vwoLogin.getUsername());
        //write a code to authenticate
        //isAUth =true

        vwoLogin.setPassword("1234",false);



    }
}
    class VWOLogin1 {
        //Data MEMBERS
        private String username;
       private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password,boolean isAuth) {
            if (isAuth){

            }else {
                System.out.println("Not Allowed");
            }
            this.password = password;
        }

        public VWOLogin1(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

