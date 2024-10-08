package Oct.ex_04102024_COnstructors_PC;

public class Lab99_Dog {
    public static void main(String[] args) {

        DOg gs = new DOg("german shepard");
        DOg bd = new DOg("bd", "bunny",1);
        System.out.println(bd.breed);
        System.out.println(bd.Name);
        System.out.println(bd.age);

    }

}
