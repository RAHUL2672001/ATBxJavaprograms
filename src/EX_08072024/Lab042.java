package EX_08072024;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        //Arrays->New
        //len - 3
        int[] marks=new int[3];
        //index- 0,1,2
        //len-3
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc =new Scanner(System.in);



        marks[0]=sc.nextInt();
        marks[1]=92;
        marks[2]=94;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        //boolean[] is_Married= {true,false,true};
        //to print
       // for (int i = 0; i < marks.length; i++) {
            //i=0,1,2
          //  System.out.println(i+"->" +marks[i]);

            String weekdays[]={"sunday","Monday","Tuesday","Wednesday"};
            for (int i = 0; i < weekdays.length; i++) {
                System.out.println(weekdays[i]);

            }

        }


    }

