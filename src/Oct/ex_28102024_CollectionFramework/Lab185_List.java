package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab185_List {

    public static void main(String[] args) {

        List list = List.of("Apple","banana","gouva");

        //of is a static method is interface that can contain the definition

        System.out.println(list);
        System.out.println(list.size());
        //list.add("grapes); //unsupported operation exception
        //but to acess add we use the child

        List l1 = new ArrayList();

        l1.add(1);
        l1.add(1);
        l1.add("sai");
        l1.add(true);
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains(true));
        System.out.println(l1.isEmpty());
        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(1));








    }
}
