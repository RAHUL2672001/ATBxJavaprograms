package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab080 {
    public static void main(String[] args) {
        //Collection Framework.
        //collection - Interface
        //collection(I)-> List(I)
        //List (I)-> ArrayList, LinkedList,Vector,Stack

        //Shopping List, Marks List ,collection of items,Todo List,student List.

      //  Collection mylist3 = new ArrayList(); //Dynamic Dispatch
       // List mylist = new ArrayList();   //Dynamic  Dispatch

        ArrayList mylist2 = new ArrayList();
        mylist2.add("pramod");
        mylist2.add("rahul".toUpperCase());
        mylist2.add("lucky");
        mylist2.add("Mohit");

        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("rahul".toUpperCase()));
        String S1= (String) mylist2.get(1);
        System.out.println(S1);



    }
}
