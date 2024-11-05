package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class Lab184_Array_List_CF {
    public static void main(String[] args) {

        //collection is an interface
        //List is also an interface

        //shoping - bread milk, curd, panner, buttermilk
        //collections of items - can be with same or different data types

        ArrayList studentsList = new ArrayList();
        studentsList.add("Pramod");
        studentsList.add("Dutta");
        studentsList.add("Dutta"); //duplicates are allowed
        studentsList.add(true);
        studentsList.add("anil");
        studentsList.add(123); //different data types are allowed
        studentsList.add(null);

        System.out.println(studentsList);


    }
}
