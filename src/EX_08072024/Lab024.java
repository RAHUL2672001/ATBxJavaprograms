package EX_08072024;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        //Grade Calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >=60 && score <=69) {
            grade = 'D';
        }else {
            grade='F';}

            System.out.println("Your Grade is -> "+grade);

         sc.close();
        }
    }

