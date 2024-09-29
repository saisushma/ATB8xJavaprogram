package sept.ex_23092024_switchconditions;

public class Lab63_switchwithoutBreak {
    public static void main(String[] args) {

        //switch condition without break condtn
        //day 1  - 7 -> 1 mon, 2 tues .... 7 - sun
        int day = 1;
        switch (day)
        {
            case 1 :
                System.out.println("mon");
            case 2 :
                System.out.println("Tues");
            case 3 :
                System.out.println("Wed");
            case 4 :
                System.out.println("Thu");
            case 5 :
                System.out.println("Friday");

            case 6 :
                System.out.println("Sat");
            case 7 :
                System.out.println("Sun");
            default :
                System.out.println("No idea, what day it is");

        }
        System.out.println("End of the loop");
    }
}
