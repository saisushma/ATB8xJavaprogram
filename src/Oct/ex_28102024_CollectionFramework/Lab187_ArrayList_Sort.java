package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab187_ArrayList_Sort {
    public static void main(String[] args) {


        List marks = new ArrayList();

        marks.add(89);
        marks.add(95);
        marks.add(99);
        marks.add(74);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}

