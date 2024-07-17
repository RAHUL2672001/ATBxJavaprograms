package EX_08072024;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // this function is used to user input
        System.out.println("Enter the Num");
        int user_input=sc.nextInt();
        System.out.println(user_input);


        if (user_input%2 == 0)
        {
            System.out.println("Num is even");
        }
          else {
            System.out.println("num is odd");
        }



    }
}
