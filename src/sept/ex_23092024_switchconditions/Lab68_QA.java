package sept.ex_23092024_switchconditions;

public class Lab68_QA {

    public static void main(String[] args) {
    int a = 11;

    //this questn confuses you by providing variable "a" but
        // in the switch arguement can be anything.

    switch(-1) {

        default:
            System.out.println("default");

        case -1:
            System.out.println("10");
            break;
        case 9:
            System.out.println("no match");
            break;



    }
    }
}
