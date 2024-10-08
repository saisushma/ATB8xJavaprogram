package Oct.ex_04102024_COnstructors_PC;

public class DOg {

    String Name;
    int age;
    int legs;
    String breed;

    DOg(){
        System.out.println("Im DC");
        System.out.println("God is happy");
    }

    DOg(String breed)
    {
        System.out.println("Im PC");
        this.breed = breed;

    }

    DOg(String breed, String Name, int age)
    {
        System.out.println("Im PC");
        this.breed = breed;
        this.Name = Name;
        this.age = age;

    }

    void walk()
    {

    }
}
