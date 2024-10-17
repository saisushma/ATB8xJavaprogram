package Oct.ex_16102024.Static;

import Oct.ex_14102024_Abstraction.realx.Son;

public class Lab123 {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2 = new Student(20);
        System.out.println(Student.school_name);
        Student.school_name="XYZ";
        System.out.println(Student.school_name);

    }

}


class Student{
    int age; //instance variable(non-static)
    static String school_name = "ABC";//static variable

    {
        System.out.println("IIB");
        System.out.println("here you can write a code what you want to do when object is created ");
    }

    static{
        System.out.println("SIB");
        System.out.println("Loaded once, when class is loaded.");
    }
    public Student(int age) {
        this.age = age;
    }
}