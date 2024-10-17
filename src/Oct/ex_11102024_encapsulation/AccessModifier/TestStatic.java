package Oct.ex_11102024_encapsulation.AccessModifier;

public class TestStatic {

    public String fname = "sai";

    static String s_name = "sushma";

    public String getName(){

        return fname+s_name;
    }

    static String firstName;
    static String secondName;

    static String getFullName(){

        return firstName+secondName;
    }

    public static void main(String[] args) {

        TestStatic ts = new TestStatic();
        System.out.println(ts.getName());

     TestStatic ts1 = new TestStatic();
     TestStatic.firstName="ssv";
     TestStatic.secondName="sarath chandra";

     TestStatic ts2 = new TestStatic();
     

        System.out.println(TestStatic.getFullName());
    }

}
