package Nov.ex_04112024_collectionFrameWork_Set;

import java.util.HashSet;

public class Lab_HashSets180 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("banana");
        set.add("orange");
        set.add("Apple"); // this will not print as hastset doesnt allow duplicates
        System.out.println("set of elements "+set);


    }
}
