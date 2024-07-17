package EX_08072024;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {  //program which day it is 1 to 7


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7,Tell what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("sun");
                break;
            case 2:
                System.out.println("mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("sat");
                break;
            default:
                System.out.println("No idea, what day is");
        }

    }

}
