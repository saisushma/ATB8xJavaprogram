package Oct.ex_04102024_COnstructors_PC1;

public class Dog1 {
    String name;
    int age;
    int legs;
    String breed;

    //default constructor
    Dog1(){
        System.out.println("I'm a DC");
    }

    Dog1(String breed){
        System.out.println("Im PC");
        this.breed = breed;

    }
    Dog1(String breed, String name, int age)
    {
        System.out.println("Im PC");
        this.breed = breed;
        this.name= name;
        this.age=age;

    }

    void walk(){

    }

}
