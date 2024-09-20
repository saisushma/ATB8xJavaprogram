package sept.ex_20092024_conditions;

public class Lab52_ifLoop {

    public static void main(String[] args) {

        boolean a = true;
         a= !a;
        if(2+2 < 4){
            System.out.println("inside loop ");
            // this loop doesnt even enter inside this loop as there is no else loop
        }
            System.out.println("outside - > " +a);
    }
}
