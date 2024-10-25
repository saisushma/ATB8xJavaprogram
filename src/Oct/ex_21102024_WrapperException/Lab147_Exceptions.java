package Oct.ex_21102024_WrapperException;

public class Lab147_Exceptions {
    public static void main(String[] args) {

        int c = 0;
        try {
             c = 10/c;  // java.lang.ArithmeticException - terminated
            System.out.println(c);
        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
