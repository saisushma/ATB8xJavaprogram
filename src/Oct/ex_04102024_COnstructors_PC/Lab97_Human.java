package Oct.ex_04102024_COnstructors_PC;

public class Lab97_Human
{
    public static void main(String[] args) {
        Lab96_AIHuman amit = new Lab96_AIHuman();
        Lab96_AIHuman pramod = new Lab96_AIHuman("pramod");
        Lab96_AIHuman am1 = new Lab96_AIHuman("am1");

        new Lab96_AIHuman();
        System.out.println(amit.planet);
        System.out.println(pramod.planet);
        System.out.println(am1.name);
        System.out.println(pramod.name);

    }
}
