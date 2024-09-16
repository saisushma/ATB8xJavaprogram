package sept.ex_16092024_operators;

public class Lab31_QA {

    public static void main(String[] args) {

        boolean a = true;

        System.out.println(!a);
        System.out.println(!!!!(30>90));
        //even times ! will cancel each other
       //  System.out.println((30>90)!); ending not will not be accepted


        int a1 = 12;
        boolean b = !(a1>10 || a1< 5);
        //BODMAS

        //Bracker of Division, multipication, addition & subtraction

        System.out.println(b);


    }
}
