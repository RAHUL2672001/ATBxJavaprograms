package EX_08072024;

import java.util.Arrays;

public class Lab047 {
    public static void main(String[] args) {


        //find the max and min in salary arrays
        //infosys interview.

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8};

        int max = salaries[0];
        int min = salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                max = salaries[i];
            }
            if (min > salaries[i]) {
                min = salaries[i];
            }
        }
        System.out.println(max);
        System.out.println(min);



    }
}
