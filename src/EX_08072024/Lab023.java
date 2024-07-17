package EX_08072024;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the Num 2");
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1,num2)); // this is math.max function used to identify the maximum number

        //we can use if loop also

        if (num1>num2) {
            System.out.println(num1);
        }else if (num1<num2) {
            System.out.println(num2);
        }else{
            System.out.println("Both are equal");


        }


    }
}
