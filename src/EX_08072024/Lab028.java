package EX_08072024;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");







        }
    }
}
