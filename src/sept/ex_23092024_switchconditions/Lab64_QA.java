package sept.ex_23092024_switchconditions;

public class Lab64_QA {

    public static void main(String[] args) {

        int a = 10; //valid
        char ch = 'A'; //valid
        Boolean b = true; //cannot be used as we dont support boolean in the switch
        long a11 = 30l; //valid with typecasting
        switch((int)a11)
        {

        }
    }
}
