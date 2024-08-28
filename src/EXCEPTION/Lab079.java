package EXCEPTION;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();

        if(x==0){
            try {
                throw new ArithmeticException("Enter non zero number");
            } catch (ArithmeticException e) {
                System.out.println("Exception");
            }

        }
        int a = 10/x;
        System.out.println(a);

    }
}
