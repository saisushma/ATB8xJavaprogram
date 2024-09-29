package sept.ex_23092024_switchconditions;

public class Lab62_switch {
    public static void main(String[] args) {

        //switch condition
        //day 1  - 7 -> 1 mon, 2 tues .... 7 - sun
        int day = 1;
        switch (day)
        {
            case 1 :
                System.out.println("mon");
                break;
            case 2 :
                System.out.println("Tues");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thu");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default :
                System.out.println("No idea, what day it is");

        }
        System.out.println("End of the loop");
    }
}
