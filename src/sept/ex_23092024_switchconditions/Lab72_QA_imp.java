package sept.ex_23092024_switchconditions;

public class Lab72_QA_imp {
    public static void main(String[] args) {

        //concation is allowed in the switch
        char c = 'C';
        switch (c) {

            case 'A'+1:
                System.out.println("B");
                break;
            case 'A'+2:
                System.out.println("C");
                break;
            case 'A':
                System.out.println("A");
                break;

        }
    }
}
