package Oct.ex_04102024_COnstructors_PC;

public class Practice_main {

    public static void main(String[] args) {

        Practice_Ahuman pm = new Practice_Ahuman();
        new Practice_Ahuman();
        Practice_Ahuman pm1  = new Practice_Ahuman("sai");
        Practice_Ahuman vijay = new Practice_Ahuman("vijay");

        System.out.println(pm.planet);
        System.out.println(pm1.name);
        System.out.println(vijay.name);

    }
}
