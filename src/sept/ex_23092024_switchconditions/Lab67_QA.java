package sept.ex_23092024_switchconditions;

public class Lab67_QA {

    public static void main(String[] args) {
        int itemcode=001;

        switch (itemcode)
        {
            case 001 -> System.out.println("its a laptop");
            case 002 -> System.out.println("its a desktop");
            case 003,004,005 -> System.out.println("Its a mobile");
            default -> System.out.println("we r running new way of switch");
        }
    }
}
