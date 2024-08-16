package EX_05082024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;


    //Default Constructor
    BankAccount(){
        bankName="SBI";
        bankCode= "3214";
        balance=2323;
    }

    //parametrized constructor
    BankAccount(String bName,int bal,String bCode){
        this.bankName=bName;
        this.bankCode=bCode;
        this.balance=bal;

    }


    void printDetails(){
        System.out.println("Bank Name->" + bankName);
        System.out.println("Bank Code->" + bankCode);
        System.out.println("Bal->" + balance);

    }

    }








