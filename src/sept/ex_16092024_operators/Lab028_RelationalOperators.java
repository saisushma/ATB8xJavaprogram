package sept.ex_16092024_operators;

public class Lab028_RelationalOperators {
    public static void main(String[] args) {

        //relational operators - boolean
        //>,<,>= , <= , != , ! -> true/false

        int a = 10;
        int b = 20;
        boolean c = a > b;
        System.out.println(c);

        int age_m1 =  34;
        int age_p1 = 34;

        boolean res = age_p1>age_m1 ; //false
        boolean res1 = age_p1>=age_m1; //true as it has 2 condtns like greator or equal to

        System.out.println(res);
        System.out.println(res1);
    }
}
