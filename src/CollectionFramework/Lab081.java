package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab081 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==4){
                System.out.println("Found 4");
            }

        }

        List arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);

        arr.contains(1);
        System.out.println(arr.contains(1));

    }
}