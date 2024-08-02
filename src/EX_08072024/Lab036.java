package EX_08072024;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        //factorial program

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to factorial" );
        int n= sc.nextInt();

        int fact = 1;

        for (int i =1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        }


    }

