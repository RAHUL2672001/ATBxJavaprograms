package EX_05082024;

import java.security.PrivateKey;

public class ATBPerson {
    String name;
    long phone ;


    //DC

   public ATBPerson() {
        System.out.println("Object is Created");
    }

    public ATBPerson(long phoneNumber, String nameGiven) {
        this.phone = phoneNumber;
        this.name = nameGiven;
    }

    public ATBPerson(String nameGiven) {
        this.name = nameGiven;



    }


    }



