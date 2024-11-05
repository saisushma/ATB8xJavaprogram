package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab186_ArrayList {

    public static void main(String[] args) {

        List list = List.of("Apple","banana","gouva");

        //of is a static method is interface that can contain the definition

        System.out.println(list);
        System.out.println(list.size());
        //list.add("grapes); //unsupported operation exception
        //but to acess add we use the child

        List l1 = new ArrayList();

        l1.add("bread");
        l1.add("butter");
        l1.add("banana");
        l1.add("milk");
        l1.add("cheese");

        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains(true));
        System.out.println(l1.isEmpty());
        System.out.println(l1.indexOf(1));
        System.out.println(l1.lastIndexOf(1));

        System.out.println("-------------------------------------");
        for(int i = 0; i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        System.out.println("----------------------");
        for(Object o : list)
        {
            System.out.println(o);
        }







    }
}
