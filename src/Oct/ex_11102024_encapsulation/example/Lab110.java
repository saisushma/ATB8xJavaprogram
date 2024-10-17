package Oct.ex_11102024_encapsulation.example;

public class Lab110 {
    public static void main(String[] args) {

        ICICIBank amit = new ICICIBank("amit",100);
        //amit.
      //  amit.setBal(1000);
        boolean are_you_Admin = true;
        ICICIBank admin = new ICICIBank("admin",10000);
        admin.setBal(10000,true);
    }
}
