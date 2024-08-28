package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Lab085 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(56);
        marks.add(86);
        marks.add(71);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);


        //vector legacy class
        Vector v =  new Vector();
        v.add("pramod");
        v.add("negi");
        v.add("mohit");
        System.out.println(v);

        //only problem with vector
        //it is Thread safe, synchronized
        //it will time-consuming
        //one by one - usage
        //slower

    }
}
