package EXCEPTION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LAB076 {
    public static void main(String[] args) throws FileNotFoundException {
        //Exception
        //checked - JVM Knows
        try {
            FileInputStream file= new FileInputStream("LOG C.DRIVE");
        } catch (FileNotFoundException e) {
            System.out.println("NO file Found");

        }


        //Unchecked
        try {
            int a=10;
            int c=a/0;
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("div by zero error");
        } finally {
            System.out.println("I will execute anyhow");
        }


    }
}


