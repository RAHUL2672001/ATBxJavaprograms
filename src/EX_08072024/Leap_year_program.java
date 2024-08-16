package EX_08072024;

import java.util.Scanner;

public class Leap_year_program {
    public static void main(String[] args) {
        //create a program that determines whether a given year is leap year
        //a leap year is divisible by 4
        //but not by 100 unless it is divisible by 400
        //use an if-else statement to make is determination


        //1.get clarity on the inputs to make this determination


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int year = sc.nextInt();

                 // Replace with the year you want to check
                boolean isLeapYear = false;

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    isLeapYear = true;
                }

                if (isLeapYear) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }






