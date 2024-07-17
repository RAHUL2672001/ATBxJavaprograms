package EX_08072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {
        //web Automation
        //i will ask the user which browser you want me to run th code
        //chrome=>start chrome,firefox etc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name. to excute the code");
        String Browsername = sc.next();
        Browsername= Browsername.toLowerCase(Locale.ROOT);

        switch (Browsername) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("starting the edge browser");
                break;
            default:
                System.out.println("you choose wrong browser");
        }
    }
}
