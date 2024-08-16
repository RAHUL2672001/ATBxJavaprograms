package EX_05082024;

public class Lab055 {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankName);
        System.out.println(ba1.bankCode);
        System.out.println(ba1.balance);


        BankAccount baicici = new BankAccount("ICICI", 3214, "ICICI002");
        System.out.println(baicici.bankName);
        System.out.println(baicici.bankCode);
        System.out.println(baicici.balance);

    }
}







