package sept.ex_23092024_switchconditions;

public class Lab65_QA {

    public static void main(String[] args) {


    int itemcode = 006;

    switch(itemcode) {

        case 001,002,005:
            System.out.println("all of them are electornic gadgets");
            break;
        case 004,003,0006:
            System.out.println("this is a mech");
            break;
        default:
            System.out.println("none");


    }
    }
}
