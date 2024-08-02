package EX_08072024;

public class Lab038 {
    public static void main(String[] args) {
        //firebuzz program.

        for (int i=1;i<=100;i++){
            if(i%3==0 && i%5 ==0) {
                System.out.println("FireBuzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);

            }
        }
        }
    }

