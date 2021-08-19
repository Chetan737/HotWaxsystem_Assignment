package SynchronisedDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
By Default ArrayList in java is not Synchronised
ArrayList is not threadSafe

two ways to create arraylist synchronised
1) Collections.synchronisedList() - method return synchronisedList
2)  copyOnWriteArrayList : class- thread safe variant of arraylist

 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //Collections.synchronisedList()


        List<String> listnames= Collections.synchronizedList(new ArrayList<>());
        listnames.add("Chetan");
        listnames.add("Yash");
        listnames.add("Honey");

        //add , Remove ,:- We dont need Explicit synchronoization

        //to fetech the value from the synchronisedList  we have tyo use Explicit synchronoization
        synchronized (listnames){ //this is a Synchronised block in java
            for (Object i:listnames)
            {
                System.out.println(i);
            }
        }



        // copyOnWriteArrayList : class- thread safe variant of arraylist

        CopyOnWriteArrayList<String> sList=new CopyOnWriteArrayList<String>();
        sList.add("\nJava");
        sList.add("Python");
        sList.add("C++");

        //We dont need Explicit synchronoization for any operation adding ,deleting , traversing

        for (String s:sList)
        {
            System.out.println(s);
        }





    }
}
