package Oct.ex_02102024_objectClass;

public class Lab93_ObjectClass {
    public static void main(String[] args) {
        //object class - OOps
        //String Class - Reference
        //Array
         //for each
        //2d nested for loop
        //yet to learn all these concepts

        //Class - blue print to create something
        //object -  created from the class

        Lab94_ATBStudents amit = new Lab94_ATBStudents();
        amit.age=43;

        //here amit is the reference of the class

        Lab94_ATBStudents sai = new Lab94_ATBStudents();
        sai.age=24;

        System.out.println(amit);
        System.out.println(sai);

        //Oct.ex_02102024_objectClass.Lab94_ATBStudents@6acbcfc0 - pointing different locations - so it has a unique location
        // and identity
        //Oct.ex_02102024_objectClass.Lab94_ATBStudents@5f184fc6


    }
}
