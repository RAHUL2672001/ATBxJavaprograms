package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab084 {
    public static void main(String[] args) {
        List<String> MyList= new ArrayList<>();
        MyList.add("pramod");
        MyList.add("Mohit");
        MyList.add("Mihir");
        MyList.add("usage");

        System.out.println("--To Print Arraylist-1--");

        for (String str : MyList){
            System.out.println(str);
        }
        System.out.println("--To Print Arraylist-2--");

        for (int i = 0; i < MyList.size(); i++) {
            System.out.println(MyList.get(i));

        }
        System.out.println("--To Print Arraylist-3--");

        //Iterator
        Iterator<String> itr=MyList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
