package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab083 {
    public static void main(String[] args) {
        List name= new ArrayList<>();
        name.add("rahul");
        name.add("mohit");
        name.add("sagar");
        name.add("Harshita");
        Collections.sort(name);
        for (int i = 0; i <name.size() ; i++) {
            System.out.println(name.get(i));

            //Enhanced For loop
            for (Object o:name){
                System.out.println(o);
            }

        }

    }
}
