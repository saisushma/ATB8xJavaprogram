package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab189_ArrayList_iterator {

    public static void main(String[] args) {

        List<String> myList = new ArrayList();
        myList.add("Pramod");
        myList.add("Amit");
        myList.add("Dutta");

        for(String str : myList)
        {
            System.out.println(str);
        }

        System.out.println("========================");

        for (int i = 0; i< myList.size();i++){

            System.out.println(myList.get(i));
        }
        System.out.println("=====================================");

        //by iterators

        Iterator<String> it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
