package EX_08072024;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Alphabet");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a':
                System.out.println("its a vowel");
                break;
            case 'e':
                System.out.println("its a vowel");
                break;
            case 'i':
                System.out.println("its a vowel");
                break;
            case 'o':
                System.out.println("its a vowel");
                break;
            case 'u':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its a consonant");
        }
    }
}
